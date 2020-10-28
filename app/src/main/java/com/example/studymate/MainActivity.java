package com.example.studymate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting.");

        Button login_Nav = (Button) findViewById(R.id.btn_login_redirect); // button to redirect to login activity
        Button signup_Nav = (Button) findViewById(R.id.btn_signup_redirect); // button to redirect to signup activity

        // function to link button to login activity
        login_Nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "OnClick: Cliked login_Nav.");

                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);

            }
        });

        // function to link button to signup activity
        signup_Nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "OnClick: Cliked signup_Nav.");

                Intent intent = new Intent(MainActivity.this, signup.class);
                startActivity(intent);

            }
        });

    }
}