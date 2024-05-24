package com.jiang.designpatterns.chainPattern;

public class ConsoleLogger extends AbstractLogger {


    //给level赋值：
    public ConsoleLogger(int level) {
        this.level =level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger:" + message);
    }
}
