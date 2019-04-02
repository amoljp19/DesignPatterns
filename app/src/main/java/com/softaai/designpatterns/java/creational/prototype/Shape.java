package com.softaai.designpatterns.java.creational.prototype;

/**
 * Created by Amol Pawar on 01-04-2019.
 * softAai Apps
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
