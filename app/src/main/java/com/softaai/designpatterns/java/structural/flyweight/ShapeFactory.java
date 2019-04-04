package com.softaai.designpatterns.java.structural.flyweight;

import java.util.HashMap;

/**
 * Created by Amol Pawar on 04-04-2019.
 * softAai Apps
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
