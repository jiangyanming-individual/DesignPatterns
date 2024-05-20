package com.jiang.designpatterns.singlePattern;

public class HungryDemo {


    private static final  HungryDemo instance = new HungryDemo();

    public static HungryDemo getInstance(){
        return instance;
    }
}
