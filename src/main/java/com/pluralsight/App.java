package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Room room = new Room(2, 124.00, false, false);
        System.out.println(room.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
        System.out.printf("%8s","Total: $");
        System.out.println(reservation.getReservationTotal());



//      Reservation reservation = new Reservation("king", 3, true);
//      System.out.println(reservation.getPrice());

    }
}
