package com.softaai.designpatterns.kotlin.structural.decorator


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
object DecoratedDesignPatternDemo {
    @JvmStatic
    fun main(args: Array<String>){
        var circle = Circle()
        var redCircle = RedShapeDecorator(Circle())
        var redRectangle = RedShapeDecorator(Rectangle())

        println("Circle with normal border")
        circle.draw()

        println("\nCircle of red border")
        redCircle.draw()

        println("\nRectangle of red border")
        redRectangle.draw()
    }
}