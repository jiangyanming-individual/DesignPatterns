package com.jiang.designpatterns.builderPattern.impl;

import com.jiang.designpatterns.builderPattern.Itemimpl.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public float price() {
        return 10.0f;
    }

}
