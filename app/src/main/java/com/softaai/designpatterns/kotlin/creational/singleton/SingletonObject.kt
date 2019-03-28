package com.softaai.designpatterns.kotlin.creational.singleton

/**
 * Created by Amol Pawar on 29-03-2019.
 * softAai Apps
 */
class SingletonObject private constructor() {

    fun showMessage() {
        println("Called showMessage() using SingletonObject")
    }

    companion object {

        fun getInstance() : SingletonObject {
            return SingletonObject()
        }
    }

}
