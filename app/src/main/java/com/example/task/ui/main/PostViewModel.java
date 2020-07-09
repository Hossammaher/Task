package com.example.task.ui.main;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.task.Api.ClientApi;
import com.example.task.pojo.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostViewModel extends ViewModel {


    MutableLiveData <User> listMutableLiveData = new MutableLiveData<>() ;

    MutableLiveData<String> posts = new MutableLiveData<>();



    public void CreateUser (final Context context , User user){

        ClientApi.getInstance().CreateUser(user).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()){
                    Toast.makeText(context, "OK", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(context, "wrong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(context, "failed", Toast.LENGTH_SHORT).show();
            }

        });
    }


    public void Login (final Context context , User user){

        ClientApi.getInstance().Login(user).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                if (response.isSuccessful()){
                    Toast.makeText(context, "OK", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(context, "wrong", Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

                Toast.makeText(context, "failed", Toast.LENGTH_SHORT).show();

            }
        });


    }

}
