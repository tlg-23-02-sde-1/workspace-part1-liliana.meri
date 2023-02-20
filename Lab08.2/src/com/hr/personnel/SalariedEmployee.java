package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    //ctors, super ctor
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // call super instead of inheriting the constructor
        //registerIn401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate); // call this to get the super called in case
        setSalary(salary);
    }

    //getters/setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //to string employee
    public String toString() {
        return "SalariedEmployee: name=" + getName() +
                ", hireDate=" + getHireDate() +
                ", salary=" + getSalary();
    }
}