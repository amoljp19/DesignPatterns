package com.softaai.designpatterns.kotlin.structural.decorator


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class RedShapeDecorator(decoratedShape: Shape) : ShapeDecorator(decoratedShape) {

    override fun draw() {
        decoratedShape.draw()
        setRedBorder(decoratedShape)
    }

    private fun setRedBorder(decoratedShape : Shape){
        println("Border Color : Red")
    }
}