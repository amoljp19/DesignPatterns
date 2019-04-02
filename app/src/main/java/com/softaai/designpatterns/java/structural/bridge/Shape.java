package com.softaai.designpatterns.java.structural.bridge;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public abstract class Shape {
   protected DrawAPI drawAPI;
   protected Shape(DrawAPI drawAPI){
       this.drawAPI = drawAPI;
   }

   public abstract void draw();
}
