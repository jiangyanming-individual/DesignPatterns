package com.jiang.designpatterns.abstractFactory.impl;

import com.jiang.designpatterns.abstractFactory.Color;

public class Blue implements Color {
    @Override
    public void write() {
        System.out.println("有画蓝色的能力");
    }

}
