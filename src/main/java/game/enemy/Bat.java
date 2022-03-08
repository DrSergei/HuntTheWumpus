package main.java.game.enemy;

import main.java.game.Game;
import main.java.game.Person;
import main.java.game.labyrinth.Labyrinth;
import main.java.game.labyrinth.Room;
import org.jetbrains.annotations.NotNull;

/**
 *  Класс мыши(отправляет игрока случайную комнату)
 */
public class Bat extends Enemy {

    public Bat(Labyrinth labyrinth, Integer index) {
        super(labyrinth, index);
    }

    @Override
    @NotNull
    public String warningMessage() {
        return "слышите шум";
    }

    @Override
    public Game.Result personMove(Person player) {
        if (player.getRoom() == room) {
            player.move(labyrinth.getRandomRoom());
        }
        return Game.Result.NOTHING;
    }

}
