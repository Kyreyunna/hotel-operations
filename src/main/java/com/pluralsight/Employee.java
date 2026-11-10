package com.pluralsight;

public class Employee {
    private double hoursWorked;
    private double payRate;
    private String employeeId;
    private String name;
    private String department;

    //constructor
    public Employee(double hoursWorked, double payRate, String employeeId, String name, String department) {
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    //getter for each field

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getRegularHours() {
        double totalPay = 0;
        double payRate = 0;
        if (hoursWorked<= 40) {
            totalPay = hoursWorked * payRate;
        }
        return totalPay;
    }

    public double getOvertimeHours() {
        double totalPay = 0;
        double payRate = 0;
        if (hoursWorked > 40) {
            totalPay = hoursWorked * payRate * 1.50;
        }


        return totalPay;
    }

    public double getTotalPay(){
        double totalPay = 0;
        double regularPay=0;
        double overTimePay=0;
        double payRate=0;
        if (hoursWorked > 40) {
        overTimePay = hoursWorked * payRate * 1.50;
        }
        if (hoursWorked<= 40) {
            regularPay = hoursWorked * payRate;
        }
//        double totalPay = regularPay*payRate;
        return totalPay;
    }
}
