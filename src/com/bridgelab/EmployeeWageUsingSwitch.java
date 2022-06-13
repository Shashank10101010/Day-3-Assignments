package com.bridgelab;

public class EmployeeWageUsingSwitch {
    public static final int partTimeHour = 1;
    public static final int fullTimeHour = 2;
    public static final int wagePerHour = 20;

    public static void main(String[] args) {
        int employeeHours = 0;
        int employeeWage = 0;
        int employeePresence = (int) Math.floor(Math.random() * 10) % 3;
        switch (employeePresence) {
            case partTimeHour:
                employeeHours = 5;
                break;
            case fullTimeHour:
                employeeHours = 8;
                break;
            default:
                employeeHours = 0;
        }
        employeeWage = employeeHours * wagePerHour;
        System.out.println("The Wage of this employee is " + employeeWage + " Rs");
    }

}
