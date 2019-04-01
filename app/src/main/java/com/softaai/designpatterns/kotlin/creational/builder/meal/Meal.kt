package com.softaai.designpatterns.kotlin.creational.builder.meal

import com.softaai.designpatterns.kotlin.creational.builder.meal.item.Item


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
class Meal {

    private var items = ArrayList<Item>()

    fun addItems(item: Item) : Unit{
        items.add(item)
    }

    fun getCost():Float{
        var cost : Float = 0.0f

        for(item in items){
            cost += item.price();
        }

        return cost;
    }

    fun showItems() : Unit{
        for(item in items){
            print("Item : " + item.name())
            print(", Packing : " + item.packing().pack())
            println(", Price : " + item.price())
        }
    }
}