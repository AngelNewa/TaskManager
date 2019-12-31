package com.example.taskmanager.api;

import com.example.taskmanager.model.Users;
import com.example.taskmanager.serverresponse.SignupResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UsersAPI {

    @POST ("users/signup")
    Call<SignupResponse> registerUser(@Body Users users);

    @FormUrlEncoded
    @POST ("users/login")
    Call<SignupResponse> checkUser(@Field("username") String username, String username,)

}
