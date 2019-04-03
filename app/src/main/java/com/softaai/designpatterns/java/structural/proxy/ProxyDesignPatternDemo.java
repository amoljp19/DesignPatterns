package com.softaai.designpatterns.java.structural.proxy;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class ProxyDesignPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("test_10mb.jpg");

        // image will be loaded from disk
        image.display();
        System.out.println("");

        // image will not be loaded from disk
        image.display();
    }
}
