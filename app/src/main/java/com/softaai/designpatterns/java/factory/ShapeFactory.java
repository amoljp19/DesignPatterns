package com.softaai.designpatterns.java.factory;

/**
 * Created by Amol Pawar on 27-03-2019.
 * softAai Apps
 */
public class ShapeFactory {

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
