package com.example.assignment1.view_activity;

import static org.apache.commons.lang3.StringUtils.isNotBlank;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.assignment1.R;
import com.example.assignment1.databinding.JobDetailsLayoutBinding;

public class JobDetailsActivity extends AppCompatActivity{


    private JobDetailsLayoutBinding jobDetailsLayoutBinding;
    private String title;
    private String company;
    private String location;
    private String salary;
    private String Qualification;
    private String experience;
    private String contact;
    private String jobDiscription;






    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jobDetailsLayoutBinding = DataBindingUtil.setContentView(JobDetailsActivity.this, R.layout.job_details_layout);
        jobDetailsLayoutBinding.setLifecycleOwner(JobDetailsActivity.this);
        getActivityIntent();
        initUi();
    }

    private void getActivityIntent() {

        Intent intent = getIntent();

        // Check if each extra exists before retrieving it
        if (getIntent().hasExtra("title")) {
             title = intent.getStringExtra("title");
        }

        if (getIntent().hasExtra("company")) {
             company = intent.getStringExtra("company");
        }

        if (getIntent().hasExtra("location")) {
             location = intent.getStringExtra("location");
        }

        if (getIntent().hasExtra("salary")) {
             salary = intent.getStringExtra("salary");}

        if (getIntent().hasExtra("exp")) {
             experience = intent.getStringExtra("exp");
        }

        if (getIntent().hasExtra("contact")) {
             contact = intent.getStringExtra("contact");
        }

        if (getIntent().hasExtra("Qualification")) {
             Qualification = intent.getStringExtra("Qualification");
        }    }

    private void initUi() {
            jobDetailsLayoutBinding.topBar.headLine.setText("Find My Job");
            jobDetailsLayoutBinding.jobDisrp.setText(title);
            jobDetailsLayoutBinding.txtCompanyName.setText(company);
            jobDetailsLayoutBinding.txtLocation.setText(location);
            if (isNotBlank(salary)){
                jobDetailsLayoutBinding.txtSalary.setText(salary);
            }
            else{
                jobDetailsLayoutBinding.txtSalary.setText("Not Disclosed");
            }
            String [] arr = contact.split(":",2);
            if (arr.length>1){
                jobDetailsLayoutBinding.txtcontact.setText(arr[1]);
            }else jobDetailsLayoutBinding.txtcontact.setText(" ");

            jobDetailsLayoutBinding.txtExperience.setText(experience);
            jobDetailsLayoutBinding.txtQualification.setText(Qualification);
            jobDetailsLayoutBinding.topBar.imgBack.setOnClickListener(click->{
                onBackPressed();
            });
        }


    }
