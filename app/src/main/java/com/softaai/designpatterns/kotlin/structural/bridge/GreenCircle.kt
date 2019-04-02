package com.softaai.designpatterns.kotlin.structural.bridge


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class GreenCircle : DrawAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing Circle[color : red, radius : " + radius + ", x : " + x + ", y : " + y + "]")
    }
}