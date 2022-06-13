package com.bridgelab;

public class UC3EmployeePartTimeWage {
    public static void main(String[] args) {
        int partTimeHour = 1;
        int fullTimeHour = 2;
        int perHourWage = 20;
        int employeeHours;
        double employeeWork = Math.floor(Math.random() * 10) % 3;
        if (employeeWork == partTimeHour) {
            employeeHours = 8;
            System.out.println("The part time employee Wage is " + employeeHours * perHourWage + " Rs");
        }
        else if (employeeWork == fullTimeHour) {
            employeeHours = 8;
            System.out.println("The full time employee Wage is " + employeeHours * perHourWage + " Rs");
        }
        else {
            System.out.println("The Employee is not present");
        }
    }
}
