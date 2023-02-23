package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    // OPTION 4: try-catch, but then throw
    //"nesting" the underlying cause exception into a higher-level

    public void goToWork() throws WorkException
    {
        Car c = new Car("TKE1243", "Toyota", "Matrix");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        }
        finally {
            c.stop();
        }
    }


    // OPTION 3: try-catch, "respond" in some way, and then re-throw.
    // catch-and-rethrow
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE1243", "Toyota", "Matrix");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            System.out.println("Email sent to Lisa Herbold to complain");
            throw e;
        }
        finally {
            c.stop();
        }
    }
     */

    // OPTION 2: "punt," i.e. dont handle any thrown exception at all.
    // Because the exception in question is checked, I must say "throws".
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE1243", "Toyota", "Matrix");
        c.start();
        try {
            c.moveTo("West Seattle");
        }
        finally {
            c.stop();
        }
    }
     */

    // OPTION 1: try-catch-finally and handle any thrown exception
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("TKE1243", "Toyota", "Matrix");

        try {
            c.start();
            c.moveTo("West Seattle");
        }
        catch(DestinationUnreachableException e){
            System.out.println(e.getMessage());
        }
        finally {
            c.stop();
        }
    }
     */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}