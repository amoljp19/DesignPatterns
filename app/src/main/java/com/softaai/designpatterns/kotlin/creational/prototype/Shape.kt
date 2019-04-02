package com.softaai.designpatterns.kotlin.creational.prototype


/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
abstract class Shape : Cloneable {
    private lateinit var id: String
    protected lateinit var shapeType:String
    abstract fun draw() : Unit

    public fun getType():String{
        return this.shapeType
    }


    public fun getId() : String{
        return id;
    }

    public fun setId(id : String){
        this.id = id
    }

    override public fun clone(): Any {
        return super.clone()
    }


}