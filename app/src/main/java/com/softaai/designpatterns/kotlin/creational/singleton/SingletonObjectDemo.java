package com.softaai.designpatterns.kotlin.creational.singleton;

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
