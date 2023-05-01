package com.example.nyam_nyam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class Drink extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_drink);
    }
    public void home4(View view){
        Intent i = new Intent(Drink.this, Main_Menu.class);
        startActivity(i);
    }
    public void cart_drink(View view){
        Intent i = new Intent(Drink.this, Cart.class);
        startActivity(i);
    }
}