package com.softaai.designpatterns.java.behavioral.ChainOfResposibility;

/**
 * Created by Amol Pawar on 05-04-2019.
 * softAai Apps
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console::Logger: " + message);
    }
}
