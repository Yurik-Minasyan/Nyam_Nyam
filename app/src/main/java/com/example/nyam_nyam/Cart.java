package com.example.nyam_nyam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_cart);
    }
}