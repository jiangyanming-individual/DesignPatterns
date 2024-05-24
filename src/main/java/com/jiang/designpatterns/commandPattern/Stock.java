package com.jiang.designpatterns.commandPattern;

public class Stock {

    private String name="ABC";
    private int price=10;


    public void buy(){
        System.out.println("Stock [ Name: "+name+", price: " + price +" ] bought");
    }


    public void sell(){
        System.out.println("Stock [ Name: "+name+", price: " + price +" ] sell");
    }
}
