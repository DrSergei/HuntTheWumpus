package main.java.game.enemy;

import main.java.game.Person;
import main.java.game.labyrinth.Room;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Bat extends Enemy {

    public Bat(Room room) {
        super(room);
    }

    @Override
    @NotNull
    public String warningMessage() {
        return "слышите шум";
    }

    @Override
    public Person.Result personMove(Person player) {
        if (player.getRoom() == room) {
            List<Room> labyrinth = player.field.getLabyrinth();
            return player.setRoom(labyrinth.get(0));
        }
        return Person.Result.NOTHING;
    }

    @Override
    public Person.Result personShout(Person player) {
        return Person.Result.NOTHING;
    }
}
