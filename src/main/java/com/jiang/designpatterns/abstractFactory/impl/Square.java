package com.jiang.designpatterns.abstractFactory.impl;

import com.jiang.designpatterns.abstractFactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("实现了画正方形的能力");
    }

}
