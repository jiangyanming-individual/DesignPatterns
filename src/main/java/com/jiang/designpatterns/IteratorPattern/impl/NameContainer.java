package com.jiang.designpatterns.IteratorPattern.impl;

import com.jiang.designpatterns.IteratorPattern.Container;
import com.jiang.designpatterns.IteratorPattern.Iterator;

public class NameContainer implements Container {

    //数组
    private String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(); //返回迭代器；
    }
    /**
     * 成员内部类：
     */
    private class NameIterator implements Iterator{
        private int index=0;

        @Override
        public boolean hasNext() {
            if (index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
