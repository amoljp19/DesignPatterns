package com.softaai.designpatterns.kotlin.creational.prototype


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
class Rectangle : Shape() {
    init {
        shapeType = "Rectangle"
    }
    override fun draw() {
        println("Inside Rectangle::draw() method")
    }
}