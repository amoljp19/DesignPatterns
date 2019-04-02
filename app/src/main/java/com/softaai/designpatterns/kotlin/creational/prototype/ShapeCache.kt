package com.softaai.designpatterns.kotlin.creational.prototype


/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
class ShapeCache {

    companion object {

        var shapeMap : HashMap<String, Shape> = HashMap<String, Shape>();

        fun getShape(shapeId : String) : Shape{
            val cachedShape : Shape? = shapeMap.get(shapeId)
            return cachedShape?.clone() as Shape
        }

        fun loadCache():Unit{
            var circle : Circle = Circle()
            circle.setId("1")
            shapeMap.put(circle.getId(), circle)

            var square : Square = Square()
            square.setId("2")
            shapeMap.put(square.getId(), square)

            var rectangle : Rectangle = Rectangle()
            rectangle.setId("3")
            shapeMap.put(rectangle.getId(), rectangle)
        }
    }

}