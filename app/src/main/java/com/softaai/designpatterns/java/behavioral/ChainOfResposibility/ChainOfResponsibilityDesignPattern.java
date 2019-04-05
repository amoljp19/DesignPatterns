package com.softaai.designpatterns.java.behavioral.ChainOfResposibility;

/**
 * Created by Amol Pawar on 05-04-2019.
 * softAai Apps
 */
public class ChainOfResponsibilityDesignPattern {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUGE);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        System.out.println("");
        loggerChain.logMessage(AbstractLogger.DEBUGE, "This is a debug level information");
        System.out.println("");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
