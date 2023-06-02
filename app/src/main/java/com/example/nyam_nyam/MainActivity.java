package com.example.nyam_nyam;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Food_Nubers food;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        food  = (Food_Nubers) getApplicationContext();
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView5);

    }
    public void scan(View view){

        IntentIntegrator ii = new IntentIntegrator(MainActivity.this);
        ii.setOrientationLocked(true);
        ii.setPrompt("Scan a QR Code on Table");
        ii.setDesiredBarcodeFormats(ii.QR_CODE);
        ii.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult ir = IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if (ir != null){
            String contents = ir.getContents();
            if(contents != null){
//                tv.setText(ir.getContents());
                food.setTable(Integer.parseInt(ir.getContents()));
                Intent i = new Intent(MainActivity.this, Main_Menu.class);
                startActivity(i);
            }
        }
        else{
            super.onActivityResult(requestCode, resultCode, data);
        }

    }
    public void menu(View view){
        Intent i = new Intent(MainActivity.this, Main_Menu.class);
        startActivity(i);
    }

//    public void translate_rus(View view) {
//        ImageButton cart_USA2=findViewById(R.id.translate_usa);
//        ImageButton cart_rus2=findViewById(R.id.translate_rus);
//        Locale locale = new Locale("ru");
//        Locale.setDefault(locale);
//        Configuration config = getBaseContext().getResources().getConfiguration();
//        config.locale = locale;
//        getBaseContext().getResources().updateConfiguration(config,
//                getBaseContext().getResources().getDisplayMetrics());
//        recreate();
//        cart_rus2.setVisibility(View.GONE);
//        cart_USA2.setVisibility(View.VISIBLE);
//    }
//    public void translate_usa(View view) {
//        ImageButton cart_USA=findViewById(R.id.translate_usa);
//        ImageButton cart_rus=findViewById(R.id.translate_rus);
//        Locale locale = new Locale("en");
//        Locale.setDefault(locale);
//        Configuration config = getBaseContext().getResources().getConfiguration();
//        config.locale = locale;
//        getBaseContext().getResources().updateConfiguration(config,
//                getBaseContext().getResources().getDisplayMetrics());
//
//        recreate();
//        cart_rus.setVisibility(View.VISIBLE);
//        cart_USA.setVisibility(View.GONE);
//    }
}