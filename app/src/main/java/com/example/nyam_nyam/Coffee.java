package com.example.nyam_nyam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class Coffee extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_coffee);
    }
    public void home6(View view){
        Intent i = new Intent(Coffee.this, Main_Menu.class);
        startActivity(i);
    }
    public void cart_coffee(View view){
        Intent i = new Intent(Coffee.this, Cart.class);
        startActivity(i);
    }
    public void translate_coffee_rus(View view) {
        Locale locale = new Locale("ru");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        recreate();
    }
    public void translate_coffee_usa(View view) {
        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        recreate();
    }

}