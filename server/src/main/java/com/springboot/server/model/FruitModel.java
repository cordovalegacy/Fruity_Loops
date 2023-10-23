package com.springboot.server.model; //this line gives this file access to the java application

public class FruitModel {

    private String name; //this is a private variable for the fruit name
    private int price; //this is a private variable for the fruit price

    public FruitModel(String name, int price){ //this is the constructor that we call directly on in the controller
        this.name = name;
        this.price = price;
    }

    //getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
