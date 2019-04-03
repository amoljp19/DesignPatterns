package com.softaai.designpatterns.kotlin.structural.Proxy


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class ProxyImage(fileName:String) : Image {

    private var realImage:RealImage? = null
    private var fileName :String

    init {
        this.fileName = fileName
    }
    override fun display() {
        if (realImage == null){
            realImage = RealImage(fileName)
        }

        realImage?.display()
    }
}