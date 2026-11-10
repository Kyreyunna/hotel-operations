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
    public double getTotalPay(){
        double totalPay = hoursWorked * payRate;
        double hoursWorked=0;
        return totalPay;
    }
}
