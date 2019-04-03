package com.softaai.designpatterns.kotlin.structural.Facade


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class Rectangle : Shape{
    override fun draw() {
        println("Inside Rectangle::draw() method")
    }
}