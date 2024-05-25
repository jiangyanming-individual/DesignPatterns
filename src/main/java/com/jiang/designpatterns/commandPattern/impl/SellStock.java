package com.jiang.designpatterns.commandPattern.impl;

import com.jiang.designpatterns.commandPattern.Order;
import com.jiang.designpatterns.commandPattern.Stock;

public class SellStock implements Order {
    //封装命令：Stock
    private Stock abcstock;
    public SellStock(Stock abcstock) {
        this.abcstock = abcstock;
    }

    //执行命令：
    @Override
    public void excute() {
        abcstock.sell();
    }
}
