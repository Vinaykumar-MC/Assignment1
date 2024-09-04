
package com.example.assignment1.view_activity;

import static org.apache.commons.collections4.CollectionUtils.isNotEmpty;
import static java.util.Objects.isNull;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.assignment1.R;
import com.example.assignment1.adapter.BookmarkAdapter;
import com.example.assignment1.adapter.JobsAdapter;
import com.example.assignment1.common.Resource;
import com.example.assignment1.common.model.Result;
import com.example.assignment1.databinding.JobListLayoutBinding;
import com.example.assignment1.db.JobEntity;
import com.example.assignment1.viewmodel.JobViewModel;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding4.material.RxTabLayout;
import com.jakewharton.rxbinding4.material.TabLayoutSelectionEvent;
import com.l4digital.fastscroll.FastScrollRecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.subjects.PublishSubject;

public class MainActivity extends AppCompatActivity implements JobsAdapter.Listener, BookmarkAdapter.Listener {
    JobListLayoutBinding activityMainBinding;
    JobViewModel jobViewModel;
    private FastScrollRecyclerView jobRecyclerView;
    private JobsAdapter jobsAdapter;
    CompositeDisposable compositeDisposable;
    private int pageCount=1;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable1;
    private Observer<Resource<List<Result>>> jobsListObserver;
    private Observer<Resource<List<JobEntity>>> bookmarkedJobsListObserver;

        private RecyclerView.OnScrollListener recyclerScrollListener;
        private RecyclerView bookedRv;
        private BookmarkAdapter bookmarkAdapter;



        private static final DiffUtil.ItemCallback<Result> ITEM_CALLBACK=new DiffUtil.ItemCallback<Result>() {
            @Override
            public boolean areItemsTheSame(@NonNull Result oldItem, @NonNull Result newItem) {
                return Objects.equals(oldItem.getId(),newItem.getId());
            }

            @SuppressLint("DiffUtilEquals")
            @Override
            public boolean areContentsTheSame(@NonNull Result oldItem, @NonNull Result newItem) {
                return oldItem.equals(newItem);
            }
        };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            activityMainBinding = DataBindingUtil.setContentView(MainActivity.this, R.layout.job_list_layout);
            activityMainBinding.setLifecycleOwner(MainActivity.this);
            compositeDisposable = new CompositeDisposable();
            compositeDisposable1 = new io.reactivex.disposables.CompositeDisposable();
            initJobsUi();
            setupDisplayObservers();
            setOnClickListener();
        }


        @Override
        protected void onStart() {
            super.onStart();
            pageCount=1;
            getJobs();
        }

        @Override
        protected void onResume() {
            super.onResume();
        }

        public void initJobsUi(){

            jobViewModel=new ViewModelProvider(MainActivity.this).get(JobViewModel.class);
            jobRecyclerView = activityMainBinding.jobsRv;
            jobRecyclerView.setBubbleTextSize(15);
            bookedRv = activityMainBinding.bookmarkedRv;
            LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
            bookedRv.setLayoutManager(layoutManager);
            bookmarkAdapter = new BookmarkAdapter(this,this);
            bookedRv.setAdapter(bookmarkAdapter);
            activityMainBinding.topBar.headLine.setText("Find My Job");

            loadSoRecyclerView();
        }

        private void getJobs() {
            loadSoRecyclerView();
            getPagedJobs();
        }
        private void getPagedJobs()
        {
            jobViewModel.fetchJobs(pageCount++);
        }
        private void loadSoRecyclerView() {
            LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
            jobsAdapter = new JobsAdapter(ITEM_CALLBACK,MainActivity.this,this);
            if(isNull(recyclerScrollListener))
            {
                PublishSubject<Boolean> publishSubject = PublishSubject.create();
                recyclerScrollListener = new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                        super.onScrollStateChanged(recyclerView, newState);
                        if(!recyclerView.canScrollVertically(1)&&(recyclerView.canScrollVertically(-1))&&(newState==RecyclerView.SCROLL_STATE_IDLE))
                        {
                            publishSubject.onNext(true);
                        }
                    }

                    @Override
                    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                        super.onScrolled(recyclerView, dx, dy);
                    }
                };
                Disposable disposable =publishSubject
                        .throttleFirst(500, TimeUnit.MILLISECONDS)
                        .subscribe(aBoolean -> {
                            getPagedJobs();
                        });
                compositeDisposable1.add(disposable);
                jobRecyclerView.addOnScrollListener(recyclerScrollListener);
            }
            jobRecyclerView.setLayoutManager(layoutManager);
            jobRecyclerView.setAdapter(jobsAdapter);

        }

        public void setupDisplayObservers(){
            if (isNull(jobsListObserver)){
                jobsListObserver = new Observer<Resource<List<Result>>>() {
                    @Override
                    public void onChanged(Resource<List<Result>> listResource) {
                        switch (listResource.status){
                            case SUCCESS:
                                if (isNotEmpty(listResource.data)){
                                    jobsAdapter.swapDatas(listResource.data);
                                }else{
                                    Toast.makeText(MainActivity.this,"No records to show",Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case LOADING:
                            case ERROR:
                                Toast.makeText(MainActivity.this,"Something went wrong try again later",Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                };
                jobViewModel.getJobs().observe(this,jobsListObserver);
            }
            if (isNull(bookmarkedJobsListObserver)){
                bookmarkedJobsListObserver = new Observer<Resource<List<JobEntity>>>() {
                    @Override
                    public void onChanged(Resource<List<JobEntity>> listResource) {
                        switch (listResource.status){
                            case SUCCESS:
                                if (isNotEmpty(listResource.data)){
                                    bookmarkAdapter.setdata(listResource.data);
                                }else{
                                    bookmarkAdapter.setdata(new ArrayList<>());
                                    Toast.makeText(MainActivity.this,"No records to show",Toast.LENGTH_SHORT).show();
                                }
                                break;
                            case LOADING:
                            case ERROR:
                                Toast.makeText(MainActivity.this,"Something went wrong try again later",Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                };
                jobViewModel.getBookmarkedJobs().observe(this,bookmarkedJobsListObserver);
            }
        }
        private void clearItemsFromAdapter()
        {
            List<Result> joblist=new ArrayList<>();
            jobsAdapter.swapDatas(joblist);
            jobsAdapter.notifyDataSetChanged();
        }
    private void setOnClickListener(){
        compositeDisposable.add( RxTabLayout.selectionEvents(activityMainBinding.tabLayoutJobType)
                        .subscribe(this::handleTabSelection));
        activityMainBinding.txtList.setOnClickListener(click->{
jobViewModel.getbookData();
        });
        }
    private void handleTabSelection(TabLayoutSelectionEvent tabLayoutSelectionSelectedEvent){
        switch (tabLayoutSelectionSelectedEvent.getTab().getContentDescription().toString().toUpperCase()){
            case "JOBS":
                activityMainBinding.txtList.setText("Jobs List");
                activityMainBinding.jobsRv.setVisibility(View.VISIBLE);
                activityMainBinding.bookmarkedRv.setVisibility(View.GONE);
                break;
            case "BOOKMARKS":
                activityMainBinding.txtList.setText("Bookmarked List");
                activityMainBinding.jobsRv.setVisibility(View.GONE);
                activityMainBinding.bookmarkedRv.setVisibility(View.VISIBLE);
                jobViewModel.getBookMarks();
                break;
        }
    }


    @Override
    public void getIsBookMarked(Boolean isBooke,Result result) {
            if (!isBooke){
                jobViewModel.fetchBookMarks(result,null);
            }else{
                jobViewModel.setBookMark(result);
            }
    }

    @Override
    public void getIsBookMarked(Boolean isBooke, JobEntity result) {
        if (!isBooke){
            jobViewModel.fetchBookMarks(null,result);

        }
    }
}
