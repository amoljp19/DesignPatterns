package com.softaai.designpatterns.java.creational.AbstractFactory;

import com.softaai.designpatterns.java.creational.AbstractFactory.color.Color;
import com.softaai.designpatterns.java.creational.AbstractFactory.shape.Shape;

/**
 * Created by Amol Pawar on 31-03-2019.
 * softAai Apps
 */
public abstract class AbstractFactory {
    protected abstract Color getColor(String color);
    protected abstract Shape getShape(String shape);
}
