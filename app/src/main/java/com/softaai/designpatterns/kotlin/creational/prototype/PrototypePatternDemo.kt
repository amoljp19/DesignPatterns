package com.softaai.designpatterns.kotlin.creational.prototype


/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
object PrototypePatternDemo{
    @JvmStatic
    fun main(args: Array<String>){
        ShapeCache.loadCache()

        val clonedShape : Shape = ShapeCache.getShape("1")
        println("Shape : " + clonedShape.getType())

        val clonedShape2 : Shape = ShapeCache.getShape("2")
        println("Shape : " + clonedShape2.getType())

        val clonedShape3 : Shape = ShapeCache.getShape("3")
        println("Shape : " + clonedShape3.getType())
    }
}