package com.jiang.designpatterns.chainPattern;

public abstract class AbstractLogger {
//
//    //常量
//    public static int INFO=1;
//    public static int DEBUG=2;
//    public static int ERROR=3;

    //变量：
    protected int level;

    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message) {
        if (this.level <=level){
            write(message);
        }
        if (nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }

    abstract protected void write(String message);

}
