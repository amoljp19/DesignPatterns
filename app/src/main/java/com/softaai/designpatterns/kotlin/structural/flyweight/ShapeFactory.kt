package com.softaai.designpatterns.kotlin.structural.flyweight


/**
 * Created by Amol Pawar on 04-04-2019.
 * softAai Apps
 */
object ShapeFactory {

    private val circleMap : HashMap<String, Shape> = HashMap()


    fun getCircle(color : String) :Shape{
        var circle = circleMap.get(color)
        if(circle == null){
            circle = Circle(color)
            circleMap.put(color, circle)
            println("Creating circle of color : " + color);
        }
        return circle
    }
}