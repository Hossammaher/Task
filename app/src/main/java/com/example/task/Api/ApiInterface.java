package com.example.task.Api;


import com.example.task.pojo.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface ApiInterface {


   @POST("account/Signup")
   Call<User>CreateUser(@Body User user) ;

   @POST("account/Authenticate")
   Call<User>Login(@Body User user) ;

}
