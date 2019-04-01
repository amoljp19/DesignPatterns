package com.softaai.designpatterns.kotlin.creational.builder.meal.item.Burger


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
class ChickenBurger : Burger() {
    override fun price(): Float {
        return 55.50f
    }

    override fun name(): String {
        return "Chicken Burger"
    }
}