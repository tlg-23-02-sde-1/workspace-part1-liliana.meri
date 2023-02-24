package com.hr.personnel;
import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;
    double STANDARD_DEDUCTION = 2500.5;

    //ctors, super ctor----------------------
    public SalariedEmployee() {
        super(); // super is in here even if you dont write it
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // call super instead of inheriting the constructor
        //registerIn401k()
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate); // call this to get the super called in case
        setSalary(salary);
    }

    //methods----------------------------
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation(){
        System.out.println(getName() + " is on vacation");
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        double taxes = getSalary() * TaxPayer.SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    @Override // interface TaxPayer
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    @Override // interface TaxPayer
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    //getters/setters-----------------------
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //to string employee---------------------
    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}