package com.example.nyam_nyam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;
import com.google.mlkit.nl.translate.Translation;
import com.google.mlkit.nl.translate.Translator;
import com.google.mlkit.nl.translate.TranslatorOptions;
import java.util.HashMap;
import java.util.Locale;

public class Naxutest extends AppCompatActivity {
    @SuppressLint("WrongViewCast")
//    ImageButton nax_us = this.findViewById(R.id.translate_nax_usa);
//    ImageButton nax_am = this.findViewById(R.id.translate_nax_arm);
//    ImageButton nax_ru = this.findViewById(R.id.translate_nax_rus);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_naxutest);

    }
//    public void meat(View view){
////        String n = meat.getText().toString();
////        if (TextUtils.isEmpty()) {
////
////            return;
////        }else{
//            mDatabase.child("Meat").setValue("n");Toast.makeText(Naxutest.this,"Enter Number",Toast.LENGTH_LONG).show();
////        }
//    }

    public void translate_nax_rus(View view) {
        Locale locale = new Locale("ru");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
//        nax_ru.setVisibility(View.GONE);
//        nax_am.setVisibility(View.VISIBLE);
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        recreate();
    }
    public void translate_nax_usa(View view) {
        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
//        nax_us.setVisibility(View.GONE);
//        nax_ru.setVisibility(View.VISIBLE);
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        recreate();
    }
    public void translate_nax_arm(View view) {
        Locale locale = new Locale("hy");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
//        nax_am.setVisibility(View.GONE);
//        nax_us.setVisibility(View.VISIBLE);
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        recreate();
    }

    public void home2(View view) {
        Intent i = new Intent(Naxutest.this, Main_Menu.class);
        startActivity(i);
    }

    public void cart_nax(View view) {
        Intent i = new Intent(Naxutest.this, Cart.class);
        startActivity(i);
    }

}
