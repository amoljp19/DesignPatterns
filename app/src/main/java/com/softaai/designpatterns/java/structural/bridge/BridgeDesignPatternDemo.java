package com.softaai.designpatterns.java.structural.bridge;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class BridgeDesignPatternDemo {

    public static void main(String[] args){
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
