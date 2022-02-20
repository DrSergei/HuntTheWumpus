package main.java.game.enemy;

import main.java.game.Person;
import main.java.game.labyrinth.Room;
import org.jetbrains.annotations.NotNull;

public class Hole extends Enemy {

    Hole(Room room) {
        super(room);
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
    public Person.Result personShout(Person player) {
        return Person.Result.NOTHING;
    }
}
