package com.example.task;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.task.pojo.User;
import com.example.task.ui.main.PostViewModel;

public class signup extends AppCompatActivity {

    PostViewModel postViewModel ;
    EditText userName , userPass , userEmail,userPhone ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        userName=findViewById(R.id.userName);
        userPass=findViewById(R.id.userPassword);
        userEmail=findViewById(R.id.userEmail);
        userPhone=findViewById(R.id.userPhone);




    }



    public void signup_btn(View view) {
        String name = userName.getText().toString().trim();
        String pass = userPass.getText().toString().trim();
        String email = userEmail.getText().toString().trim();
        String phone = userPhone.getText().toString().trim();

        if (name.isEmpty()){
            userName.setError("name is required");
            userName.requestFocus();
        }

        if (pass.isEmpty()){
            userPass.setError("Password is required");
            userPass.requestFocus();
        }

        if (email.isEmpty()){
            userEmail.setError("Email is required");
            userEmail.requestFocus();
        }

        if (phone.isEmpty()){
            userPhone.setError("Phone is required");
            userPhone.requestFocus();
        }

        if (pass.length()<6){
            userPass.setError("password should be at least 6 charcter");
            userPass.requestFocus();
        }

        User user = new User(name,pass,email,phone,"123456","eg");

        postViewModel = ViewModelProviders.of(this).get(PostViewModel.class);
        postViewModel.CreateUser(this ,user );
    }

    public void signIn(View view) {

        Intent i = new Intent(this ,Login.class);
        startActivity(i);
        finish();


    }
}
