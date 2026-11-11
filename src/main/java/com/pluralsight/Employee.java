package com.pluralsight;

public class Employee {
    private double startTime;
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
//    do not put startTime in constructor

    public Employee(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

//    public Employee(double startTime, double hoursWorked) {
//        this.startTime= startTime;
//        this.hoursWorked = hoursWorked;

//    }
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
        if (hoursWorked <= 40) {
            return hoursWorked;
        }else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
           return hoursWorked - 40;
        }else {
            return 0;
        }
    }

    public double getTotalPay(){
        double regularPay = getRegularHours() *  payRate;
        double overTimePay = getOvertimeHours() * (payRate * 1.5);

        double totalPay = regularPay + overTimePay;
        return totalPay;
    }
    public int punchIn(int time){
    int punchIn = (int) startTime;
    return punchIn;
    }
    public int punchOut(int time){
        int punchout = (int) ((int) hoursWorked + startTime);
        int hoursWorked;
        double startTime;
        return punchout;
    }
}
