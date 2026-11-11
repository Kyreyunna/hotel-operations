package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_should_markRoomOccupiedAndDirty() {
        //arrange
        //The two false values passed into the constructor set the initial state of the room:
        //First false: The room is not occupied (it starts vacant).
        //Second false: The room is not dirty (it starts clean).
        Room room = new Room(1, 180, false, false);
        //act
        room.checkIn();
        //assert
        //expected then actual
        assertEquals(true, room.isOccupied());
        assertEquals(true, room.isDirty());
    }
    public void checkOut_should_markRoomDirty(){
        //arrange
        Room room = new Room(1, 180, true, true);
        //act
        room.checkOut();
        //assert
        assertEquals(false, room.isAvailable());
        assertEquals(true, room.isDirty());
        assertEquals(false, room.isOccupied());
    }
    public void cleanRoom_should_markRoomClean(){
        //arrange

        //act
        //assert

    }
}