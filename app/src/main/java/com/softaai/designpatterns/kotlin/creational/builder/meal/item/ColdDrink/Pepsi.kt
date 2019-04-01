package com.softaai.designpatterns.kotlin.creational.builder.meal.item.ColdDrink


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
class Pepsi : ColdDrink() {
    override fun price(): Float {
        return 35.5f
    }

    override fun name(): String {
        return "Pepsi"
    }
}