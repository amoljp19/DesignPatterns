package com.softaai.designpatterns.java.creational.AbstractFactory;

import com.softaai.designpatterns.java.creational.AbstractFactory.color.Color;
import com.softaai.designpatterns.java.creational.AbstractFactory.color.ColorFactory;
import com.softaai.designpatterns.java.creational.AbstractFactory.shape.Shape;

/**
 * Created by Amol Pawar on 31-03-2019.
 * softAai Apps
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args){

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Color red = colorFactory.getColor("Red");
        red.fill();
        Color blue = colorFactory.getColor("Blue");
        blue.fill();
        Color green = colorFactory.getColor("green");
        green.fill();
    }
}
