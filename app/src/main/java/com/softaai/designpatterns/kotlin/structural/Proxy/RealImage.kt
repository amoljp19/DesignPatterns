package com.softaai.designpatterns.kotlin.structural.Proxy


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class RealImage(fileName : String) : Image {
    private lateinit var fileName : String

    init {
        this.fileName = fileName
        loadFromDisk(fileName)
    }

    override fun display() {
        println("Displaying " + fileName)
    }

    fun loadFromDisk(fileName: String){
        println("Loading " + fileName)
    }
}