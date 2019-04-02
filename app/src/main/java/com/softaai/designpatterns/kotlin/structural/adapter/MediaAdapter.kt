package com.softaai.designpatterns.kotlin.structural.adapter


/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
class MediaAdapter(audioType: String) : MediaPlayer {
    lateinit var advancedMusicPlayer : AdvancedMediaPlayer
    init {
        if (audioType.equals("Vlc", ignoreCase = true)){
            advancedMusicPlayer = VlcPlayer()
        }
        else if (audioType.equals("Mp4", ignoreCase = true)){
            advancedMusicPlayer = Mp4Player()
        }
    }


    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("Vlc", ignoreCase = true)){
            advancedMusicPlayer.playVlc(fileName)
        }
        else if (audioType.equals("Mp4", ignoreCase = true)){
            advancedMusicPlayer.playMp4(fileName)
        }
    }
}