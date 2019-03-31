package com.softaai.designpatterns.kotlin.creational.AbstractFactory

import com.softaai.designpatterns.kotlin.creational.AbstractFactory.color.Color
import com.softaai.designpatterns.kotlin.creational.AbstractFactory.shape.Shape


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
object AbstractFactoryPatternDemo {
    @JvmStatic    // we can use this with either object or companion object and for testing purpose we use only
    fun main(args:Array<String>){

       val shapeFactory:AbstractFactory?
       shapeFactory = FactoryProducer.getFactory("Shape")

       val rectangle: Shape?
       rectangle = shapeFactory?.getShape("Rectangle")
       rectangle?.draw()

       val square:Shape?
       square = shapeFactory?.getShape("Square")
       square?.draw()

       val circle:Shape?
       circle = shapeFactory?.getShape("Circle")
       circle?.draw()



       val colorFactory:AbstractFactory?
       colorFactory = FactoryProducer.getFactory("Color")

       val red: Color?
       red = colorFactory?.getColor("RED")
       red?.fill()

       val blue: Color?
       blue = colorFactory?.getColor("BLUE")
       blue?.fill()

       val green: Color?
       green = colorFactory?.getColor("GREEN")
       green?.fill()

    }
}