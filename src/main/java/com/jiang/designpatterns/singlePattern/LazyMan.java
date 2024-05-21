package com.jiang.designpatterns.singlePattern;

public class LazyMan {

    /**
     * 加上volatile 关键字禁止指令重排：
     */
    private volatile static LazyMan lazyMan;

    private LazyMan(){

    }

    /**
     * 双重检测锁模式：
     * @return
     */
    public  static LazyMan getInstance(){
        if (lazyMan == null){
            //加锁
            synchronized (LazyMan.class){
                if (lazyMan == null){
                    lazyMan=new LazyMan();
                }
            }
        }
        return lazyMan;
    }
}
