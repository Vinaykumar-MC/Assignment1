package com.example.assignment1.adapter;

import static java.util.Objects.nonNull;
import static java.util.Optional.ofNullable;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment1.R;
import com.example.assignment1.common.model.Result;
import com.example.assignment1.databinding.JobCardItemBinding;
import com.example.assignment1.db.JobDao;
import com.example.assignment1.db.JobDataBase;
import com.example.assignment1.view_activity.JobDetailsActivity;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.l4digital.fastscroll.FastScroller;

import java.util.ArrayList;
import java.util.List;


public class JobsAdapter  extends ListAdapter<Result,JobsAdapter.JobsViewHolderV2> implements FastScroller.SectionIndexer{

        private Context context;
        private List<Result> jobsList = new ArrayList<>();

        private JobDao dao;
        private Listener listener;
        private SharedPreferences jobSharedPreference;

        public JobsAdapter(@NonNull DiffUtil.ItemCallback<Result> jobsCallBack, Context context,Listener listener) {
            super(jobsCallBack);
            this.context = context;
            this.listener = listener;
            dao = JobDataBase.getDatabase(context).getJobDao();
        }
        public void swapDatas(List<Result> jobsList) {
            List<Result> submitList =new ArrayList<>(getCurrentList());
            submitList.addAll(jobsList);
            submitList(submitList);
        }

        @NonNull
        @Override
        public JobsViewHolderV2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            JobCardItemBinding itemJobCard =
                    DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                            com.example.assignment1.R.layout.job_card_item,parent,false);
            itemJobCard.setLifecycleOwner((LifecycleOwner)context);
            return new JobsViewHolderV2(itemJobCard);
        }

    @Override
    public void onBindViewHolder(@NonNull JobsViewHolderV2 holder, int position) {
            Result result = getItem(position);
        holder.title.setText(result.getJobRole());
        holder.location.setText(result.getJobLocationSlug());
        if (nonNull(result.getPrimaryDetails()) && nonNull(result.getPrimaryDetails().getSalary())){
            holder.salary.setText(result.getPrimaryDetails().getSalary());
        }
        else{
            holder.salary.setText("Not Disclosed");
        }
        if (nonNull(result.getCustomLink())){
            String [] contact = result.getCustomLink().split(":",2);
            if (contact.length>1){
                holder.phone.setText(contact[1]);
            }
        }

        if (result.isIsBookmarked()){
            holder.bookmark.setImageResource(R.drawable.bookmark_marked);
        }

        holder.jobCard.setOnClickListener(click->{
            Intent intent = new Intent(context, JobDetailsActivity.class);
            intent.putExtra("title",ofNullable(result.getTitle()).orElse(""));
            intent.putExtra("company",ofNullable(result.getCompanyName()).orElse(""));
            intent.putExtra("location",ofNullable(result.getJobLocationSlug()).orElse(""));
            if (nonNull(result.getPrimaryDetails())){
                if (nonNull(result.getPrimaryDetails().getSalary())){
                    intent.putExtra("salary",result.getPrimaryDetails().getSalary());
                }else intent.putExtra("salary"," ");
                if (nonNull(result.getPrimaryDetails().getExperience())){
                    intent.putExtra("exp",result.getPrimaryDetails().getExperience());
                }else intent.putExtra("exp"," ");
                if (nonNull(result.getPrimaryDetails().getQualification())){
                    intent.putExtra("Qualification",result.getPrimaryDetails().getQualification());
                }else intent.putExtra("Qualification"," ");

            }else {
                intent.putExtra("salary"," ");
                intent.putExtra("exp"," ");
                intent.putExtra("Qualification"," ");
            }

            intent.putExtra("contact",ofNullable(result.getCustomLink()).orElse(""));
            context.startActivity(intent);
        });
        holder.bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.isIsBookmarked()){
                    result.setIsBookmarked(false);
                    holder.bookmark.setImageResource(R.drawable.bookmark_open);
                    if (nonNull(listener)){
                        listener.getIsBookMarked(result.isIsBookmarked(),result);
                    }
                }else{
                    result.setIsBookmarked(true);
                    holder.bookmark.setImageResource(R.drawable.bookmark_marked);
                    if (nonNull(listener)){
                        listener.getIsBookMarked(result.isIsBookmarked(),result);
                    }
                }
            }
        });

    }
    private void updateBookmarkImage(ShapeableImageView bookmark, boolean isBookmarked) {
    }

    @Override
    public CharSequence getSectionText(int position) {
        return "";
    }


    public class JobsViewHolderV2 extends RecyclerView.ViewHolder{

            private final MaterialTextView title,location,salary,phone;
            private final MaterialCardView jobCard;
            private final JobCardItemBinding itemBinding;
            private final ShapeableImageView bookmark;

            public JobsViewHolderV2(@NonNull JobCardItemBinding jobCardItemBinding) {
                super(jobCardItemBinding.getRoot());
                this.itemBinding = jobCardItemBinding;
                title = jobCardItemBinding.title;
                location = jobCardItemBinding.txtLocation;
                salary = jobCardItemBinding.salary;
                phone = jobCardItemBinding.contact;
                jobCard = jobCardItemBinding.itemCard;
                bookmark = jobCardItemBinding.imgBookmark;
            }
        }
        public interface Listener{
            public void getIsBookMarked(Boolean isBooke,Result result);
        }
    }
