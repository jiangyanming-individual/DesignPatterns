package com.jiang.designpatterns.factoryPattern.impl;

import com.jiang.designpatterns.factoryPattern.Color;

public class Red implements Color {
    @Override
    public void write() {
        System.out.println("有画红色的能力");
    }

}
