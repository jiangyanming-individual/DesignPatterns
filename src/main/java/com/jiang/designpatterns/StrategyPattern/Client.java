package com.jiang.designpatterns.StrategyPattern;

import com.jiang.designpatterns.StrategyPattern.impl.AddStrategy;
import com.jiang.designpatterns.StrategyPattern.impl.Context;
import com.jiang.designpatterns.StrategyPattern.impl.MultiplyStrategy;
import com.jiang.designpatterns.StrategyPattern.impl.SubstractStrategy;

public class Client {
    public static void main(String[] args) {
        //通过Context进行策略切换
        Context context = new Context(new AddStrategy());
        System.out.println(context.executeStrategy(1, 2));

        Context context2 = new Context(new MultiplyStrategy());
        System.out.println(context2.executeStrategy(1, 2));

        Context context3 = new Context(new SubstractStrategy());
        System.out.println(context3.executeStrategy(5, 2));
    }
}
