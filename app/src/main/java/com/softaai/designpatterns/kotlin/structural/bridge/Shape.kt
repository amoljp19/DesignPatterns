package com.softaai.designpatterns.kotlin.structural.bridge


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
abstract class Shape(drawAPI : DrawAPI) {
    protected lateinit var drawAPI:DrawAPI
    init{
        this.drawAPI = drawAPI
    }
    abstract fun draw()
}