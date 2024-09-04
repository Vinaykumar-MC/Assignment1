package com.example.assignment1.adapter;

import static java.util.Objects.nonNull;
import static java.util.Optional.ofNullable;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment1.R;
import com.example.assignment1.databinding.JobCardItemBinding;
import com.example.assignment1.db.JobEntity;
import com.example.assignment1.view_activity.JobDetailsActivity;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.List;


public class BookmarkAdapter extends RecyclerView.Adapter<BookmarkAdapter.BookedViewHolder>{
    private Context context;
    private List<JobEntity> bookedList = new ArrayList<>();
    private Listener listener;

    public BookmarkAdapter(Context context,Listener listener) {
        this.context = context;
        this.listener = listener;
    }
    public void setdata(List<JobEntity> dataList){
        this.bookedList = dataList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BookedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        JobCardItemBinding itemJobCard =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        com.example.assignment1.R.layout.job_card_item,parent,false);
        itemJobCard.setLifecycleOwner((LifecycleOwner)context);
        return new BookedViewHolder(itemJobCard);
    }

    @Override
    public void onBindViewHolder(@NonNull BookedViewHolder holder, int position) {
        JobEntity result = bookedList.get(position);
        holder.title.setText(result.getResult().getJobRole());
        holder.location.setText(result.getResult().getJobLocationSlug());
        if (nonNull(result.getResult().getPrimaryDetails()) && nonNull(result.getResult().getPrimaryDetails().getSalary())){
            holder.salary.setText(result.getResult().getPrimaryDetails().getSalary());
        }
        else{
            holder.salary.setText("Not Disclosed");
        }
        if (nonNull(result.getResult().getCustomLink())){
            String [] contact = result.getResult().getCustomLink().split(":",2);
            if (contact.length>1){
                holder.phone.setText(contact[1]);
            }
        }
        if (result.getResult().isIsBookmarked()){
            holder.bookmark.setImageResource(R.drawable.bookmark_marked);
        }

        holder.jobCard.setOnClickListener(click->{
            Intent intent = new Intent(context, JobDetailsActivity.class);
            intent.putExtra("title",ofNullable(result.getResult().getTitle()).orElse(""));
            intent.putExtra("company",ofNullable(result.getResult().getCompanyName()).orElse(""));
            intent.putExtra("location",ofNullable(result.getResult().getJobLocationSlug()).orElse(""));
            if (nonNull(result.getResult().getPrimaryDetails())){
                if (nonNull(result.getResult().getPrimaryDetails().getSalary())){
                    intent.putExtra("salary",result.getResult().getPrimaryDetails().getSalary());
                }else intent.putExtra("salary"," ");
                if (nonNull(result.getResult().getPrimaryDetails().getExperience())){
                    intent.putExtra("exp",result.getResult().getPrimaryDetails().getExperience());
                }else intent.putExtra("exp"," ");
                if (nonNull(result.getResult().getPrimaryDetails().getQualification())){

                    intent.putExtra("Qualification",result.getResult().getPrimaryDetails().getQualification());
                }else intent.putExtra("Qualification"," ");

            }else {
                intent.putExtra("salary"," ");
                intent.putExtra("exp"," ");
                intent.putExtra("Qualification"," ");
            }
            intent.putExtra("contact",ofNullable(result.getResult().getCustomLink()).orElse(""));
            context.startActivity(intent);

        });
        holder.bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getResult().isIsBookmarked()){
                    result.getResult().setIsBookmarked(false);
                    holder.bookmark.setImageResource(R.drawable.bookmark_open);
                    if (nonNull(listener)){
                        listener.getIsBookMarked(result.getResult().isIsBookmarked(),result);
                    }
                }else{
                    result.getResult().setIsBookmarked(true);
                    holder.bookmark.setImageResource(R.drawable.bookmark_marked);
                    if (nonNull(listener)){
                        listener.getIsBookMarked(result.getResult().isIsBookmarked(),result);
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return bookedList.size();
    }

    public class BookedViewHolder extends RecyclerView.ViewHolder{
        private final MaterialTextView title,location,salary,phone;
        private final MaterialCardView jobCard;
        private final JobCardItemBinding itemBinding;
        private final ShapeableImageView bookmark;

        public BookedViewHolder(@NonNull JobCardItemBinding jobCardItemBinding) {
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
        public void getIsBookMarked(Boolean isBooke, JobEntity result);
    }
}
