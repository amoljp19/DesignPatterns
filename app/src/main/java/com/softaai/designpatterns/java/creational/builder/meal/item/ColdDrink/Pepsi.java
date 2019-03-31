package com.softaai.designpatterns.java.creational.builder.meal.item.ColdDrink;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
