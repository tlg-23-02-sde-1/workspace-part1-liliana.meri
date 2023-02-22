/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 50.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 35.1 , 10.0));
        dept.addEmployee(new SalariedEmployee("John", LocalDate.of(1995, 8, 10), 88.8));
        dept.addEmployee(new HourlyEmployee("Mary", LocalDate.of(1855, 3, 4), 100.5, 45.4));
        dept.addEmployee(new Executive("Liliana", LocalDate.of(2020, 12, 12), 75_000.0));


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay employees
        System.out.println("\nPay employees:");
        dept.payEmployees();

        // holiday break
        System.out.println("\nHoliday break: ");
        dept.holidayBreak();

    }
}