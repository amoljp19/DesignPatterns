package com.softaai.designpatterns.kotlin.creational.singleton;

/**
 * Created by Amol Pawar on 29-03-2019.
 * softAai Apps
 */
public class SingletonObject {

    private static SingletonObject instance = new SingletonObject();

    private SingletonObject(){

    }

    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Called showMessage() using SingletonObject");
    }
}
