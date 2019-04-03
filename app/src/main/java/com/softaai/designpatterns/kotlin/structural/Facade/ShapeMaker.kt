package com.softaai.designpatterns.kotlin.structural.Facade


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class ShapeMaker{
    private var rectangle : Shape
    private var square : Shape
    private var circle : Shape

    init {
        this.rectangle = Rectangle()
        this.square = Square()
        this.circle = Circle()
    }

    fun drawRectangle(){
        rectangle.draw()
    }

    fun drawSquare(){
        square.draw()
    }

    fun drawCircle(){
        circle.draw()
    }

}