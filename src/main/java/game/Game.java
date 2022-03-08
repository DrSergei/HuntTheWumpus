package main.java.game;

import main.java.game.enemy.Enemy;
import main.java.game.enemy.EnemyFactory;
import main.java.game.labyrinth.Labyrinth;
import main.java.game.labyrinth.LabyrinthFactory;

import java.util.List;

public class Game {
    private final Person player;
    private final Labyrinth labyrinth;

    /**
     * Создает игру, игрока и лабиринт
     */
    public Game() {
        labyrinth = new LabyrinthFactory().createLabyrinth();
        player = new Person(labyrinth.getStartRoom());
        player.addListeners(new EnemyFactory().createEnemies(labyrinth));
    }

    /**
     * Варианты результатов
     */
    public enum Result {
        WIN,
        LOSE,
        NOTHING,
        ERROR
    }

    /**
     * Движение игрока
     */
    public Result playerMove(Integer index) {
        if (!labyrinth.isNeighbour(player.getRoom(), index))
            return Result.ERROR;
        return player.move(labyrinth.get(index));
    }

    /**
     * Стрельба игрока
     */
    public Result playerShout(List<Integer> path) {
        List<Integer> validPath = labyrinth.toValidPath(path);
        return player.shout(validPath);
    }

    /**
     * Сообщение о соседях
     */
    public String neighboursMessage() {
        return player.getRoom().neighboursMessage();
    }

    /**
     * Сообщение об опаснастях
     */
    public String warningMessage() {
        return player.getRoom().WarningMessage();
    }
}
