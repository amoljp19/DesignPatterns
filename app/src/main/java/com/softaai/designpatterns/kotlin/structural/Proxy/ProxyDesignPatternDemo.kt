package com.softaai.designpatterns.kotlin.structural.Proxy


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
object ProxyDesignPatternDemo {
    @JvmStatic
    fun main(args : Array<String>){
        var image = ProxyImage("test_10mb.jpg")
        image.display()
        println()
        image.display()
    }
}