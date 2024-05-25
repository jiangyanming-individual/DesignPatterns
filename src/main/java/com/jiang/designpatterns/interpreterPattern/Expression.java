package com.jiang.designpatterns.interpreterPattern;

public abstract class Expression {

    //上下文
    public abstract boolean interpret(String context);
}
