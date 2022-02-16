package main.java.field.enemy;


import main.java.field.room.Room;
import main.java.field.room.RoomFactory;

public abstract class Enemy implements Listener {
    public abstract String warningMessage();

    protected Room room;

    public void remove(Room room) {
        this.room = room;
    }
}
