/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private Collection<Employee> employees = new ArrayList<>(); // general Collection

    // ctors
    public Department() { // no arg
        super();
    }

    public Department(String name, String location) { // 2-arg
        super();
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (Employee emp : employees) {
            System.out.println(emp);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
            emp.work(); //current employee -> work
        }
    }

    public void payEmployees() {
        for (Employee emp : employees) {
            emp.pay(); //current employee -> pay
        }
    }
    /*
    * "Forced vacation." all employees that take vacation,
    * make take vacation
    *
     */
    public void holidayBreak() {
        for (Employee emp : employees) {
            //downcast the Employee reference (emp) to specific type SalariedEmployee
            //then call SalariedEmployee methods (takeVacation())

            if(emp instanceof SalariedEmployee){
                //downcast-and-method-call in one shot
                SalariedEmployee semp = (SalariedEmployee) emp;
                semp.takeVacation();
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //log department
    public String toString() {
        return "Department: name=" + getName() +
                ", location=" + getLocation();
    }
}