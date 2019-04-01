package com.softaai.designpatterns.kotlin.creational.builder.meal.item

import com.softaai.designpatterns.kotlin.creational.builder.meal.packing.Packing


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
interface Item {
    fun name(): String
    fun packing(): Packing
    fun price(): Float
}