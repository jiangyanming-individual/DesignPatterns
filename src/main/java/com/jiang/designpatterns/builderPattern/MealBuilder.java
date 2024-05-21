package com.jiang.designpatterns.builderPattern;

import com.jiang.designpatterns.builderPattern.impl.ChickenBurger;
import com.jiang.designpatterns.builderPattern.impl.Coke;
import com.jiang.designpatterns.builderPattern.impl.Pepsi;
import com.jiang.designpatterns.builderPattern.impl.VegBurger;

public class MealBuilder {

    public Meal prepareVegBurger(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
    public Meal prepareNonVegBurger(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
