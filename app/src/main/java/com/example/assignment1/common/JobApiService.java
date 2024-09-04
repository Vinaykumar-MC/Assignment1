package com.example.assignment1.common;

import com.example.assignment1.common.model.Example;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JobApiService {
    @GET("common/jobs")
    Call<Example> getJobs(@Query("page") int page);
}
