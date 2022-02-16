package main.java.field.enemy;

import main.java.field.room.Room;
import org.jetbrains.annotations.NotNull;

public class Hole extends Enemy {

    Hole(Room room) {
        this.room = room;
    }

    @Override
    @NotNull
    public String warningMessage() {
        return "ощущаете сквозняк";
    }

    @Override
    public void personMove() {

    }

    @Override
    public void personShout() {

    }
}
