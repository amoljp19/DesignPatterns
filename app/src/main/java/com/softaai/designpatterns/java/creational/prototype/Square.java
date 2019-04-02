package com.softaai.designpatterns.java.creational.prototype;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}


