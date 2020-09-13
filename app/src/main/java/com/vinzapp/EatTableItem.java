package com.vinzapp;



public class EatTable {

    private String starter;
    private String main;
    private String dessert;
    private String time;

    public EatTable (String starter, String main, String dessert, String time){

        this.starter = starter;
        this.main = main;
        this.dessert = dessert;
        this.time = time;
    }


    public EatTable (String main, String dessert, String time){

        this.main = main;
        this.dessert = dessert;
        this.time = time;
    }

    public EatTable (String main, String time){

        this.main = main;
        this.time = time;
    }

    public String getStarter() {
        return starter;
    }

    public String getMain() {
        return main;
    }

    public String getDessert() {
        return dessert;
    }

    public String getTime() {
        return time;
    }
}
