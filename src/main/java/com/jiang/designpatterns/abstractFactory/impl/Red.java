package com.jiang.designpatterns.abstractFactory.impl;

import com.jiang.designpatterns.abstractFactory.Color;

public class Red implements Color {
    @Override
    public void write() {
        System.out.println("有画红色的能力");
    }

}
