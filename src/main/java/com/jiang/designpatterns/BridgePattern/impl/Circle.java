package com.jiang.designpatterns.BridgePattern.impl;

import com.jiang.designpatterns.BridgePattern.DrawAPI;
import com.jiang.designpatterns.BridgePattern.Shape;

public class Circle extends Shape {
    private int x,y, radius;

    //调用父类的方法
    public Circle(int x, int y, int radius,DrawAPI drawAPI) {
        super(drawAPI);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    //实现Shape的方法：
    @Override
    public void draw() {
        //具体实现的方法，通过组合的方式实现：
        drawAPI.drawCircle(x,y,radius);
    }
}
