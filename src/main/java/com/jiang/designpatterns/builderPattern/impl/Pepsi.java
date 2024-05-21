package com.jiang.designpatterns.builderPattern.impl;

import com.jiang.designpatterns.builderPattern.Itemimpl.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事";
    }

    @Override
    public float price() {
        return 15.0f;
    }

}
