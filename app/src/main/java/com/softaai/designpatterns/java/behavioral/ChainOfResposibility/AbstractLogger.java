package com.softaai.designpatterns.java.behavioral.ChainOfResposibility;

/**
 * Created by Amol Pawar on 05-04-2019.
 * softAai Apps
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUGE = 2;
    public static int ERROR = 3;
    protected int level;

    //next element in chain at responsibility
    protected AbstractLogger nextLogger;
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
