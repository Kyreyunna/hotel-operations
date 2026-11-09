package com.pluralsight;

public class Reservation {
private String roomType;
private int numberOfNights;
private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public double getPrice(){
        //It's $139.00 for "king" and $124.00 for "double",
        double price = 1000;
        if(roomType.equals("king")){
            price = 139.00;
        } else if (roomType.equals("double")) {
            price = 124.00;
        }

        //and 10% more when weekend is true
        if (weekend) {
            price = price * 1.10;
        }
        return price;
    }
}
