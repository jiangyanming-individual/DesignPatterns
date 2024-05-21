package com.jiang.designpatterns.abstractFactory.impl;

import com.jiang.designpatterns.abstractFactory.Color;

public class Yellow implements Color {
    @Override
    public void write() {
        System.out.println("有画黄色的能力");
    }

}
