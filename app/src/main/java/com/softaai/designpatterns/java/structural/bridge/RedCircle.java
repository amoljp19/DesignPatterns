package com.softaai.designpatterns.java.structural.bridge;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color : red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
