package com.softaai.designpatterns.java.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amol Pawar on 03-04-2019.
 * softAai Apps
 */
public class Employee {
    private String name ;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee : [ name : " + name + ", dept : " + dept + ", salary : " + salary + " ]");
    }
}
