package com.softaai.designpatterns.java.creational.AbstractFactory.shape;

import com.softaai.designpatterns.java.creational.AbstractFactory.AbstractFactory;
import com.softaai.designpatterns.java.creational.AbstractFactory.color.Color;

/**
 * Created by Amol Pawar on 27-03-2019.
 * softAai Apps
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    protected Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        return null;
    }
}
