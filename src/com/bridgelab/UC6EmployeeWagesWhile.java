package com.bridgelab;

public class UC6EmployeeWagesWhile {
    public static final int partTimeHour = 1;
    public static final int fullTimeHour = 2;
    public static final int wagePerHour = 20;
    public static final int numberOfWorkingDays = 20;
    public static final int maximumHoursInMonth = 100;

    public static void main(String[] args) {
        int employeeHours = 0;
        int totalEmployeeHours = 0;
        //int employeeWage = 0;
        int totalWorkingDays = 0;
        //int totalEmployeeWage = 0;
        while (totalEmployeeHours <= maximumHoursInMonth && totalWorkingDays < numberOfWorkingDays) {
            totalWorkingDays++;
            int employeePresence = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeePresence) {
                case partTimeHour:
                    employeeHours = 6;
                    break;
                case fullTimeHour:
                    employeeHours = 8;
                    break;
                default:
                    employeeHours = 0;
            }
            totalEmployeeHours += employeeHours;
            System.out.println("Day" + totalWorkingDays + " Employee Worked = " + employeeHours + " Hrs");
        }
        int totalEmployeeWage = totalEmployeeHours * wagePerHour;
        System.out.println("Total wages (after twenty days) of the employee is " + totalEmployeeWage + " Rs");
    }
}

