package com.softaai.designpatterns.kotlin.structural.composite


/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
object CompositeDesignPatternDemo {
    @JvmStatic
    fun main(args : Array<String>){
        var CEO = Employee("John", "CEO", 30000)
        var headSales = Employee("Robert", "Head Sales", 20000)
        var headMarketing = Employee("Michel", "Head Marketing", 20000)
        var clerk1 = Employee("Laura", "Marketing", 10000)
        var clerk2 = Employee("Bob", "Marketing", 10000)
        var salesExecutive1 = Employee("Richard", "Sales", 10000)
        var salesExecutive2 = Employee("Bob", "Sales", 10000)

        CEO.add(headSales)
        CEO.add(headMarketing)

        headSales.add(salesExecutive1)
        headSales.add(salesExecutive2)

        headMarketing.add(clerk1)
        headMarketing.add(clerk2)

        println(CEO)
        for (headEmployee in CEO.getSubordinates()){
            println(headEmployee)
            for (employee in headEmployee.getSubordinates()){
                println(employee)
            }
        }
    }
}