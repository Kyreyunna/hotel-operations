package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Room room = new Room(2, 124.00, false, false);
        System.out.println(room.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
        System.out.printf("%6s","Reservation Total: $");
        System.out.println(reservation.getReservationTotal());

        Employee employee1 = new Employee(40, 25.00, "J-10", "Jessica", "Clerk");
        System.out.println(employee1.getRegularHours());

        Employee employee2 = new Employee(20, 20.00, "J-10", "Jessica", "Clerk");
        System.out.println(employee2.getTotalPay());

        Employee employee3 = new Employee(45, 20.00, "J-10", "Jessica", "Clerk");
        System.out.println(employee3.getTotalPay());



        Employee employee5;




        Room room1;
        room1 = new Room(false,false);
        //print isAvailable() at each step:
        //true at the start
        System.out.println(room1.isAvailable());

        // false after check in
        room1.checkIn();
        System.out.println(room1.isAvailable());
        //false after check out
        room1.checkOut();
        System.out.println(room1.isAvailable());
        //true after cleaning
        room1.cleanRoom();
        System.out.println(room1.isAvailable());

//      Reservation reservation = new Reservation("king", 3, true);
//      System.out.println(reservation.getPrice());

        //In main, punch in at 10 and out at 14. hoursWorked goes up by 4

//        employee5.punchIn(10);
//        employee5.punchOut(14);
//        System.out.println(employee5.getHoursWorked());
    }
}
