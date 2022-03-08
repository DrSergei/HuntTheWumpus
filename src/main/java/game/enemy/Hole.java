package main.java.game.enemy;

import main.java.game.Game;
import main.java.game.Person;
import main.java.game.labyrinth.Labyrinth;
import org.jetbrains.annotations.NotNull;

/**
 * Класс дыры(убивает игрока при падении)
 */
public class Hole extends Enemy {

    Hole(Labyrinth labyrinth, Integer index) {
        super(labyrinth, index);
    }

    @Override
    @NotNull
    public String warningMessage() {
        return "ощущаете сквозняк";
    }

    @Override
    public Game.Result personMove(Person player) {
        if (player.getRoom() == room) {
            return Game.Result.LOSE;
        }
        return Game.Result.NOTHING;
    }
}
