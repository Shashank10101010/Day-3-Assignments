package com.bridgelab;

public class UC5WagesForMonth {
    public static final int partTimeHour = 1;
    public static final int fullTimeHour = 2;
    public static final int wagePerHour = 20;
    public static final int numberOfWorkingDays = 20;

    public static void main(String[] args) {
        int employeeHours = 0;
        int employeeWage = 0;
        int totalEmployeeWage = 0;
        for (int firstDay = 0; firstDay < numberOfWorkingDays; firstDay++) {
            int employeePresence = (int) Math.floor(Math.random() * 10) % 3;
            switch(employeePresence) {
                case partTimeHour:
                    employeeHours = 6;
                    break;
                case fullTimeHour:
                    employeeHours = 8;
                    break;
                default:
            }
            employeeWage = employeeHours * wagePerHour;
            System.out.println("Wages of the employee is " + employeeWage);
            totalEmployeeWage += employeeWage;
        }
        System.out.println("Total wages (after twenty days) of the employee is " + totalEmployeeWage + " Rs");
    }
}
