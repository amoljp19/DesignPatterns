package com.softaai.designpatterns.kotlin.structural.flyweight


/**
 * Created by Amol Pawar on 04-04-2019.
 * softAai Apps
 */
class Circle(color:String) : Shape{
    private var color : String
    private var x : Int = 0
    private var y = 0
    private var radius = 0

    init {
        this.color = color
    }

    fun setX(x : Int){
        this.x = x
    }

    fun setY(y : Int){
        this.y = y
    }

    fun setRadius(radius : Int){
        this.radius = radius
    }

    override fun draw() {
        println("Circle : Draw() [Color : " + color + ", x : " + x +  ", y : " + y + ", radius : " + radius + " ]")
    }
}