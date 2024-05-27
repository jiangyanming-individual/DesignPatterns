package com.jiang.designpatterns.StrategyPattern.impl;

import com.jiang.designpatterns.StrategyPattern.Strategy;

public class SubstractStrategy implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return  num1 - num2;
    }
}
