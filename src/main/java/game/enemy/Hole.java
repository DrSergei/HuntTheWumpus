package main.java.game.enemy;

import main.java.game.Person;
import main.java.game.labyrinth.Room;
import org.jetbrains.annotations.NotNull;

import java.util.List;

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
    public Person.Result personMove(Person player) {
        if (player.getRoom() == room) {
            return Person.Result.LOSE;
        }
        return Person.Result.NOTHING;
    }

    @Override
    public Person.Result personShout() {
        return Person.Result.NOTHING;
    }
}
