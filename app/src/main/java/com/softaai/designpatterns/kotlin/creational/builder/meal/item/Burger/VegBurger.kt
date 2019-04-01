package com.softaai.designpatterns.kotlin.creational.builder.meal.item.Burger


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
class VegBurger : Burger() {
    override fun price(): Float {
        return 25.0f
    }

    override fun name(): String {
        return "Veg Burger"
    }
}