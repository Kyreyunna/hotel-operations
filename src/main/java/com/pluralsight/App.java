package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Room room = new Room(2, 124.00, false, false);
        System.out.println(room.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
        System.out.printf("%8s","Total: $");
        System.out.println(reservation.getReservationTotal());

        Employee employee1 = new Employee(40, 25.00, "J-10", "Jessica", "Clerk");
        System.out.println(employee1.getRegularHours());

        Employee employee2 = new Employee(20, 20.00, "J-10", "Jessica", "Clerk");
        System.out.println(employee2.getTotalPay());

        Employee employee3 = new Employee(45, 20.00, "J-10", "Jessica", "Clerk");
        System.out.println(employee3.getTotalPay());

        Boolean occupied= true;
        Boolean dirty = true;

        Room room1;
        room1 = new Room(occupied,dirty);
        //print isAvailable() at each step:
        //true at the start
        System.out.println(room1.isAvailable());
        // false after check in
        System.out.println(room1.getCheckIn());
        //false after check out
        System.out.println(room1.getCheckOut());
        //true after cleaning
        System.out.println(room1.getCleanRoom());




//      Reservation reservation = new Reservation("king", 3, true);
//      System.out.println(reservation.getPrice());

    }
}
