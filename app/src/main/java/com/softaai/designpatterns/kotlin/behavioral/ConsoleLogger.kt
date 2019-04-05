package com.softaai.designpatterns.kotlin.behavioral


/**
 * Created by Amol Pawar on 05-04-2019.
 * softAai Apps
 */
class ConsoleLogger(level : Int) : AbstractLogger() {

    init {
        this.level = level
    }

    override fun write(message: String) {
       println("Standard Console::Logger : " + message)
    }
}