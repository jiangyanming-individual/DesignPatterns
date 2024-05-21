package com.jiang.designpatterns.builderPattern.Itemimpl;

import com.jiang.designpatterns.builderPattern.Item;
import com.jiang.designpatterns.builderPattern.Packing;
import com.jiang.designpatterns.builderPattern.Packimpl.Wrapper;

public abstract class Burger implements Item {

    //纸盒包装
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();

}
