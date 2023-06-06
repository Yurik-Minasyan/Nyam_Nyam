package com.example.nyam_nyam;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Drink extends AppCompatActivity {
    SearchView sw;
    ListView lw;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;
    Food_Nubers food;
    EditText cola_num;
    EditText fanta_num;
    EditText sprite_num;
    EditText water_num;

    int cola = 1;
    int fanta = 1;
    int sprite = 1;
    int water = 1;
    ImageButton cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_drink);
        cart = findViewById(R.id.button2);
        food  = (Food_Nubers) getApplicationContext();
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
                    Intent iy = new Intent(Drink.this, Drink.class);
                    startActivity(iy);
                }
                if(text=="Մսային նախուտեստներ" || text=="Պանրի տեսականի" || text=="Թթուներ" || text=="Закуски" || text=="Сыры" || text=="Маринады" || text=="Meat snacks" || text=="Cheese" || text=="Marinades"){
                    Intent iy = new Intent(Drink.this, Naxutest.class);
                    startActivity(iy);
                }
                if(text=="Կապարզե" || text=="Կեսար" || text=="Բանջարեղենային" || text=="Капрезе" || text=="Цезарь" || text=="Овощной" || text=="Caprese" || text=="Caesar" || text=="Vegetable"){
                    Intent iy = new Intent(Drink.this, Salad.class);
                    startActivity(iy);
                }
                if(text=="Կարտոֆիլ ֆրի" || text=="Հոթ-դոգ բարբիքյու" || text=="Տավարի մսով բուրգեր" || text=="Картофель фри" || text=="Хот-дог барбекю" || text=="Бургер с говядиной" || text=="Hot-dog barbeque" || text=="French fries" || text=="Beef burger"){
                    Intent iy = new Intent(Drink.this, Fast_Food.class);
                    startActivity(iy);
                }
                if(text=="Արաբիկա" || text=="Կապուչինո" || text=="Լատտե" || text=="Арабика" || text=="Капучино" || text=="Латте" || text=="Latte" || text=="Arabia" || text=="Cappuccino"){
                    Intent iy = new Intent(Drink.this, Fast_Food.class);
                    startActivity(iy);
                }
                if(text=="Միկադո" || text=="Նապոլեոն" || text=="Կարամելային միջուկով դոնաթ" || text=="Наполеон" || text=="Микадо" || text=="Донат с карамельной начинкой" || text=="Micado" || text=="Napoleon" || text=="Caramel filled donut"){
                    Intent iy = new Intent(Drink.this, Fast_Food.class);
                    startActivity(iy);
                }
            }
        });
    }
    public void home4(View view){
        Intent i = new Intent(Drink.this, Main_Menu.class);
        startActivity(i);
    }
    public void cart_drink(View view){
        Intent i = new Intent(Drink.this, Cart.class);
        startActivity(i);
    }
    public void cola(View view){
        cola_num = findViewById(R.id.cola);
        String g = cola_num.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setCola(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        cart.setImageResource(R.drawable.cart2);
    }
    public void fanta(View view){

        fanta_num = findViewById(R.id.fanta);
        String g = fanta_num.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setFanta(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }cart.setImageResource(R.drawable.cart2);

    }
    public void sprite(View view){

        sprite_num = findViewById(R.id.sprite);
        String g = sprite_num.getText().toString();
        int n = Integer.parseInt(g);
        if (n >  0){
            food.setSprite(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }cart.setImageResource(R.drawable.cart2);

    }
    public void water(View view){

        water_num = findViewById(R.id.water);
        String g = water_num.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setWater(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
    }


    public void cola_plus(View view){
        cola_num = findViewById(R.id.cola);
        String g = Integer.toString(cola);
        cola_num.setText(g);
        cola++;
    }
    public void fanta_plus(View view){
        fanta_num = findViewById(R.id.fanta);
        String g = Integer.toString(fanta);
        fanta_num.setText(g);
        fanta++;
    }
    public void sprite_plus(View view){
        sprite_num = findViewById(R.id.sprite);
        String g = Integer.toString(sprite);
        sprite_num.setText(g);
        sprite++;
    }
    public void water_plus(View view){
        water_num = findViewById(R.id.water);
        String g = Integer.toString(water);
        water_num.setText(g);
        water++;
    }
}