package com.softaai.designpatterns.kotlin.creational.singleton

/**
 * Created by Amol Pawar on 29-03-2019.
 * softAai Apps
 */
object SingletonObjectDemo {

    @JvmStatic       // only members in object or companion object annotated with @JvmStatic
    fun main(args: Array<String>) {

        val singletonObject = SingletonObject.getInstance()
        singletonObject.showMessage()

    }
}
