package main.java.field.enemy;

import main.java.field.room.Room;
import org.jetbrains.annotations.NotNull;

public class Wumpus extends Enemy {

    Wumpus(Room room) {
        this.room = room;
    }

    @Override
    @NotNull
    public String warningMessage() {
        return "чувствуете смрадный запах";
    }

    @Override
    public void personMove() {

    }

    @Override
    public void personShout() {

    }
}
