package com.jiang.designpatterns.chainPattern;



public class Client {


    public static AbstractLogger getChainLogger(){
        //设置等级：
        ErrorLogger errorLogger = new ErrorLogger(LoggerConstant.ERROR.getCode());
        FileLogger fileLogger = new FileLogger(LoggerConstant.DEBUG.getCode());
        ConsoleLogger consoleLogger = new ConsoleLogger(LoggerConstant.INFO.getCode());

        //设置链
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chainLogger = getChainLogger(); //从errorLogger开始
        chainLogger.logMessage(LoggerConstant.INFO.getCode(), "This is an information"); //等级为1
        System.out.println("======================================================>");
        chainLogger.logMessage(LoggerConstant.DEBUG.getCode(), "This is a debug level information"); //等级为2
        System.out.println("=====================================================>");
        chainLogger.logMessage(LoggerConstant.ERROR.getCode(), "This is an error information.");//等级为3

    }
}
