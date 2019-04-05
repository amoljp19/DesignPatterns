package com.softaai.designpatterns.kotlin.behavioral


/**
 * Created by Amol Pawar on 05-04-2019.
 * softAai Apps
 */
abstract class AbstractLogger {

    companion object {
        val INFO : Int = 1
        val DEBUG : Int = 2
        val ERROR : Int = 3
    }

    protected var level : Int = 0

    protected var nextAbstractLogger : AbstractLogger? = null

    fun setNextLogger(nextLogger : AbstractLogger){
        this.nextAbstractLogger = nextLogger
    }

    fun logMessage(level : Int, message : String){
        if(this.level <= level){
            write(message)
        }
        if(nextAbstractLogger != null){
            nextAbstractLogger?.logMessage(level, message)
        }
    }


    abstract protected fun write(message : String)
}

