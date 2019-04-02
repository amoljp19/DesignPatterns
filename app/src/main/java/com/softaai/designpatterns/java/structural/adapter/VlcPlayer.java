package com.softaai.designpatterns.java.structural.adapter;

/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
