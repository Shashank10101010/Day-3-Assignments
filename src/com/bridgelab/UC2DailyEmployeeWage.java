package com.bridgelab;

public class UC2DailyEmployeeWage {
    public static void main(String[] args) {
        int isFullTime = 1;
        int wagePerHour = 20;
        int employeeHours = 0;
        int employeeWage = 0;

        double employeePresence = Math.floor(Math.random() * 10) % 2;
        if (employeePresence == isFullTime) {
            employeeHours = 8;
            employeeWage = employeeHours * wagePerHour;
            System.out.println("Wage of the employee is " + employeeWage + " Rs");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
