package com.pluralsight;

import java.time.LocalTime;

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

    public Employee(double hoursWorked) {
        this.hoursWorked= hoursWorked;

    }
//    do not put startTime in constructor

//    public Employee(double hoursWorked) {
//        this.hoursWorked = hoursWorked;
//    }

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
        startTime=time;
        int punchIn = (int) startTime;
        return punchIn;
    }
    public int punchOut(int time){
//      Employee: punchOut(int time) adds time - startTime to
//      hoursWorked. Times are whole hours on a 24-hour clock
//      , in the same day, so 14 is 2:00 pm. There's nothing to check first.
//        startTime=time;
//        int punchOut = (int) ((int) hoursWorked + startTime);
//        int hoursWorked;

        hoursWorked=time-startTime;
        int punchOut = (int) (hoursWorked+startTime);
        return punchOut;
    }
}
