package main.java.field.enemy;

import main.java.field.room.Room;
import main.java.field.room.RoomFactory;
import org.jetbrains.annotations.NotNull;

public class Bat extends Enemy {

    Bat(Room room) {
        this.room = room;
    }

    @Override
    @NotNull
    public String warningMessage() {
        return "слышите шум";
    }

    @Override
    public void personMove() {

    }

    @Override
    public void personShout() {

    }
}
