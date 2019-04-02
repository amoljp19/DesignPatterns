package com.softaai.designpatterns.kotlin.structural.adapter


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class AudioPlayer : MediaPlayer {
    lateinit var mediaAdapter : MediaAdapter
    override fun play(audioType: String, fileName: String) {
       // inbuilt support for mp3 format
        if(audioType.equals("mp3", ignoreCase = true)){
            println("Playing mp3 file. Name : " + fileName)
        }

        // play other format file using mediaAdapter
        else if (audioType.equals("vlc", ignoreCase = true) || audioType.equals("mp4", ignoreCase = true)){
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter.play(audioType, fileName)
        }
        else{
            println("Invalid Media. " + audioType + " format not supported")
        }
    }
}