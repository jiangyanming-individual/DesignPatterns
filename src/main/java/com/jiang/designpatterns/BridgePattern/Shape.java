package com.jiang.designpatterns.BridgePattern;

public abstract class Shape {
    //传入drawAPI:
    protected DrawAPI drawAPI;
    public Shape(DrawAPI drawAPI) { //构造方法
        this.drawAPI = drawAPI;
    }

    //抽象方法
    public abstract void draw();
}
