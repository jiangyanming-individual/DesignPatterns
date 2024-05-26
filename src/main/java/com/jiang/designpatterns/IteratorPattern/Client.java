package com.jiang.designpatterns.IteratorPattern;

import com.jiang.designpatterns.IteratorPattern.impl.NameContainer;

public class Client {
    public static void main(String[] args) {

        NameContainer nameContainer = new NameContainer();
        for (Iterator iterator = nameContainer.getIterator(); iterator.hasNext();){
            System.out.println("=================>");
            String name = (String) iterator.next(); //返回迭代数据
            System.out.println("Name: " + name);
            System.out.println(iterator.hasNext());
            System.out.println("<=================");
        }

        Iterator iterator = nameContainer.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
