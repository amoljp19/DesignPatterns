package com.softaai.designpatterns.java.creational.builder.meal.item.Burger;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 55.5f;
    }
}
