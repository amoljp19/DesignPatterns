package com.softaai.designpatterns.kotlin.structural.adapter


/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
class Mp4Player : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
    }

    override fun playMp4(fileName: String) {
       println("Playing mp4 file. Name : " + fileName)
    }
}