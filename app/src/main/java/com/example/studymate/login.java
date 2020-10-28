package com.example.studymate;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    private static final String TAG = "login";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bottom_navigation_view);
        Log.d(TAG, "onCreate: Starting.");

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressbar);
        final TextView textView = (TextView) findViewById(R.id.load);
        Button btn_login = (Button) findViewById(R.id.btn_login);
/*
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
            }
        });*/

    }
}
