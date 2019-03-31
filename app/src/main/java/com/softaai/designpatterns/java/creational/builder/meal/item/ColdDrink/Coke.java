package com.softaai.designpatterns.java.creational.builder.meal.item.ColdDrink;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
