package com.jiang.designpatterns.singleFactory.impl;

import com.jiang.designpatterns.singleFactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("实现了画正方形的能力");
    }

}
