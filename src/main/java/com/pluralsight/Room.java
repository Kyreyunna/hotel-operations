package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public Room(Boolean occupied, Boolean dirty) {
        this.dirty=dirty;
        this.occupied=occupied;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
//        boolean isAvailable =

        if (!this.occupied) {
            return true;
        }
        if (!this.dirty) {
            return true;
        } else
            return false;

    }
    public boolean getCheckIn(){
        this.occupied= true;
        this.dirty=true;

        return dirty;
    }
    public boolean getCheckOut(){
        this.occupied=false;

        return occupied;
    }
    public boolean getCleanRoom(){
        this.dirty=false;
        return this.occupied;
    }
}
