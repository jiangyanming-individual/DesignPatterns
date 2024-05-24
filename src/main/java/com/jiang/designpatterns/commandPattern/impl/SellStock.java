package com.jiang.designpatterns.commandPattern.impl;

import com.jiang.designpatterns.commandPattern.Order;
import com.jiang.designpatterns.commandPattern.Stock;

public class SellStock implements Order {

    private Stock abcstock;
    public SellStock(Stock abcstock) {
        this.abcstock = abcstock;
    }

    @Override
    public void excute() {
        abcstock.sell();
    }
}
