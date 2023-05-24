package com.example.nyam_nyam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {
    SearchView sw;
    LinearLayout meat;
    LinearLayout cheese;
    LinearLayout marinade;
    LinearLayout micado;
    LinearLayout napoleon;
    LinearLayout donat;
    ListView lw;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;
    int meat_n;
    int cheese_n;
    int marinade_n;
    int micado_n;
    int napoleon_n;
    int donat_n;
    TextView meat_p;
    TextView cheese_p;
    TextView marinade_p;
    TextView micado_p;
    TextView napoleon_p;
    TextView donat_p;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_cart);
        meat = findViewById(R.id.meat_Lay);
        cheese = findViewById(R.id.cheese);
        marinade = findViewById(R.id.marinad);
        micado = findViewById(R.id.mikado);
        napoleon = findViewById(R.id.napoleon_lay);
        donat = findViewById(R.id.donut_lay);
        sw = findViewById(R.id.search);
        lw = findViewById(R.id.list);
        lw.setVisibility(View.GONE);
        meat_p = findViewById(R.id.textView2);
        cheese_p = findViewById(R.id.chesse_pr);
        marinade_p = findViewById(R.id.marinade);
        micado_p = findViewById(R.id.mikadoo);
        micado_p = findViewById(R.id.napoleont);
        donat_p = findViewById(R.id.donat_pr);
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
                    Intent iy = new Intent(Cart.this, Drink.class);
                    startActivity(iy);
                }
                if(text=="Մսային նախուտեստներ" || text=="Պանրի տեսականի" || text=="Թթուներ" || text=="Закуски" || text=="Сыры" || text=="Маринады" || text=="Meat snacks" || text=="Cheese" || text=="Marinades"){
                    Intent iy = new Intent(Cart.this, Naxutest.class);
                    startActivity(iy);
                }
                if(text=="Կապարզե" || text=="Կեսար" || text=="Բանջարեղենային" || text=="Капрезе" || text=="Цезарь" || text=="Овощной" || text=="Caprese" || text=="Caesar" || text=="Vegetable"){
                    Intent iy = new Intent(Cart.this, Salad.class);
                    startActivity(iy);
                }
                if(text=="Կարտոֆիլ ֆրի" || text=="Հոթ-դոգ բարբիքյու" || text=="Տավարի մսով բուրգեր" || text=="Картофель фри" || text=="Хот-дог барбекю" || text=="Бургер с говядиной" || text=="Hot-dog barbeque" || text=="French fries" || text=="Beef burger"){
                    Intent iy = new Intent(Cart.this, Fast_Food.class);
                    startActivity(iy);
                }
                if(text=="Արաբիկա" || text=="Կապուչինո" || text=="Լատտե" || text=="Арабика" || text=="Капучино" || text=="Латте" || text=="Latte" || text=="Arabia" || text=="Cappuccino"){
                    Intent iy = new Intent(Cart.this, Fast_Food.class);
                    startActivity(iy);
                }
                if(text=="Միկադո" || text=="Նապոլեոն" || text=="Կարամելային միջուկով դոնաթ" || text=="Наполеон" || text=="Микадо" || text=="Донат с карамельной начинкой" || text=="Micado" || text=="Napoleon" || text=="Caramel filled donut"){
                    Intent iy = new Intent(Cart.this, Fast_Food.class);
                    startActivity(iy);
                }
            }
        });
        Food_Nubers food_nubers = (Food_Nubers) getApplicationContext();

        meat_n = Integer.parseInt(food_nubers.getMeat());
        cheese_n = Integer.parseInt(food_nubers.getCheese());
        marinade_n = Integer.parseInt(food_nubers.getMarinade());
        micado_n = Integer.parseInt(food_nubers.getMicado());
        napoleon_n = Integer.parseInt(food_nubers.getNapoleon());
        donat_n = Integer.parseInt(food_nubers.getDonat());
        if(meat_n > 0){
            meat.setVisibility(View.VISIBLE);
            meat_p.setText(meat_n * 3000 + " amd" );
        }
        if(cheese_n > 0){
            cheese.setVisibility(View.VISIBLE);
            cheese_p.setText(cheese_n * 2500 + " amd" );
        }
        if(marinade_n > 0){
            marinade.setVisibility(View.VISIBLE);
            marinade_p.setText(marinade_n * 1800 + " amd" );
        }
        if(micado_n > 0){
            micado.setVisibility(View.VISIBLE);
            micado_p.setText(micado_n * 550 + " amd" );
        }
//        if(napoleon_n > 0){
//            napoleon.setVisibility(View.VISIBLE);
//            napoleon_p.setText(napoleon_n * 600 + " amd" );
//        }
        if(donat_n > 0){
            donat.setVisibility(View.VISIBLE);
            donat_p.setText(donat_n * 750 + " amd" );
        }
    }
    public void home_c(View view){
        Intent i = new Intent(Cart.this, Main_Menu.class);
        startActivity(i);
    }

}