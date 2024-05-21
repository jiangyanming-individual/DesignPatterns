package com.jiang.designpatterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> itemList=new ArrayList();
    public void addItem(Item item){
        itemList.add(item);
    }
    //得到套餐的售价
    public float getCost(){
        float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    //展示信息
    public void showItem(){
        for (Item item : itemList) {
            System.out.println("item name: "+ item.name());
            System.out.println("item price: "+ item.price());
            System.out.println("item packing: "+ item.packing().pack()); //得到包装；

        }
    }
}
