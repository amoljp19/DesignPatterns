package com.softaai.designpatterns.kotlin.structural.bridge


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
object BridgeDesignPatternDemo {
    @JvmStatic
    fun main(args : Array<String>){
        val redCircle = Circle(100,100, 10, RedCircle())
        val greenCircle = Circle(100,100,10, GreenCircle())
        redCircle.draw()
        greenCircle.draw()
    }
}