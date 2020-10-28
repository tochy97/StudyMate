package com.example.studymate;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.studymate.utilities.Bottom_Navigation_Helper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class home extends AppCompatActivity {

    private static final String TAG = "home";
    
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: Starting.");

        setupbottomnavview();

    }
    private void setupbottomnavview() {
        Log.d(TAG, "setupbottomnavview: setting up layout_bottom_navigation_view.");
        BottomNavigationViewEx bnvex = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        Bottom_Navigation_Helper.setupbottomnavview(bnvex);
    }
}
