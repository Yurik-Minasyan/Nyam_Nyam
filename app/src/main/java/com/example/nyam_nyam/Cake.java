package com.example.nyam_nyam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Locale;

public class Cake extends AppCompatActivity {
    ImageButton ckae_USA=findViewById(R.id.translate_cake_usa);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_cake);

    }
    public void translate_cake_rus(View view) {
        Locale locale = new Locale("ru");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        recreate();
    }
    public void translate_cake_usa(View view) {
        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        recreate();
    }
    public void home5(View view){
        Intent i = new Intent(Cake.this, Main_Menu.class);
        startActivity(i);
    }
    public void cart_cake(View view){
        Intent i = new Intent(Cake.this, Cart.class);
        startActivity(i);
    }
}