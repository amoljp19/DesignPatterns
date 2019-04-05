package com.softaai.designpatterns.kotlin.behavioral


/**
 * Created by Amol Pawar on 05-04-2019.
 * softAai Apps
 */
object ChainOfResponsibilityDesignPatternDemo {

    fun getChainOfLoggers():AbstractLogger{
        var errorLogger = ErrorLogger(AbstractLogger.ERROR)
        var fileLogger = FileLogger(AbstractLogger.DEBUG)
        var consoleLogger = ConsoleLogger(AbstractLogger.INFO)
        errorLogger.setNextLogger(fileLogger)
        fileLogger.setNextLogger(consoleLogger)
        return errorLogger;
    }

    @JvmStatic
    fun main(args : Array<String>){
       var loggerChain = getChainOfLoggers()
       loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
       println()
       loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information")
       println()
       loggerChain.logMessage(AbstractLogger.ERROR, " This is an error information.")

    }
}