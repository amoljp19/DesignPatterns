package com.softaai.designpatterns.java.creational.builder;

import com.softaai.designpatterns.java.creational.builder.meal.Meal;
import com.softaai.designpatterns.java.creational.builder.meal.MealBuilder;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost : " + nonVegMeal.getCost());
    }
}
