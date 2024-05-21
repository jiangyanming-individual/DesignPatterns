package com.jiang.designpatterns.builderPattern.Packimpl;

import com.jiang.designpatterns.builderPattern.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "纸盒包装";
    }

}
