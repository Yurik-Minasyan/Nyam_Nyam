package com.example.nyam_nyam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;

import java.util.HashMap;

public class Naxutest extends AppCompatActivity {
    @SuppressLint("WrongViewCast")

    DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_naxutest);

    }
    public void meat(View view){
//        String n = meat.getText().toString();
//        if (TextUtils.isEmpty()) {
//
//            return;
//        }else{
            mDatabase.child("Meat").setValue("n");Toast.makeText(Naxutest.this,"Enter Number",Toast.LENGTH_LONG).show();
//        }
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