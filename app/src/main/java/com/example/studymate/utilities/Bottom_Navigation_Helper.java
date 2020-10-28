package com.example.studymate.utilities;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class Bottom_Navigation_Helper {
    private static final String TAG = "Bottom_Navigation_Helpe";

    public static void setupbottomnavview(BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "setupbottomnavview: Setting up Bottom Navigation View");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }


}
