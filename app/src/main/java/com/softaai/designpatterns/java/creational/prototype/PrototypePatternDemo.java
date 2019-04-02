package com.softaai.designpatterns.java.creational.prototype;

/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
public class PrototypePatternDemo {

    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
