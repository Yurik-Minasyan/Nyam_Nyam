package com.example.nyam_nyam;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class Main_Menu extends AppCompatActivity {
    SearchView sw;
    ListView lw;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;
    FirebaseFirestore Firestore;

    private static final String TAG = "Main_Menu";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main_menu);
        {
            sw = findViewById(R.id.search);
            lw = findViewById(R.id.list);
            lw.setVisibility(View.GONE);
            array = new ArrayList<>();
            array.add("Մսային նախուտեստներ");//0
            array.add("Պանրի տեսականի");//1
            array.add("Թթուներ");//2
            array.add("Կապարզե");//3
            array.add("Կեսար");//4
            array.add("Բանջարեղենային");//5
            array.add("Կարտոֆիլ ֆրի");//6
            array.add("Հոթ-դոգ բարբիքյու");//7
            array.add("Տավարի մսով բուրգեր");//8
            array.add("Արաբիկա");//9
            array.add("Կապուչինո");//10
            array.add("Լատտե");//11
            array.add("Միկադո");//12
            array.add("Նապոլեոն");//13
            array.add("Կարամելային միջուկով դոնաթ");//14
            array.add("Закуски");//15
            array.add("Сыры");//16
            array.add("Маринады");//17
            array.add("Капрезе");//18
            array.add("Цезарь");//19
            array.add("Овощной");//20
            array.add("Картофель фри");//21
            array.add("Хот-дог барбекю");//22
            array.add("Бургер с говядиной");//23
            array.add("Арабика");//24
            array.add("Капучино");//25
            array.add("Латте");//26
            array.add("Микадо");//27
            array.add("Наполеон");//28
            array.add("Донат с карамельной начинкой");//29
            array.add("Meat snacks");//30
            array.add("Cheese");//31
            array.add("Marinades");//32
            array.add("Caprese");//33
            array.add("Caesar");//34
            array.add("Vegetable");//35
            array.add("French fries");//36
            array.add("Hot-dog barbeque");//37
            array.add("Beef burger");//38
            array.add("Latte");//39
            array.add("Arabia");//40
            array.add("Cappuccino");//41
            array.add("Coca-Cola");//42
            array.add("Fanta");//43
            array.add("Sprite");//44
            array.add("Water");//45
            array.add("Micado");//46
            array.add("Napoleon");//47
            array.add("Caramel filled donut");//48
            array.add("Ջուր");//49
            array.add("Вода");//50
            adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,array);
            lw.setAdapter(adapter);
            sw.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String s) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String s) {
                    if(s.length() != 0){
                        lw.setVisibility(View.VISIBLE);
                        adapter.getFilter().filter(s);
                    }
                    else{
                        lw.setVisibility(View.GONE);
                    }

                    return false;
                }
            });
            lw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                    String text = lw.getItemAtPosition(i).toString();
                    //Toast.makeText(Main_Menu.this, ""+text, Toast.LENGTH_SHORT).show();
                    if(text=="Water" || text=="Вода" || text=="Ջուր" || text=="Coca-Cola" || text=="Fanta" || text=="Sprite"){
                        Intent iy = new Intent(Main_Menu.this, Drink.class);
                        startActivity(iy);
                    }
                    if(text=="Մսային նախուտեստներ" || text=="Պանրի տեսականի" || text=="Թթուներ" || text=="Закуски" || text=="Сыры" || text=="Маринады" || text=="Meat snacks" || text=="Cheese" || text=="Marinades"){
                        Intent iy = new Intent(Main_Menu.this, Naxutest.class);
                        startActivity(iy);
                    }
                    if(text=="Կապարզե" || text=="Կեսար" || text=="Բանջարեղենային" || text=="Капрезе" || text=="Цезарь" || text=="Овощной" || text=="Caprese" || text=="Caesar" || text=="Vegetable"){
                        Intent iy = new Intent(Main_Menu.this, Salad.class);
                        startActivity(iy);
                    }
                    if(text=="Կարտոֆիլ ֆրի" || text=="Հոթ-դոգ բարբիքյու" || text=="Տավարի մսով բուրգեր" || text=="Картофель фри" || text=="Хот-дог барбекю" || text=="Бургер с говядиной" || text=="Hot-dog barbeque" || text=="French fries" || text=="Beef burger"){
                        Intent iy = new Intent(Main_Menu.this, Fast_Food.class);
                        startActivity(iy);
                    }
                    if(text=="Արաբիկա" || text=="Կապուչինո" || text=="Լատտե" || text=="Арабика" || text=="Капучино" || text=="Латте" || text=="Latte" || text=="Arabia" || text=="Cappuccino"){
                        Intent iy = new Intent(Main_Menu.this, Fast_Food.class);
                        startActivity(iy);
                    }
                    if(text=="Միկադո" || text=="Նապոլեոն" || text=="Կարամելային միջուկով դոնաթ" || text=="Наполеон" || text=="Микадо" || text=="Донат с карамельной начинкой" || text=="Micado" || text=="Napoleon" || text=="Caramel filled donut"){
                        Intent iy = new Intent(Main_Menu.this, Fast_Food.class);
                        startActivity(iy);
                    }
                }
            });
        }

        Firestore = FirebaseFirestore.getInstance();
        Map<String,Object> users = new HashMap<>();
        users.put("firstName","Anun");
        users.put("lastName","Azganun");
        users.put("descrption","esim inch");
        Firestore.collection("users").add(users).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(Main_Menu.this,"Sucsess",Toast.LENGTH_LONG).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Main_Menu.this,"Sucsess",Toast.LENGTH_LONG).show();
            }
        });

        Firestore.collection("users").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Main_Menu.this,"Successful",Toast.LENGTH_LONG).show();
                    for (QueryDocumentSnapshot document : task.getResult()) {
                        Log.d(TAG, "FiredStore");
                        Log.d(TAG, document.getId() + " => " + document.getData());
                    }
                }
                else{
                    Toast.makeText(Main_Menu.this,"Failed",Toast.LENGTH_LONG).show();
                }
            }
        });


    }

//    public void basicReadWrite() {
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//        myRef.setValue("Hello, World!");
//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                String value = dataSnapshot.getValue(String.class);
//                Log.d(TAG, "Value is: " + value);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//                Log.w(TAG, "Failed to read value.", error.toException());
//            }
//        });
//    }
    public void snack(View view){
        Intent i = new Intent(Main_Menu.this, Naxutest.class);
        startActivity(i);
    }
    public void salad(View view){
        Intent i = new Intent(Main_Menu.this, Salad.class);
        startActivity(i);
    }
    public void junk_food(View view){
        Intent i = new Intent(Main_Menu.this, Fast_Food.class);
        startActivity(i);
    }
    public void drink(View view){
        Intent i = new Intent(Main_Menu.this, Drink.class);
        startActivity(i);
    }
    public void coffee(View view){
        Intent i = new Intent(Main_Menu.this, Coffee.class);
        startActivity(i);
    }
    public void cake(View view){
        Intent i = new Intent(Main_Menu.this, Cake.class);
        startActivity(i);
    }
    public void cart_menu(View view){
        Intent i = new Intent(Main_Menu.this, Cart.class);
        startActivity(i);
    }
    public void translate_rus(View view) {
        ImageButton cart_USA2=findViewById(R.id.translate_usa);
        ImageButton cart_rus2=findViewById(R.id.translate_rus);
        Locale locale = new Locale("ru");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        recreate();
        cart_rus2.setVisibility(View.GONE);
        cart_USA2.setVisibility(View.VISIBLE);
    }
    public void translate_usa(View view) {
        ImageButton cart_USA=findViewById(R.id.translate_usa);
        ImageButton cart_rus=findViewById(R.id.translate_rus);
        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        recreate();
        cart_rus.setVisibility(View.VISIBLE);
        cart_USA.setVisibility(View.GONE);
    }
}