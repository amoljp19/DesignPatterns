package com.softaai.designpatterns.java.structural.decorator;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class DecoratorPatternDemo {

    public static void main(String[] args){
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectngle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectngle.draw();
    }
}
