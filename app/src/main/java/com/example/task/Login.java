package com.example.task;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.task.pojo.User;
import com.example.task.ui.main.PostViewModel;

public class Login extends AppCompatActivity {
    PostViewModel postViewModel ;
     EditText usermail ,userpass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        usermail= findViewById(R.id.login_userEmail);
        userpass= findViewById(R.id.login_userPass);



    }

    public void login (View view) {
//
        String email = usermail.getText().toString();
        String pass = userpass.getText().toString();

        if (pass.isEmpty()){
            userpass.setError("Password is required");
            userpass.requestFocus();
        }

        if (email.isEmpty()){
            usermail.setError("Email is required");
            usermail.requestFocus();
        }

        User user = new User(email,pass);
        postViewModel = ViewModelProviders.of(this).get(PostViewModel.class);
        postViewModel.Login(this ,user );

    }

    public void createUser(View view) {

        Intent i = new Intent(this ,signup.class);
        startActivity(i);
        finish();

    }
}