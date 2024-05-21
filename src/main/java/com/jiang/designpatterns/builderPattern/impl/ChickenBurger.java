package com.jiang.designpatterns.builderPattern.impl;

import com.jiang.designpatterns.builderPattern.Itemimpl.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.0f;
    }

}
