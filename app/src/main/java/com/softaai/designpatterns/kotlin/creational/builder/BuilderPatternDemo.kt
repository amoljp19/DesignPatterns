package com.softaai.designpatterns.kotlin.creational.builder

import com.softaai.designpatterns.kotlin.creational.builder.meal.Meal
import com.softaai.designpatterns.kotlin.creational.builder.meal.MealBuilder


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
object BuilderPatternDemo {
    @JvmStatic
    fun main(args : Array<String>){
        val mealBuilder : MealBuilder = MealBuilder()
        val vegMeal : Meal = mealBuilder.prepareVegMeal();
        println("Veg Meal");
        vegMeal.showItems();
        println("Total Cost: " + vegMeal.getCost());

        val nonVegMeal : Meal = mealBuilder.prepareNonVegMeal();
        println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        println("Total Cost : " + nonVegMeal.getCost());
    }
}