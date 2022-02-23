package main.java.game.enemy;

import main.java.game.Game;
import main.java.game.Person;
import main.java.game.labyrinth.Labyrinth;

import java.util.List;

public interface Listener {

    default Game.Result personMove(Person player) {
        return Game.Result.NOTHING;
    }

    default Game.Result personShout(Person player, List<Integer> path) {
        return Game.Result.NOTHING;
    }
}

