package com.jiang.designpatterns.singlePattern;

public class Singleton {
    //私有的构造器：
    private Singleton() {

    }

    //静态内部类
    private static class  SingleHandler{
        //实例化单例,私有属性
        private static  final Singleton INSTANCEE=new Singleton();
    }
    //返回一个单例模式
    public static Singleton getInstance(){
        return SingleHandler.INSTANCEE;
    }
}
