package com.softaai.designpatterns.kotlin.creational.builder.meal.item.ColdDrink

import com.softaai.designpatterns.kotlin.creational.builder.meal.item.Item
import com.softaai.designpatterns.kotlin.creational.builder.meal.packing.Bottle
import com.softaai.designpatterns.kotlin.creational.builder.meal.packing.Packing


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
abstract class ColdDrink : Item {
    override fun packing(): Packing {
        return Bottle()
    }

    override abstract fun price():Float
}