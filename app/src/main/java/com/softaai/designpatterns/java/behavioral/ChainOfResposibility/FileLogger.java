package com.softaai.designpatterns.java.behavioral.ChainOfResposibility;

/**
 * Created by Amol Pawar on 05-04-2019.
 * softAai Apps
 */
public class FileLogger  extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File Console::Logger: " + message);
    }
}
