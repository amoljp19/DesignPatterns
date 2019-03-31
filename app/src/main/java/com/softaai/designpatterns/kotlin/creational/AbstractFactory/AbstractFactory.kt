package com.softaai.designpatterns.kotlin.creational.AbstractFactory

import com.softaai.designpatterns.kotlin.creational.AbstractFactory.color.Color
import com.softaai.designpatterns.kotlin.creational.AbstractFactory.shape.Shape


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */

abstract class AbstractFactory{
    abstract fun getColor(color:String) : Color?
    abstract fun getShape(shape:String) : Shape?
}