package com.softaai.designpatterns.java.creational.builder.meal;

import com.softaai.designpatterns.java.creational.builder.meal.item.Burger.ChickenBurger;
import com.softaai.designpatterns.java.creational.builder.meal.item.Burger.VegBurger;
import com.softaai.designpatterns.java.creational.builder.meal.item.ColdDrink.Coke;
import com.softaai.designpatterns.java.creational.builder.meal.item.ColdDrink.Pepsi;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
      Meal meal = new Meal();
      meal.addItems(new VegBurger());
      meal.addItems(new Coke());
      return meal;
    }


    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItems(new ChickenBurger());
        meal.addItems(new Pepsi());
        return meal;
    }
}
