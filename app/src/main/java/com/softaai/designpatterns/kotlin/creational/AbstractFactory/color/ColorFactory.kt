package com.softaai.designpatterns.kotlin.creational.AbstractFactory.color

import com.softaai.designpatterns.kotlin.creational.AbstractFactory.AbstractFactory
import com.softaai.designpatterns.kotlin.creational.AbstractFactory.shape.Shape


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
class ColorFactory : AbstractFactory() {
    override fun getColor(color: String): Color? {
        if(color.equals("RED", ignoreCase = true)){
            return Red()
        }
        else if(color.equals("BLUE", ignoreCase = true)){
            return Blue()
        }
        else if(color.equals("GREEN", ignoreCase = true)){
            return Green()
        }
        return null
    }

    override fun getShape(shape: String): Shape? {
        return null
    }
}