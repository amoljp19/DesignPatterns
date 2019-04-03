package com.softaai.designpatterns.kotlin.structural.composite


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
class Employee(name:String, dept:String, salary:Int) {
    private var name:String
    private var dept:String
    private var salary:Int
    private var subordinates : MutableList<Employee>

    init {
        this.name = name
        this.dept = dept
        this.salary = salary
        this.subordinates = ArrayList<Employee>()
    }

    fun add(e : Employee){
        this.subordinates.add(e)
    }

    fun remove(e : Employee){
        this.subordinates.remove(e)
    }

    fun getSubordinates() : MutableList<Employee> {
        return subordinates
    }

    override fun toString() : String{
      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary : " + salary + " ]")
    }

}