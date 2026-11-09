package com.pluralsight;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Room room = new Room(2, 124.00, false, false);
        System.out.println(room.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
        System.out.println(reservation.getReservationTotal());
    }
}
