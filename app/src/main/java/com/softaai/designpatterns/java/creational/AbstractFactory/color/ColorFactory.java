package com.softaai.designpatterns.java.creational.AbstractFactory.color;

import com.softaai.designpatterns.java.creational.AbstractFactory.AbstractFactory;
import com.softaai.designpatterns.java.creational.AbstractFactory.shape.Circle;
import com.softaai.designpatterns.java.creational.AbstractFactory.shape.Rectangle;
import com.softaai.designpatterns.java.creational.AbstractFactory.shape.Shape;
import com.softaai.designpatterns.java.creational.AbstractFactory.shape.Square;

/**
 * Created by Amol Pawar on 27-03-2019.
 * softAai Apps
 */
public class ColorFactory extends AbstractFactory {

    public Color getColor(String color){
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }
        else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        else if(color.equalsIgnoreCase("Green")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
