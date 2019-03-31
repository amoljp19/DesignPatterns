package com.softaai.designpatterns.java.creational.builder.meal.item.ColdDrink;

import com.softaai.designpatterns.java.creational.builder.meal.item.Item;
import com.softaai.designpatterns.java.creational.builder.meal.packing.Bottle;
import com.softaai.designpatterns.java.creational.builder.meal.packing.Packing;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
