package com.softaai.designpatterns.kotlin.creational.AbstractFactory

import com.softaai.designpatterns.kotlin.creational.AbstractFactory.color.ColorFactory
import com.softaai.designpatterns.kotlin.creational.AbstractFactory.shape.ShapeFactory


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
object FactoryProducer {

    fun getFactory(choice:String): AbstractFactory? {

        if(choice.equals("Color", ignoreCase = true)){
            return ColorFactory()
        }
        else if(choice.equals("Shape", ignoreCase = true)){
            return ShapeFactory()
        }

        return null
    }
}