package main.java.game.enemy;

import main.java.game.Person;
import main.java.game.labyrinth.Room;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Random;

public class Wumpus extends Enemy {

    Wumpus(Room room) {
        super(room);
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
    public Person.Result personShout(Person player) {
        Random random = new Random();
        if (random.nextInt(4) != 0) {
            List<Room> neighbours = room.getNeighbours();
            room = neighbours.get(random.nextInt(neighbours.size()));
            if (player.getRoom() == room)
                return Person.Result.LOSE;
        }
        return Person.Result.NOTHING;
    }
}
