package com.softaai.designpatterns.kotlin.structural.adapter


/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
interface AdvancedMediaPlayer {
    public fun playVlc(fileName:String)
    public fun playMp4(fileName: String)
}