package com.softaai.designpatterns.java.structural.facade;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
