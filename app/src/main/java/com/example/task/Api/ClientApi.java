package com.example.task.Api;


import com.example.task.pojo.User;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClientApi {


    private static String BASE_URL = "https://www.manzeli.net/api/";
    private static ClientApi Instance;
    ApiInterface apiInterface ;
    ClientApi clientApi ;

    public ClientApi() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);


    }

    public static ClientApi getInstance() {

        if(Instance == null){

            Instance = new ClientApi();

        }

        return Instance;
    }


    public Call<User> CreateUser (User user){
        return apiInterface.CreateUser(user);
    }


    public Call<User> Login (User user){
        return apiInterface.Login(user);
    }

}
