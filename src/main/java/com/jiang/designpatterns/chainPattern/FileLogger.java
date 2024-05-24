package com.jiang.designpatterns.chainPattern;

public class FileLogger extends AbstractLogger{


    public FileLogger(int level) {
        this.level =level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger Console::Logger:"+ message);
    }
}
