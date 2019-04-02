package com.softaai.designpatterns.kotlin.structural.bridge


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class Circle(var x: Int, var y: Int, var radius: Int, drawAPI: DrawAPI) : Shape(drawAPI) {

    init {
      this.x = x
      this.y = y
      this.radius = radius
    }

    override fun draw() {
          drawAPI.drawCircle(radius, x, y)
    }
}