package com.softaai.designpatterns.kotlin.structural.adapter


/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
interface MediaPlayer {
    public fun play(audioType:String, fileName:String):Unit
}