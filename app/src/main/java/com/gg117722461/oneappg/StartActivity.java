package com.gg117722461.oneappg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/*All below code from https://www.youtube.com/watch?v=5VPEvKhShK8&list=PLKETiCsEsH0qoTj0-ZAO-knfhNPRUJzVx&index=1 (https://github.com/developersamuelakram/MyChatApp)*/

public class StartActivity extends AppCompatActivity {

    Button login, register;

    FirebaseUser user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);




        //cast the views
        login = findViewById(R.id.loginBtn);
        register = findViewById(R.id.registerbtn);

        //redirecting to respective activities
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(StartActivity.this, LoginActivity.class));
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(StartActivity.this, RegisterActivity.class));
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

        user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null) {

            startActivity(new Intent(StartActivity.this, MainActivity.class));
        }
    }
}