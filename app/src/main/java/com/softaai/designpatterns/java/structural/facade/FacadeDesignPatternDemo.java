package com.softaai.designpatterns.java.structural.facade;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class FacadeDesignPatternDemo {
    public static void main(String[] args){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
    }
}
