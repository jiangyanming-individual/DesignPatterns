package com.jiang.designpatterns.builderPattern.Itemimpl;

import com.jiang.designpatterns.builderPattern.Item;
import com.jiang.designpatterns.builderPattern.Packing;
import com.jiang.designpatterns.builderPattern.Packimpl.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();

}
