package com.softaai.designpatterns.kotlin.structural.flyweight


/**
 * Created by Amol Pawar on 04-04-2019.
 * softAai Apps
 */
object FlyWeightDesignPattern {
    private val colors = arrayOf("Red", "Green", "Blue", "White", "Black")

    @JvmStatic
    fun main(args : Array<String>){
        for( i in 0..20){
            var circle :Circle = ShapeFactory.getCircle(getRandomColor()) as Circle

            circle.setX(getRandomX())
            circle.setY(getRandomY())
            circle.setRadius(100)
            circle.draw()

        }
    }

    private fun getRandomColor() : String{
        return colors[((Math.random() * colors.size).toInt())]
    }

    private fun getRandomX() : Int {
        return ((Math.random() * 100).toInt())
    }

    private fun getRandomY() : Int {
        return ((Math.random() * 100).toInt())
    }
}