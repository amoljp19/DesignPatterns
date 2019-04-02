package com.softaai.designpatterns.kotlin.structural.adapter


/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
class VlcPlayer : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
       println("Playing vlc file. Name : " + fileName)
    }

    override fun playMp4(fileName: String) {
    }
}