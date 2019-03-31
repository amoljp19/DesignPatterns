package com.softaai.designpatterns.java.creational.builder.meal.item.Burger;

import com.softaai.designpatterns.java.creational.builder.meal.item.Item;
import com.softaai.designpatterns.java.creational.builder.meal.packing.Packing;
import com.softaai.designpatterns.java.creational.builder.meal.packing.Wrapper;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
