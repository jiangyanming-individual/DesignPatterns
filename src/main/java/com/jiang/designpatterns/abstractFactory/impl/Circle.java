package com.jiang.designpatterns.abstractFactory.impl;

import com.jiang.designpatterns.abstractFactory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("实现画圆的能力");
    }

}
