package com.softaai.designpatterns.java.structural.adapter;

/**
 * Created by Amol Pawar on 02-04-2019.
 * softAai Apps
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
       System.out.println("Playing mp4 file. Name : " + fileName);
    }
}
