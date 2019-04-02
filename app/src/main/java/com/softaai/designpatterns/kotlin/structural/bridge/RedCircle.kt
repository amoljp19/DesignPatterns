package com.softaai.designpatterns.kotlin.structural.bridge


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class RedCircle : DrawAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing circle[color : red, radius : " + radius + ", x : " + x + ", y : " + y + "]")
    }
}