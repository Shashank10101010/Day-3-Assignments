package com.bridgelab;

public class UC1EmployeeAttandance {
    public static void main(String[] args) {
        int isFullTime = 1;
        double employeePresence = Math.floor (Math.random() * 10) % 2;
        if (employeePresence == isFullTime) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is not Present");
        }
    }
}
