package com.softaai.designpatterns.kotlin.structural.decorator


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
open class ShapeDecorator(decoratedShape : Shape) : Shape {
    protected var decoratedShape : Shape

    init {
        this.decoratedShape = decoratedShape
    }
    override fun draw() {
        this.decoratedShape.draw()
    }
}