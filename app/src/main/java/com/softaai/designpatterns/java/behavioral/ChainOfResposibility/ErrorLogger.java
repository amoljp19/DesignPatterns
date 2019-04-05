package com.softaai.designpatterns.java.behavioral.ChainOfResposibility;

/**
 * Created by Amol Pawar on 05-04-2019.
 * softAai Apps
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
