package com.example.assignment1.repository;

import android.content.Context;
import com.example.assignment1.common.JobApiClient;
import com.example.assignment1.common.JobApiService;
import com.example.assignment1.common.Resource;
import com.example.assignment1.common.model.Example;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JobRepository  {

    public JobRepository(Context context){

    }

    public Observable<Resource<Example>> fetchJobs(int pageNo) {
        return Observable.fromPublisher(emitter -> {
            final JobApiClient api = new JobApiClient();

            Call<Example> call = api.retrofit.create(JobApiService.class).getJobs(pageNo);


            call.enqueue(new Callback<Example>() {
                @Override
                public void onResponse(Call<Example> call, Response<Example> response) {
                    if (response != null && response.isSuccessful()) {
                        emitter.onNext(Resource.success(response.body()));
                    } else {
                        emitter.onNext(Resource.error("No records found", null));
                    }
                    emitter.onComplete();
                }

                @Override
                public void onFailure(Call<Example> call, Throwable t) {
                    emitter.onNext(Resource.error("Failed to fetch location data", null));
                    emitter.onComplete();
                }
            });
        });
    }
}
