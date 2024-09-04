package com.example.assignment1.viewmodel;

import static org.apache.commons.collections4.CollectionUtils.isNotEmpty;
import static java.util.Objects.nonNull;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.assignment1.common.Resource;
import com.example.assignment1.common.model.Result;
import com.example.assignment1.db.JobDao;
import com.example.assignment1.db.JobDataBase;
import com.example.assignment1.db.JobEntity;
import com.example.assignment1.repository.JobRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class JobViewModel extends AndroidViewModel {
    private JobRepository jobRepository;
    private CompositeDisposable compositeDisposable;
    private MutableLiveData<Resource<List<Result>>> jobsMutableData = new MutableLiveData<>();
    private MutableLiveData<Resource<List<JobEntity>>> bookmarkedJobsMutableData = new MutableLiveData<>();
    private MutableLiveData<Resource<List<JobEntity>>> bookmarkedJobs = new MutableLiveData<>();
    private JobDao dao;
    private List<JobEntity> allBookMarkedList = new ArrayList<>();
    public JobViewModel(@NonNull Application application) {
        super(application);
        jobRepository =new JobRepository(application.getApplicationContext());
        compositeDisposable = new CompositeDisposable();
        dao = JobDataBase.getDatabase(getApplication().getApplicationContext()).getJobDao();
    }

    public LiveData<Resource<List<Result>>> getJobs(){
        return jobsMutableData;
    }
    public void  fetchJobs (int pageNo){
        Disposable disposable = jobRepository.fetchJobs(pageNo)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(jobs ->{
                    if (nonNull(jobs.data) && isNotEmpty(jobs.data.getResults())){
                        jobsMutableData.postValue(Resource.success(jobs.data.getResults()));
                    }
                    else{

                    }
                },error->{
                    jobsMutableData.postValue(Resource.error("Something went wrong ",null));
                });
        compositeDisposable.add(disposable);
    }
   public void getbookData(){
        Disposable disposable = Single.just(1)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(u->{
                    int count =  dao.getBookmarkedCount();


                });

   }
   public LiveData<Resource<List<JobEntity>>> getBookmarkedJobs(){
        return bookmarkedJobsMutableData;
   }
    public void getBookMarks(){
        Disposable disposable = dao.getAllBookmarks()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(sa->{
                    bookmarkedJobsMutableData.postValue(Resource.success(sa));
                },err->{
                    bookmarkedJobsMutableData.postValue(Resource.error(err.getLocalizedMessage(),null));
                });
        compositeDisposable.add(disposable);
    }
    public void fetchBookMarks(Result result,JobEntity jobEntity){
        Disposable disposable = dao.getAllBookmarks()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(sa->{
                    if (isNotEmpty(sa)){
                        if (nonNull(result)){
                            sa.forEach(s->{
                                if (Objects.equals(s.getId(),result.getId())){
                                    dao.deleteJobById(s.getId());
                                    getBookMarks();
                                }
                            });
                        }else{
                                    dao.deleteJobById(jobEntity.getId());
                        }
                        getBookMarks();
                    }
                },err->{
                    bookmarkedJobsMutableData.postValue(Resource.error(err.getLocalizedMessage(),null));
                });
        compositeDisposable.add(disposable);
    }
   public void setBookMark(Result result){
       Disposable disposable = Single.just(1)
               .subscribeOn(Schedulers.io())
               .observeOn(Schedulers.io())
               .subscribe(u->{
                   JobEntity j = new JobEntity();
                   j.setResult(result);
                   dao.insert(j);
               });
   }

    public List<JobEntity> getAllBookMarkedList() {
        return allBookMarkedList;
    }

    public void setAllBookMarkedList(List<JobEntity> allBookMarkedList) {
        this.allBookMarkedList = allBookMarkedList;
    }
}
