package com.jiang.designpatterns.builderPattern;

public class MealBuilderDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegBurger();
        System.out.println("vegMeal item: ");
        vegMeal.showItem();
        System.out.println("vegMeal cost price:");
        System.out.println(vegMeal.getCost());

        System.out.println("===============================");
        Meal chickenMeal = mealBuilder.prepareNonVegBurger();
        System.out.println("chickenMeal item: ");
        chickenMeal.showItem();
        System.out.println("chickenMeal cost price:");
        System.out.println(chickenMeal.getCost());

    }
}
