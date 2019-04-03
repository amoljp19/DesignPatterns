package com.softaai.designpatterns.java.structural.decorator;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color : Red");
    }
}
