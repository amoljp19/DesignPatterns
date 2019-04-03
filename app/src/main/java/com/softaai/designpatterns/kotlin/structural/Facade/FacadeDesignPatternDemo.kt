package com.softaai.designpatterns.kotlin.structural.Facade


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
object FacadeDesignPatternDemo {
    @JvmStatic
    fun main(args : Array<String>){
        val shapeMaker = ShapeMaker()
        shapeMaker.drawRectangle()
        shapeMaker.drawSquare()
        shapeMaker.drawCircle()
    }
}