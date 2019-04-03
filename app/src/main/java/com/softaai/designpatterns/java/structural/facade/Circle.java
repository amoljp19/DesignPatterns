package com.softaai.designpatterns.java.structural.facade;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
