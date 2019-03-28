package com.softaai.designpatterns.java.creational.singleton;

/**
 * Created by Amol Pawar on 29-03-2019.
 * softAai Apps
 */
public class SingletonObjectDemo {

    public static void main(String[] args){

        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();

    }
}
