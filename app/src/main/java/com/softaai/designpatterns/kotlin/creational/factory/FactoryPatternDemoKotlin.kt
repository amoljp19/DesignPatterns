package com.softaai.designpatterns.kotlin.creational.factory


/**
 * Created by Amol Pawar on 28-03-2019.
 * softAai Apps
 */
class FactoryPatternDemoKotlin {

    fun main(args : Array<String>){
        val shapeFactory = ShapeFactory()

        val rectangleShape = shapeFactory.getShape("Rectangle")
        rectangleShape?.draw()

        val squareShape = shapeFactory.getShape("Square")
        squareShape?.draw()

        var circleShape = shapeFactory.getShape("Circle")
        circleShape?.draw()
    }
}