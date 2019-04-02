package com.softaai.designpatterns.java.creational.prototype;



/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
