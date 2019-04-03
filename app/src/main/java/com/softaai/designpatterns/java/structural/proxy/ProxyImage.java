package com.softaai.designpatterns.java.structural.proxy;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
