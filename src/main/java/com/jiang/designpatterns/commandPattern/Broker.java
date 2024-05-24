package com.jiang.designpatterns.commandPattern;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<Order>();

    //添加order
    public void takeOrder(Order order) {
        orders.add(order);
    }

    //调用order
    public void placeOrder() {
        for (Order order : orders) {
            order.excute(); //调用命令
        }
        orders.clear(); //清空；
    }
}
