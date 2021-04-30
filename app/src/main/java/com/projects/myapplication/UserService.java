package com.projects.myapplication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("testData/")
    Call<myResponse> saveDetail(@Body myRequest myreq);
}
