package com.hr.client;
import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee("Lily");

        try {
            emp.goToWork();
        }
        catch (WorkException e){
            e.printStackTrace();

//            System.out.println(e.getMessage());
//            System.out.println(e.getCause()); // extracts the 'nested' exception inside
//            System.out.println(e.getCause().getMessage()); // just a reason string
        }

    }
}