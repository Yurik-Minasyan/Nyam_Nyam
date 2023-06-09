package com.EMenu.nyam_nyam;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.EMenu.nyam_nyam.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart extends AppCompatActivity {
    private DatabaseReference mDatabase;
    Button order_b;
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
    LinearLayout theEnd;
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
    TextView end_num;
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
    Button end_b;
    TextView water_p;
    TextView snackk;
    TextView saladd;
    TextView coffeee;
    TextView fastt;
    TextView drinkk;
    TextView cakee;
    TextView end_t;
    int meat_c = 1;
    int chesse_c = 1;
    int marinade_c = 1;
    int caprese_c = 1;
    int caesar_c = 1;
    int vegetable_c = 1;
    int arab_c = 1;
    int cappuchino_c = 1;
    int latte_c = 1;
    int mikado_c = 1;
    int napoleon_c = 1;
    int donut_c = 1;
    int french_c = 1;
    int hot_dog_c = 1;
    int burger_c = 1;
    int cola_c = 1;
    int fanta_c = 1;
    int sprite_c = 1;
    int water_c = 1;

    EditText meatc;
    EditText chessec;
    EditText marinadc;
    EditText capresec;
    EditText caesarc;
    EditText vegetablec;
    EditText arabc;
    EditText cappuchinoc;
    EditText lattec;
    EditText mikadoc;
    EditText napoleonc;
    EditText donutc;
    EditText frenchc;
    EditText hot_dogc;
    EditText burgerc;
    EditText colac;
    EditText fantac;
    EditText spritec;
    EditText waterc;
    Food_Nubers food;
    int sum;
    FirebaseFirestore Firestore;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        food  = (Food_Nubers) getApplicationContext();
        super.onCreate(savedInstanceState);
        this. setRequestedOrientation(ActivityInfo. SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_cart);
        order_b = findViewById(R.id.end_i);
        {
            end_t = findViewById(R.id.end_t);
            end_num = findViewById(R.id.end_num);
            meat = findViewById(R.id.meat_Lay);
            end_b =findViewById(R.id.end_i);
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
            theEnd = findViewById(R.id.end);
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
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);
            lw.setAdapter(adapter);
            sw.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String s) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String s) {
                    if (s.length() != 0) {
                        lw.setVisibility(View.VISIBLE);
                        adapter.getFilter().filter(s);
                    } else {
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
                    if (text == "Water" || text == "Вода" || text == "Ջուր" || text == "Coca-Cola" || text == "Fanta" || text == "Sprite") {
                        Intent iy = new Intent(Cart.this, Drink.class);
                        startActivity(iy);
                    }
                    if (text == "Մսային նախուտեստներ" || text == "Պանրի տեսականի" || text == "Թթուներ" || text == "Закуски" || text == "Сыры" || text == "Маринады" || text == "Meat snacks" || text == "Cheese" || text == "Marinades") {
                        Intent iy = new Intent(Cart.this, Naxutest.class);
                        startActivity(iy);
                    }
                    if (text == "Կապարզե" || text == "Կեսար" || text == "Բանջարեղենային" || text == "Капрезе" || text == "Цезарь" || text == "Овощной" || text == "Caprese" || text == "Caesar" || text == "Vegetable") {
                        Intent iy = new Intent(Cart.this, Salad.class);
                        startActivity(iy);
                    }
                    if (text == "Կարտոֆիլ ֆրի" || text == "Հոթ-դոգ բարբիքյու" || text == "Տավարի մսով բուրգեր" || text == "Картофель фри" || text == "Хот-дог барбекю" || text == "Бургер с говядиной" || text == "Hot-dog barbeque" || text == "French fries" || text == "Beef burger") {
                        Intent iy = new Intent(Cart.this, Fast_Food.class);
                        startActivity(iy);
                    }
                    if (text == "Արաբիկա" || text == "Կապուչինո" || text == "Լատտե" || text == "Арабика" || text == "Капучино" || text == "Латте" || text == "Latte" || text == "Arabia" || text == "Cappuccino") {
                        Intent iy = new Intent(Cart.this, Fast_Food.class);
                        startActivity(iy);
                    }
                    if (text == "Միկադո" || text == "Նապոլեոն" || text == "Կարամելային միջուկով դոնաթ" || text == "Наполеон" || text == "Микадо" || text == "Донат с карамельной начинкой" || text == "Micado" || text == "Napoleon" || text == "Caramel filled donut") {
                        Intent iy = new Intent(Cart.this, Fast_Food.class);
                        startActivity(iy);
                    }
                }
            });
            check();

        }
        Firestore = FirebaseFirestore.getInstance();
    }
    public void check(){
        meat_n = food.getMeat();
        cheese_n = food.getCheese();
        marinade_n = food.getMarinade();
        micado_n = food.getMicado();
        napoleon_n =food.getNapoleon();
        donat_n = food.getDonat();
        arabia_n = food.getArab();
        cappuchino_n = food.getCappuccino();
        latte_n =  food.getLatte();
        french_n = food.getFrench();
        hot_dog_n =food.getHot_dog();
        burger_n = food.getBurger();
        capreze_n = food.getCaprese();
        caesar_n = food.getCaesar();
        vegetable_n = food.getVegetable();
        cola_n = food.getCola();
        fanta_n = food.getFanta();
        sprite_n = food.getSprite();
        water_n = food.getWater();
//        meatc = findViewById(R.id.meat_num_c);
//        chessec = findViewById(R.id.cheese_num_c);
//        marinadc = findViewById(R.id.marinade_num_c);
//        capresec = findViewById(R.id.caprese_num_c);
//        caesarc = findViewById(R.id.caesar_num_c);
//        vegetablec = findViewById(R.id.vegetable_num_c);
//        arabc = findViewById(R.id.arab_num_c);
//        cappuchinoc = findViewById(R.id.cappuchino_num_c);
//        lattec = findViewById(R.id.latte_num_c);
//        mikadoc = findViewById(R.id.mikado_num_c);
//        napoleonc = findViewById(R.id.napoleon_num_c);
//        donutc = findViewById(R.id.donut_num_c);
//        frenchc = findViewById(R.id.french_num_c);
//        hot_dogc = findViewById(R.id.hot_num_c);
//        burgerc = findViewById(R.id.burger_num_c);
//        colac = findViewById(R.id.cola_num_c);
//        fantac = findViewById(R.id.fanta_num_c);
//        spritec = findViewById(R.id.sprite_num_c);
//        waterc = findViewById(R.id.water_num_c);
        sum = 0;
        if(meat_n > 0){
            meat.setVisibility(View.VISIBLE);
            meat_p.setText(meat_n + "x"+  3000 + "=" + meat_n * 3000 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            meatc.setText(meat_n);
            sum += meat_n*3000;
        }
        if(cheese_n > 0){
            cheese.setVisibility(View.VISIBLE);
            cheese_p.setText(cheese_n + "x"+ 2500 + "="+cheese_n * 2500 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            chessec.setText(cheese_n);
            sum += cheese_n*2500;
        }
        if(marinade_n > 0){
            marinade.setVisibility(View.VISIBLE);
            marinade_p.setText(marinade_n+ "x"+ 1800 + "=" +marinade_n * 1800 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            marinadc.setText(marinade_n);
            sum += marinade_n*1800;
        }
        if(micado_n > 0){
            micado.setVisibility(View.VISIBLE);
            micado_p.setText(micado_n + "x"+ 550 + " = " + micado_n* 550 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            mikadoc.setText(micado_n);
            sum += micado_n*550;
        }
        if(napoleon_n > 0){
            napoleon.setVisibility(View.VISIBLE);
            napoleon_p.setText(napoleon_n + "x"+ 600 +"="+ napoleon_n * 600 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            napoleonc.setText(napoleon_n);
            sum += napoleon_n*600;
        }
        if(donat_n > 0){
            donat.setVisibility(View.VISIBLE);
            donat_p.setText(donat_n + "x"+750 +"=" + donat_n * 750 + " amd");
            theEnd.setVisibility(View.VISIBLE);
//            donutc.setText(donat_n);
            sum += donat_n*750;
        }
        if(arabia_n > 0){
            arabia.setVisibility(View.VISIBLE);
            arabia_p.setText(arabia_n + "x"+ 700 + "=" + arabia_n * 700 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            arabc.setText(arabia_n);
            sum += arabia_n*700;
        }
        if(cappuchino_n > 0){
            cappuchino.setVisibility(View.VISIBLE);
            cappuchino_p.setText(cappuchino_n + "x"+ 750 + "=" + cappuchino_n * 750 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            cappuchinoc.setText(cappuchino_n);
            sum += cappuchino_n*750;
        }
        if(latte_n > 0){
            latte.setVisibility(View.VISIBLE);
            latte_p.setText(latte_n + "x"+ 1000 + "=" + latte_n * 1000 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            lattec.setText(latte_n);
            sum += latte_n*1000;
        }
        if(french_n > 0){
            french.setVisibility(View.VISIBLE);
            french_p.setText(french_n+ "x"+ 550 + "=" + french_n * 550 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            frenchc.setText(french_c);
            sum += french_n*550;
        }
        if(hot_dog_n > 0){
            hot_dog.setVisibility(View.VISIBLE);
            hot_dog_p.setText(hot_dog_n + "x"+ 800 + "=" + hot_dog_n  * 800 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            hot_dogc.setText(hot_dog_n);
            sum += hot_dog_n*800;
        }
        if(burger_n > 0){
            burger.setVisibility(View.VISIBLE);
            burger_p.setText(burger_n + "x" + 1200 + "=" + burger_n * 1200 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            burgerc.setText(burger_n);
            sum += burger_n*1200;
        }
        if(capreze_n > 0){
            capreze.setVisibility(View.VISIBLE);
            capreze_p.setText(capreze_n + "x"+ 1200 + "=" + capreze_n * 1200 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
            //capresec.setText(capreze_n);
            sum += capreze_n*1200;
        }
        if(caesar_n > 0){
            caesar.setVisibility(View.VISIBLE);
            caesar_p.setText(caesar_n + "x"+ 1000 + "=" + caesar_n * 1000 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            caesarc.setText(caesar_n);
            sum += caesar_n*1000;
        }
        if(vegetable_n > 0){
            vegetable.setVisibility(View.VISIBLE);
            vegetable_p.setText(vegetable_n+ "x"+ 500 + "=" + vegetable_n * 500 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            vegetablec.setText(vegetable_n);
            sum += vegetable_n*500;
        }
        if(cola_n > 0){
            cola.setVisibility(View.VISIBLE);
            cola_p.setText(cola_n + "x"+ 500 +"=" + cola_n * 500 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            colac.setText(cola_n);
            sum += cola_n*500;
        }
        if(fanta_n > 0){
            fanta.setVisibility(View.VISIBLE);
            fanta_p.setText(fanta_n + "x"+ 500 +"=" + fanta_n* 500 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            fantac.setText(fanta_n);
            sum += fanta_n*500;
        }
        if(sprite_n > 0){
            sprite.setVisibility(View.VISIBLE);
            sprite_p.setText(sprite_n + "x"+ 500 + "=" + sprite_n* 500 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            spritec.setText(sprite_n);
            sum += sprite_n*500;
        }
        if(water_n > 0){
            water.setVisibility(View.VISIBLE);
            water_p.setText(water_n + "x"+ 300 + "=" + water_n* 300 + " amd" );
            theEnd.setVisibility(View.VISIBLE);
//            waterc.setText(water_n);
            sum += water_n*300;
        }
        end_t.setText(R.string.order_pr);
        end_num.setText(sum + "amd");
    }
    public void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
    public void to_database(View view) {
        {

            meat_n = food.getMeat();
            cheese_n = food.getCheese();
            marinade_n = food.getMarinade();
            micado_n = food.getMicado();
            napoleon_n = food.getNapoleon();
            donat_n = food.getDonat();
            arabia_n = food.getArab();
            cappuchino_n = food.getCappuccino();
            latte_n = food.getLatte();
            french_n = food.getFrench();
            hot_dog_n = food.getHot_dog();
            burger_n = food.getBurger();
            capreze_n = food.getCaprese();
            caesar_n = food.getCaesar();
            vegetable_n = food.getVegetable();
            cola_n = food.getCola();
            fanta_n = food.getFanta();
            sprite_n = food.getSprite();
            water_n = food.getWater();
        }
        Map<String, Object> order = new HashMap<>();
        {
            if (meat_n > 0) {
                order.put("Meat Snack", Integer.toString(meat_n));
            } else {
                order.put("Meat Snack", Integer.toString(meat_n));
            }
            if (cheese_n > 0) {
                order.put("Cheese", Integer.toString(cheese_n));
            } else {
                order.put("Cheese", Integer.toString(cheese_n));
            }
            if (marinade_n > 0) {
                order.put("Marinade", Integer.toString(marinade_n));
            } else {
                order.put("Marinade", Integer.toString(marinade_n));
            }
            if (micado_n > 0) {
                order.put("Mikado", Integer.toString(micado_n));
            } else {
                order.put("Mikado", Integer.toString(micado_n));
            }
            if (napoleon_n > 0) {
                order.put("Napoleon", Integer.toString(napoleon_n));
            } else {
                order.put("Napoleon", Integer.toString(napoleon_n));
            }
            if (donat_n > 0) {
                order.put("Donut", Integer.toString(donat_n));
            } else {
                order.put("Donut", Integer.toString(donat_n));
            }
            if (arabia_n > 0) {
                order.put("Arabia Coffee", Integer.toString(arabia_n));
            } else {
                order.put("Arabia Coffee", Integer.toString(arabia_n));
            }
            if (cappuchino_n > 0) {
                order.put("Cappuccino", Integer.toString(cappuchino_n));
            } else {
                order.put("Cappuccino", Integer.toString(cappuchino_n));
            }
            if (latte_n > 0) {
                order.put("Latte", Integer.toString(latte_n));
            } else {
                order.put("Latte", Integer.toString(latte_n));
            }
            if (capreze_n > 0) {
                order.put("Caprese", Integer.toString(capreze_n));
            } else {
                order.put("Caprese", Integer.toString(capreze_n));
            }
            if (caesar_n > 0) {
                order.put("Caesar", Integer.toString(caesar_n));
            } else {
                order.put("Caesar", Integer.toString(caesar_n));
            }
            if (vegetable_n > 0) {
                order.put("Vegetable salad", Integer.toString(vegetable_n));
            } else {
                order.put("Vegetable salad", Integer.toString(vegetable_n));
            }
            if (french_n > 0) {
                order.put("French fries", Integer.toString(french_n));
            } else {
                order.put("French fries", Integer.toString(french_n));
            }
            if (hot_dog_n > 0) {
                order.put("Hot dog", Integer.toString(hot_dog_n));
            } else {
                order.put("Hot dog", Integer.toString(hot_dog_n));
            }
            if (burger_n > 0) {
                order.put("Beef burger", Integer.toString(burger_n));
            } else {
                order.put("Beef burger", Integer.toString(burger_n));
            }
            if (cola_n > 0) {
                order.put("Coca-Cola", Integer.toString(cola_n));
            } else {
                order.put("Coca-Cola", Integer.toString(cola_n));
            }
            if (fanta_n > 0) {
                order.put("Fanta", Integer.toString(fanta_n));
            } else {
                order.put("Fanta", Integer.toString(fanta_n));
            }
            if (sprite_n > 0) {
                order.put("Sprite", Integer.toString(sprite_n));
            } else {
                order.put("Sprite", Integer.toString(sprite_n));
            }
            if (water_n > 0) {
                order.put("Water", Integer.toString(water_n));
            } else {
                order.put("Water", Integer.toString(water_n));
            }
            if (sum > 0) {
                order.put("Total", Integer.toString(sum));
            }
            order.put("Table", Integer.toString(food.getTable()));
        }
        if (food.getTable() == 1) {
            Firestore.collection("Order").document("Table1").update(order).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void unused) {
                    order_b.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Cart.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }
        if (food.getTable() == 2) {
            Firestore.collection("Order").document("Table2").update(order).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void unused) {
                    order_b.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Cart.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            });
        }
        if(food.getTable() == 3){
            Firestore.collection("Order").document("Table3").update(order).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void unused) {
                    order_b.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Cart.this,e.getMessage(),Toast.LENGTH_LONG).show();
                }
            });
        }
        if(food.getTable() == 4){
            Firestore.collection("Order").document("Table4").update(order).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void unused) {
                    order_b.setBackgroundColor(getResources().getColor(R.color.green));
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(Cart.this,e.getMessage(),Toast.LENGTH_LONG).show();
                }
            });
        }
        meat.setVisibility(View.GONE);
        cheese.setVisibility(View.GONE);
        marinade.setVisibility(View.GONE);
        micado.setVisibility(View.GONE);
        napoleon.setVisibility(View.GONE);
        donat.setVisibility(View.GONE);
        arabia.setVisibility(View.GONE);
        cappuchino.setVisibility(View.GONE);
        latte.setVisibility(View.GONE);
        capreze.setVisibility(View.GONE);
        caesar.setVisibility(View.GONE);
        vegetable.setVisibility(View.GONE);
        french.setVisibility(View.GONE);
        hot_dog.setVisibility(View.GONE);
        burger.setVisibility(View.GONE);
        cola.setVisibility(View.GONE);
        fanta.setVisibility(View.GONE);
        sprite.setVisibility(View.GONE);
        water.setVisibility(View.GONE);
        theEnd.setVisibility(View.GONE);

        openDialog();
    }

    public void home_c(View view){
        Intent i = new Intent(Cart.this, Main_Menu.class);
        startActivity(i);
    }
///////////////////
    public void meat_plus_c(View view){
        meatc = findViewById(R.id.meat_num_c);
        String g = Integer.toString(meat_c);
        meatc.setText(g);
        meat_c++;
    }
    public void meat_minus_c(View view){
        meat.setVisibility(View.GONE);
        sum -= meat_n*3000;
        end_num.setText(sum + " amd");
        food.setMeat(0);
    }
    public void cheese_plus_c(View view){
        chessec = findViewById(R.id.cheese_num_c);
        String g = Integer.toString(chesse_c);
        chessec.setText(g);
        chesse_c++;
    }
    public void cheese_minus_c(View view){
        cheese.setVisibility(View.GONE);
        sum -= cheese_n*2500;
        end_num.setText(sum + " amd");
        food.setCheese(0);
    }
    public void marinade_plus_c(View view){
        marinadc = findViewById(R.id.marinade_num_c);
        String g = Integer.toString(marinade_c);
        marinadc.setText(g);
        marinade_c++;
    }
    public void marinade_minus_c(View view){
        marinade.setVisibility(View.GONE);
        sum -= marinade_n*1800;
        end_num.setText(sum + " amd");
        food.setMarinade(0);
    }

    public void caprese_plus_c(View view){
        capresec = findViewById(R.id.caprese_num_c);
        String g = Integer.toString(caprese_c);
        capresec.setText(g);
        caprese_c++;
    }
    public void caprese_minus_c(View view){
        capreze.setVisibility(View.GONE);
        sum -= capreze_n*1200;
        end_num.setText(sum + " amd");
        food.setCaprese(0);
    }
    public void caesar_plus_c(View view){
        caesarc = findViewById(R.id.caesar_num_c);
        String g = Integer.toString(caprese_c);
        caesarc.setText(g);
        caesar_c++;
    }
    public void caesar_minus_c(View view){
        caesar.setVisibility(View.GONE);
        sum -= caesar_n*1000;
        end_num.setText(sum + " amd");
        food.setCaesar(0);
    }
    public void vegetable_plus_c(View view){
        vegetablec = findViewById(R.id.vegetable_num_c);
        String g = Integer.toString(vegetable_c);
        vegetablec.setText(g);
        vegetable_c++;
    }
    public void vegetable_minus_c(View view){
        vegetable.setVisibility(View.GONE);
        sum -= vegetable_n*500;
        end_num.setText(sum + " amd");
        food.setVegetable(0);
    }
    public void arab_plus_c(View view){
        arabc = findViewById(R.id.arab_num_c);
        String g = Integer.toString(arab_c);
        arabc.setText(g);
        arab_c++;
    }
    public void arab_minus_c(View view){
        arabia.setVisibility(View.GONE);
        sum -= arabia_n*700;
        end_num.setText(sum + " amd");
        food.setArab(0);
    }
    public void cappuchino_plus_c(View view){
        cappuchinoc = findViewById(R.id.cappuchino_num_c);
        String g = Integer.toString(cappuchino_c);
        cappuchinoc.setText(g);
        cappuchino_c++;
    }
    public void cappuchino_minus_c(View view){
        cappuchino.setVisibility(View.GONE);
        sum -= cappuchino_n*750;
        end_num.setText(sum + " amd");
        food.setCappuccino(0);
    }
    public void latte_plus_c(View view){
        lattec = findViewById(R.id.latte_num_c);
        String g = Integer.toString(latte_c);
        lattec.setText(g);
        latte_c++;
    }
    public void latte_minus_c(View view){
        latte.setVisibility(View.GONE);
        sum -= latte_n*1000;
        end_num.setText(sum + " amd");
        food.setLatte(0);
    }
    public void mikado_plus_c(View view){
        mikadoc = findViewById(R.id.mikado_num_c);
        String g = Integer.toString(mikado_c);
        mikadoc.setText(g);
        mikado_c++;
    }
    public void mikado_minus_c(View view){
        micado.setVisibility(View.GONE);
        sum -= micado_n*550;
        end_num.setText(sum + " amd");
        food.setMicado(0);
    }
    public void napoleon_plus_c(View view){
        napoleonc = findViewById(R.id.napoleon_num_c);
        String g = Integer.toString(napoleon_c);
        napoleonc.setText(g);
        napoleon_c++;
    }
    public void napoleon_minus_c(View view){
        napoleon.setVisibility(View.GONE);
        sum -= napoleon_n*600;
        end_num.setText(sum + " amd");
        food.setNapoleon(0);
    }
    public void donut_plus_c(View view){
        donutc = findViewById(R.id.donut_num_c);
        String g = Integer.toString(donut_c);
        donutc.setText(g);
        donut_c++;
    }
    public void donut_minus_c(View view){
        donat.setVisibility(View.GONE);
        sum -= donat_n*750;
        end_num.setText(sum + " amd");
        food.setDonat(0);
    }
    public void french_plus_c(View view){
        frenchc = findViewById(R.id.french_num_c);
        String g = Integer.toString(french_c);
        frenchc.setText(g);
        french_c++;
    }
    public void french_minus_c(View view){
        french.setVisibility(View.GONE);
        sum -= french_n*550;
        end_num.setText(sum + " amd");
        food.setFrench(0);
    }
    public void hot_plus_c(View view){
        hot_dogc = findViewById(R.id.hot_num_c);
        String g = Integer.toString(hot_dog_c);
        hot_dogc.setText(g);
        hot_dog_c++;
    }
    public void hot_minus_c(View view){
        hot_dog.setVisibility(View.GONE);
        sum -= hot_dog_n*800;
        end_num.setText(sum + " amd");
        food.setHot_dog(0);
    }
    public void burger_plus_c(View view){
        burgerc = findViewById(R.id.burger_num_c);
        String g = Integer.toString(burger_c);
        burgerc.setText(g);
        burger_c++;
    }
    public void burger_minus_c(View view){
        burger.setVisibility(View.GONE);
        sum -= burger_n*1200;
        end_num.setText(sum + " amd");
        food.setBurger(0);
    }
    public void cola_plus_c(View view){
        colac = findViewById(R.id.cola_num_c);
        String g = Integer.toString(cola_c);
        colac.setText(g);
        cola_c++;
    }
    public void cola_minus_c(View view){
        cola.setVisibility(View.GONE);
        sum -= cola_n*500;
        end_num.setText(sum + " amd");
        food.setCola(0);
    }
    public void fanta_plus_c(View view){
        fantac = findViewById(R.id.fanta_num_c);
        String g = Integer.toString(fanta_c);
        fantac.setText(g);
        fanta_c++;
    }
    public void fanta_minus_c(View view){
        fanta.setVisibility(View.GONE);
        sum -= fanta_n*500;
        end_num.setText(sum + " amd");
        food.setFanta(0);
    }
    public void sprite_plus_c(View view){
        spritec = findViewById(R.id.sprite_num_c);
        String g = Integer.toString(sprite_c);
        spritec.setText(g);
        sprite_c++;
    }
    public void sprite_minus_c(View view){
        sprite.setVisibility(View.GONE);
        sum -= sprite_n*500;
        end_num.setText(sum + " amd");
        food.setSprite(0);
    }
    public void water_plus_c(View view){
        waterc = findViewById(R.id.water_num_c);
        String g = Integer.toString(water_c);
        waterc.setText(g);
        water_c++;
    }
    public void water_minus_c(View view){
        water.setVisibility(View.GONE);
        sum -= water_n*300;
        end_num.setText(sum + " amd");
        food.setWater(0);

    }
/////////////////
    public void meat_cart_c(View view){
        meatc = findViewById(R.id.meat_num_c);
        String g = meatc.getText().toString();
//        meat.setVisibility(View.GONE);
        int n = Integer.parseInt(g);
        if (n == 0){
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
            meat.setVisibility(View.GONE);
        } else if(n > 0){
            food.setMeat(n);
        } else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void cheese_cart_c(View view){
        chessec = findViewById(R.id.cheese_num_c);
        String g = chessec.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setCheese(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void marinade_cart_c(View view){
        marinadc = findViewById(R.id.marinade_num_c);
        String g = marinadc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setMarinade(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void caprese_cart_c(View view){
        capresec = findViewById(R.id.caprese_num_c);
        String g = capresec.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setCaprese(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void caesar_cart_c(View view){
        caesarc = findViewById(R.id.caesar_num_c);
        String g = caesarc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setCaesar(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void vegetable_cart_c(View view){
        vegetablec = findViewById(R.id.vegetable_num_c);
        String g = vegetablec.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setVegetable(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void arab_cart_c(View view){
        arabc = findViewById(R.id.arab_num_c);
        String g = arabc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setArab(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void cappuchino_cart_c(View view){
        cappuchinoc = findViewById(R.id.cappuchino_num_c);
        String g = cappuchinoc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setCappuccino(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void latte_cart_c(View view){
        lattec = findViewById(R.id.latte_num_c);
        String g = lattec.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setLatte(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void french_cart_c(View view){
        frenchc = findViewById(R.id.french_num_c);
        String g = frenchc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setFrench(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void hot_cart_c(View view){
        hot_dogc = findViewById(R.id.hot_num_c);
        String g = hot_dogc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setHot_dog(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void burger_cart_c(View view){
        burgerc = findViewById(R.id.burger_num_c);
        String g = burgerc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setBurger(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void cola_cart_c(View view){
        colac = findViewById(R.id.cola_num_c);
        String g = colac.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setCola(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void fanta_cart_c(View view){
        fantac = findViewById(R.id.fanta_num_c);
        String g = fantac.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setFanta(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void sprite_cart_c(View view){
        spritec = findViewById(R.id.sprite_num_c);
        String g = spritec.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setSprite(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void water_cart_c(View view){
        waterc = findViewById(R.id.water_num_c);
        String g = waterc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setWater(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }

    public void mikado_cart_c(View view){
        mikadoc = findViewById(R.id.mikado_num_c);
        String g = mikadoc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setMicado(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void napoleon_cart_c(View view){
        napoleonc = findViewById(R.id.napoleon_num_c);
        String g = napoleonc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setNapoleon(n);
        }else{
            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
    public void donut_cart_c(View view){
        donutc = findViewById(R.id.donut_num_c);
        String g = donutc.getText().toString();
        int n = Integer.parseInt(g);
        if (n > 0){
            food.setDonat(n);
        }else{

            Toast.makeText(this, "Select the quantity of the dish", Toast.LENGTH_SHORT).show();
        }
        check();
    }
}