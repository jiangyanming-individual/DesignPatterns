package com.jiang.designpatterns.factoryPattern.impl;

import com.jiang.designpatterns.factoryPattern.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("实现了画矩形的能力");
    }

}
