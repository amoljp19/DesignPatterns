package com.softaai.designpatterns.kotlin.creational.builder.meal.item.Burger

import com.softaai.designpatterns.kotlin.creational.builder.meal.item.Item
import com.softaai.designpatterns.kotlin.creational.builder.meal.packing.Packing
import com.softaai.designpatterns.kotlin.creational.builder.meal.packing.Wrapper


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
 abstract class Burger: Item{
    override fun packing(): Packing {
        return Wrapper()
    }

    override abstract fun price():Float
}