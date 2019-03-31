package com.softaai.designpatterns.kotlin.creational.AbstractFactory.shape

import com.softaai.designpatterns.kotlin.creational.AbstractFactory.AbstractFactory
import com.softaai.designpatterns.kotlin.creational.AbstractFactory.color.Color


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
class ShapeFactory : AbstractFactory() {
    override fun getColor(color: String): Color? {
        return null
    }

    override fun getShape(shape: String): Shape? {
        if(shape.equals("RECTANGLE", ignoreCase = true)){
            return Rectangle()
        }
        else if(shape.equals("SQUARE", ignoreCase = true)){
            return Square()
        }
        else if(shape.equals("CIRCLE", ignoreCase = true)){
            return Circle()
        }

        return null
    }
}