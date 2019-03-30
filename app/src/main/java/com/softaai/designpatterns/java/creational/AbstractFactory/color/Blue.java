package com.softaai.designpatterns.java.creational.AbstractFactory.color;

/**
 * Created by Amol Pawar on 31-03-2019.
 * softAai Apps
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method");
    }
}
