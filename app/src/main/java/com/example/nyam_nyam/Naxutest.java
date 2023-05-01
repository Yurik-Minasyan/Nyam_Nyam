package com.example.nyam_nyam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class Naxutest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_naxutest);
    }
    public void home2(View view){
        Intent i = new Intent(Naxutest.this, Main_Menu.class);
        startActivity(i);
    }
    public void cart_nax(View view){
        Intent i = new Intent(Naxutest.this, Cart.class);
        startActivity(i);
    }
}