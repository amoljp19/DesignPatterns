package com.softaai.designpatterns.java.creational.builder.meal.item;

import com.softaai.designpatterns.java.creational.builder.meal.packing.Packing;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public interface Item {

    public String name();
    public Packing packing();
    public float price();

}
