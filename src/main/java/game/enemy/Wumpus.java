package main.java.game.enemy;

import main.java.game.Game;
import main.java.game.Person;
import main.java.game.labyrinth.Labyrinth;
import main.java.game.labyrinth.Room;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Random;

public class Wumpus extends Enemy {

    public Wumpus(Labyrinth labyrinth, Integer index) {
        super(labyrinth, index);
    }

    //Wumpus(Labyrinth labyrinth, Integer index) {
      //  super(labyrinth, index);
    //}

    @Override
    @NotNull
    public String warningMessage() {
        return "чувствуете смрадный запах";
    }

    @Override
    public Game.Result personMove(Person player) {
        if (player.getRoom() == room) {
            return Game.Result.LOSE;
        }
        return Game.Result.NOTHING;
    }

    @Override
    public Game.Result personShout(Person player, List<Integer> path) {
        if (path.contains(room.id))
            return Game.Result.WIN;
        Random random = new Random();
        if (random.nextInt(4) != 0) {
            List<Room> neighbours = room.getNeighbours();
            room = neighbours.get(random.nextInt(neighbours.size()));
            if (player.getRoom() == room)
                return Game.Result.LOSE;
        }
        return Game.Result.NOTHING;
    }
}
