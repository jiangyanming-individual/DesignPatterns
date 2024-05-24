package com.jiang.designpatterns.chainPattern;

public enum LoggerConstant {

    /**
     * 枚举类型
     */
    INFO("信息",1),
    DEBUG("调试",2),
    ERROR("错误",3);

    private String name;
    private int code;

    LoggerConstant(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

