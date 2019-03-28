package com.softaai.designpatterns.kotlin.creational.factory


/**
 * Created by Amol Pawar on 28-03-2019.
 * softAai Apps
 */
class ShapeFactory {
    fun getShape(shapeType: String) : Shape? {

        if(shapeType.equals("Rectangle", ignoreCase = true)){
            return Rectangle()
        }
        else if(shapeType.equals("Square", ignoreCase = true)){
            return Square()
        }
        else if(shapeType.equals("Circle", ignoreCase = true)){
            return Circle()
        }

        return null
    }
}