package com.jiang.designpatterns.builderPattern.impl;

import com.jiang.designpatterns.builderPattern.Itemimpl.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
