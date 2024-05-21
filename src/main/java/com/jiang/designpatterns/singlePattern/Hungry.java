package com.jiang.designpatterns.singlePattern;

public class Hungry {

    /**
     * 饿汉式：无论是否需要直接一把梭哈：
     */
    private static final Hungry HUNGRY = new Hungry();

    /**
     * 私有构造器：无法通过new的方式获得对象实例
     */
    private Hungry(){

    }

    public static Hungry getInstance(){
        return HUNGRY;
    }
}
