package com.jiang.designpatterns.factoryPattern.impl;

import com.jiang.designpatterns.factoryPattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("实现画圆的能力");
    }

}
