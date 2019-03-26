package com.softaai.designpatterns.java.factory;

/**
 * Created by Amol Pawar on 27-03-2019.
 * softAai Apps
 */
public class FactoryPatternDemo {

    /*
     * Best way to test writen code in android studio, only run perticular method
     * It(after gradle buid finish) will show output in Run Tab, but if we tried to run it at class level code
     * won't be run and shows error because it's android studio and not any Java IDE
     */

    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangleShape = shapeFactory.getShape("rectangle");
        rectangleShape.draw();

        Shape squareShape = shapeFactory.getShape("square");
        squareShape.draw();

        Shape circleShape = shapeFactory.getShape("circle");
        circleShape.draw();
    }
}
