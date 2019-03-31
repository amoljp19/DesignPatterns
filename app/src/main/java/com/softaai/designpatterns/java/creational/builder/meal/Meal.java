package com.softaai.designpatterns.java.creational.builder.meal;

import com.softaai.designpatterns.java.creational.builder.meal.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItems(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for(Item item : items){
            cost += item.price();
        }

        return cost;
    }

    public void showItems(){
        for(Item item : items){
         System.out.print("Item : " + item.name());
         System.out.print(", Packing : " + item.packing().pack());
         System.out.println(", Price : " + item.price());
        }
    }
}
