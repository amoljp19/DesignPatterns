package com.softaai.designpatterns.java.structural.decorator;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
