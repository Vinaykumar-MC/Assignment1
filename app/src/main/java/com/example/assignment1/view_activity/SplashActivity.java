package com.example.assignment1.view_activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.assignment1.R;
import com.example.assignment1.databinding.SplashBinding;

public class SplashActivity extends AppCompatActivity {

    private SplashBinding splashBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashBinding = DataBindingUtil.setContentView(SplashActivity.this, R.layout.splash);
        splashBinding.setLifecycleOwner(SplashActivity.this);
        callMainActivity();
    }

    private void callMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
