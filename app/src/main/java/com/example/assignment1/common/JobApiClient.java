package com.example.assignment1.common;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JobApiClient {
    private static final String BASE_URL = "https://testapi.getlokalapp.com/";
    public Retrofit retrofit;

    public JobApiClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public JobApiService createService() {
        return retrofit.create(JobApiService.class);
    }
}
