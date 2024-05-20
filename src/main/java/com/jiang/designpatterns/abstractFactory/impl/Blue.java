package com.jiang.designpatterns.factoryPattern.impl;

import com.jiang.designpatterns.factoryPattern.Color;

public class Blue implements Color {
    @Override
    public void write() {
        System.out.println("有画蓝色的能力");
    }

}
