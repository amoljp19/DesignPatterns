package com.softaai.designpatterns.java.structural.bridge;

import com.softaai.designpatterns.java.structural.bridge.Shape;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
       drawAPI.drawCircle(radius, x, y);
    }
}
