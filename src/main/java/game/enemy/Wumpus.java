package main.java.game.enemy;

import main.java.game.Person;
import main.java.game.labyrinth.Room;
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
    public Person.Result personMove(Person player) {
        if (player.getRoom() == room) {
            return Person.Result.LOSE;
        }
        return Person.Result.NOTHING;
    }

    @Override
    public Person.Result personShout() {
        //TODO
        return Person.Result.NOTHING;
    }
}