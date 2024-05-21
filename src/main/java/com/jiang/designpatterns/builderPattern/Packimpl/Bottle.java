package com.jiang.designpatterns.builderPattern.Packimpl;

import com.jiang.designpatterns.builderPattern.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶子包装";
    }

}
