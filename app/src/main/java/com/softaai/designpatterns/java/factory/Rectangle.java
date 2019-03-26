package com.softaai.designpatterns.java.factory;

/**
 * Created by Amol Pawar on 27-03-2019.
 * softAai Apps
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
