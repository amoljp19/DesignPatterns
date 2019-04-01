package com.softaai.designpatterns.kotlin.creational.builder.meal

import com.softaai.designpatterns.kotlin.creational.builder.meal.item.Burger.ChickenBurger
import com.softaai.designpatterns.kotlin.creational.builder.meal.item.Burger.VegBurger
import com.softaai.designpatterns.kotlin.creational.builder.meal.item.ColdDrink.Coke
import com.softaai.designpatterns.kotlin.creational.builder.meal.item.ColdDrink.Pepsi


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
class MealBuilder {

    fun prepareVegMeal() : Meal{
        val meal:Meal = Meal()
        meal.addItems(VegBurger())
        meal.addItems(Coke())
        return meal
    }

    fun prepareNonVegMeal() : Meal{
        val meal:Meal = Meal()
        meal.addItems(ChickenBurger())
        meal.addItems(Pepsi())
        return meal
    }
}