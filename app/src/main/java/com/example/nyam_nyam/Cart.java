package com.example.nyam_nyam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
    LinearLayout arabia;
    LinearLayout cappuchino;
    LinearLayout latte;
    LinearLayout french;
    LinearLayout hot_dog;
    LinearLayout burger;
    LinearLayout capreze;
    LinearLayout caesar;
    LinearLayout vegetable;
    LinearLayout cola;
    LinearLayout fanta;
    LinearLayout sprite;
    LinearLayout water;
    ListView lw;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;
    int meat_n;
    int cheese_n;
    int marinade_n;
    int micado_n;
    int napoleon_n;
    int donat_n;
    int arabia_n;
    int cappuchino_n;
    int latte_n;
    int french_n;
    int hot_dog_n;
    int burger_n;
    int capreze_n;
    int caesar_n;
    int vegetable_n;
    int cola_n;
    int fanta_n;
    int sprite_n;
    int water_n;
    TextView meat_p;
    TextView cheese_p;
    TextView marinade_p;
    TextView micado_p;
    TextView napoleon_p;
    TextView donat_p;
    TextView arabia_p;
    TextView cappuchino_p;
    TextView latte_p;
    TextView french_p;
    TextView hot_dog_p;
    TextView burger_p;
    TextView capreze_p;
    TextView caesar_p;
    TextView vegetable_p;
    TextView cola_p;
    TextView fanta_p;
    TextView sprite_p;
    TextView water_p;
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
        arabia = findViewById(R.id.arabia);
        cappuchino = findViewById(R.id.cappuchino_c);
        latte = findViewById(R.id.latte);
        french = findViewById(R.id.french_f);
        hot_dog = findViewById(R.id.hot_dog_ca);
        burger = findViewById(R.id.burger);
        capreze = findViewById(R.id.caprese_c);
        caesar = findViewById(R.id.ceasar_c);
        vegetable = findViewById(R.id.vegetable_c);
        cola = findViewById(R.id.cola_c);
        fanta = findViewById(R.id.fanta_c);
        sprite = findViewById(R.id.sprite_c);
        water = findViewById(R.id.water_c);
        sw = findViewById(R.id.search);
        lw = findViewById(R.id.list);
        lw.setVisibility(View.GONE);
        meat_p = findViewById(R.id.textView2);
        cheese_p = findViewById(R.id.chesse_pr);
        marinade_p = findViewById(R.id.marinade);
        micado_p = findViewById(R.id.mikadoo);
        napoleon_p = findViewById(R.id.napoleont);
        donat_p = findViewById(R.id.donat_pr);
        arabia_p = findViewById(R.id.arabia_pr);
        latte_p = findViewById(R.id.latte_pr);
        french_p = findViewById(R.id.french_pr);
        cappuchino_p = findViewById(R.id.cappuchino_pr);
        hot_dog_p = findViewById(R.id.hot_dog_pr);
        burger_p = findViewById(R.id.burger_pr);
        capreze_p = findViewById(R.id.caprese_pr);
        caesar_p = findViewById(R.id.caesar_pr);
        vegetable_p = findViewById(R.id.vegetable_pr);
        cola_p = findViewById(R.id.cola_pr);
        fanta_p = findViewById(R.id.fanta_pr);
        sprite_p = findViewById(R.id.sprite_pr);
        water_p = findViewById(R.id.water_pr);
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

        meat_n = food_nubers.getMeat();
        cheese_n = food_nubers.getCheese();
        marinade_n = food_nubers.getMarinade();
        micado_n = food_nubers.getMicado();
        napoleon_n =food_nubers.getNapoleon();
        donat_n = food_nubers.getDonat();
        arabia_n = food_nubers.getArab();
        cappuchino_n = food_nubers.getCappuccino();
        latte_n =  food_nubers.getLatte();
        french_n = food_nubers.getFrench();
        hot_dog_n =food_nubers.getHot_dog();
        burger_n = food_nubers.getBurger();
        capreze_n = food_nubers.getCaprese();
        caesar_n = food_nubers.getCaesar();
        vegetable_n = food_nubers.getVegetable();
        cola_n = food_nubers.getCola();
        fanta_n = food_nubers.getFanta();
        sprite_n = food_nubers.getSprite();
        water_n = food_nubers.getWater();
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
        if(napoleon_n > 0){
            napoleon.setVisibility(View.VISIBLE);
            napoleon_p.setText(napoleon_n * 600 + " amd" );
        }
        if(donat_n > 0){
            donat.setVisibility(View.VISIBLE);
            donat_p.setText(donat_n * 750 + " amd" );
        }
        if(arabia_n > 0){
            arabia.setVisibility(View.VISIBLE);
            arabia_p.setText(arabia_n * 700 + " amd" );
        }
        if(cappuchino_n > 0){
            cappuchino.setVisibility(View.VISIBLE);
            cappuchino_p.setText(cappuchino_n * 750 + " amd" );
        }
        if(latte_n > 0){
            latte.setVisibility(View.VISIBLE);
            latte_p.setText(latte_n * 1000 + " amd" );
        }
        if(french_n > 0){
            french.setVisibility(View.VISIBLE);
            french_p.setText(french_n * 550 + " amd" );
        }
        if(hot_dog_n > 0){
            hot_dog.setVisibility(View.VISIBLE);
            hot_dog_p.setText(hot_dog_n * 800 + " amd" );
        }
        if(burger_n > 0){
            burger.setVisibility(View.VISIBLE);
            burger_p.setText(burger_n * 1200 + " amd" );
        }
        if(capreze_n > 0){
            capreze.setVisibility(View.VISIBLE);
            capreze_p.setText(capreze_n * 1200 + " amd" );
        }
        if(caesar_n > 0){
            caesar.setVisibility(View.VISIBLE);
            caesar_p.setText(caesar_n * 1000 + " amd" );
        }
        if(vegetable_n > 0){
            vegetable.setVisibility(View.VISIBLE);
            vegetable_p.setText(vegetable_n * 500 + " amd" );
        }
        if(cola_n > 0){
            cola.setVisibility(View.VISIBLE);
            cola_p.setText(cola_n * 500 + " amd" );
        }
        if(fanta_n > 0){
            fanta.setVisibility(View.VISIBLE);
            fanta_p.setText(fanta_n * 500 + " amd" );
        }
        if(sprite_n > 0){
            sprite.setVisibility(View.VISIBLE);
            sprite_p.setText(sprite_n * 500 + " amd" );
        }
        if(water_n > 0){
            water.setVisibility(View.VISIBLE);
            water_p.setText(water_n * 300 + " amd" );
        }
    }
    public void home_c(View view){
        Intent i = new Intent(Cart.this, Main_Menu.class);
        startActivity(i);
    }

}