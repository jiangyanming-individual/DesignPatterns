package com.jiang.designpatterns.singleFactory.impl;

import com.jiang.designpatterns.singleFactory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("实现画圆的能力");
    }

}
