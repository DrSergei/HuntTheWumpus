package main.java.game.enemy;

import main.java.game.Game;
import main.java.game.Person;

import java.util.List;

/**
 * Интерфейс для шаблона слушатель
 */
public interface Listener {

    /**
     * Реакция на движение игрока
     */
    default Game.Result personMove(Person player) {
        return Game.Result.NOTHING;
    }

    /**
     * Реакция на движение игрока
     */
    default Game.Result personShout(Person player, List<Integer> path) {
        return Game.Result.NOTHING;
    }
}

