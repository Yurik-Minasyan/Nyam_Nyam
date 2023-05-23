package com.example.nyam_nyam;

import android.app.Application;

public class Food_Nubers extends Application {
    private String Meat;
    private String Cheese;
    private String Marinade;
    public String getMeat(){
        return Meat;
    }
    public void setMeat(String Meat){
        this.Meat = Meat;
    }
    public String getCheese(){
        return Cheese;
    }
    public void setCheese(String Cheese){
        this.Cheese = Cheese;
    }
    public String getMarinade(){
        return Marinade;
    }
    public void setMarinade(String Marinade){
        this.Marinade = Marinade;
    }

}
