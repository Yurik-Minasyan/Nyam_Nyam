package com.example.nyam_nyam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Main_Menu extends AppCompatActivity {
    SearchView sw;
    ListView lw;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main_menu);

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
        array.add("արամելային միջուկով դոնաթ");//14
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
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id == 0 || id == 1 |id == 2 ||id == 15 ||id == 16 ||id == 17 || id == 30 ||id == 31 ||id == 32){
                    Intent i = new Intent(Main_Menu.this, Naxutest.class);
                    startActivity(i);
                }
                if(id == 3 || id == 4 ||id == 5 ||id == 18 ||id == 19 || id == 20 ||id == 33 ||id == 34 |id == 35){
                    Intent i = new Intent(Main_Menu.this, Salad.class);
                    startActivity(i);
                }
                if(id == 6 || id == 7 ||id == 8 |id == 21 ||id == 22 || id == 33 ||id == 36 ||id == 37 ||id == 38){
                    Intent i = new Intent(Main_Menu.this, Fast_Food.class);
                    startActivity(i);
                }
                if(id == 9 ||id == 10 ||id == 11 ||id == 24 ||id == 25 || id == 26 ||id == 39 ||id == 40 ||id == 41){
                    Intent i = new Intent(Main_Menu.this, Coffee.class);
                    startActivity(i);
                }
                if(id == 12 || id == 13 ||id == 14 ||id == 27 ||id == 28 || id== 29 ||id == 46 ||id == 47 ||id == 48){
                    Intent i = new Intent(Main_Menu.this, Cake.class);
                    startActivity(i);
                }
                if(id == 42 || id == 43 ||id == 44 ||id == 45 || id == 49 || id == 50){
                    Intent i = new Intent(Main_Menu.this, Drink.class);
                    startActivity(i);
                }
            }
        });

    }
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
}