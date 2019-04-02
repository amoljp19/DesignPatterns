package com.softaai.designpatterns.kotlin.structural.adapter


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
object AdapterDesignPatternDemo {
    @JvmStatic
    fun main(args : Array<String>){
        val audioPlayer = AudioPlayer()
        audioPlayer.play("mp3", "beyond the horizon.mp3")
        audioPlayer.play("mp4", "alone.mp4")
        audioPlayer.play("vlc", "far far away.vlc")
        audioPlayer.play("avi", "mind me.avi")
    }
}