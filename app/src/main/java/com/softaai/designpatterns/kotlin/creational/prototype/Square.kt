package com.softaai.designpatterns.kotlin.creational.prototype


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
class Square : Shape() {
    init {
        shapeType = "Square"
    }
    override fun draw() {
        println("Inside Square::draw() method")
    }
}