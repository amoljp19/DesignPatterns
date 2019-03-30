package com.softaai.designpatterns.java.creational.AbstractFactory;

import com.softaai.designpatterns.java.creational.AbstractFactory.color.ColorFactory;
import com.softaai.designpatterns.java.creational.AbstractFactory.shape.ShapeFactory;

/**
 * Created by Amol Pawar on 31-03-2019.
 * softAai Apps
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
