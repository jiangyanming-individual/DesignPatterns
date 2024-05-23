package com.jiang.designpatterns.composite;

/**
 * 组合体抽象类
 */
public abstract class Component {

    //权限仅次于public:
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    //实现体类：
    public void print(){
        print(0);
    }

    //抽象类
    abstract void print(int level);

    abstract public void add(Component component);

    abstract public void  remove(Component component);


}
