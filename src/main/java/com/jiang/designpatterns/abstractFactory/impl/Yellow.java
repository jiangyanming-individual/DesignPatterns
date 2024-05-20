package com.jiang.designpatterns.factoryPattern.impl;

import com.jiang.designpatterns.factoryPattern.Color;

public class Yellow implements Color {
    @Override
    public void write() {
        System.out.println("有画黄色的能力");
    }

}
