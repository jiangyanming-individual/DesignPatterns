package com.jiang.designpatterns.commandPattern.impl;


import com.jiang.designpatterns.commandPattern.Order;
import com.jiang.designpatterns.commandPattern.Stock;

public class BuyStock implements Order {

    //注入属性
    private Stock abcstock;

    public BuyStock(Stock abcstock) {
        this.abcstock = abcstock;
    }

    @Override
    public void excute() {
        abcstock.buy();
    }


}
