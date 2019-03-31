package com.softaai.designpatterns.java.creational.builder.meal.item.Burger;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
