package com.jiang.designpatterns.singleFactory.impl;

import com.jiang.designpatterns.singleFactory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("实现了画矩形的能力");
    }

}
