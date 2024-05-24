package com.jiang.designpatterns.commandPattern;

import com.jiang.designpatterns.commandPattern.impl.BuyStock;
import com.jiang.designpatterns.commandPattern.impl.SellStock;

public class CommandPatternDemo {

    public static void main(String[] args) {

        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        //添加order
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        //调用
        broker.placeOrder();


    }
}
