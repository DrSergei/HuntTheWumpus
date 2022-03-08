package main.java.game.enemy;


import main.java.game.labyrinth.Labyrinth;
import main.java.game.labyrinth.Room;

/**
 * Главный класс иерархии врагов
 */
public abstract class Enemy implements Listener {

    /**
     * Сообщения предупреждения для игрока
     */
    public abstract String warningMessage();

    /**
     * Сопоставляет противнику лабиринт и комнату
     */
    public Enemy(Labyrinth labyrinth, Integer index) {
        this.labyrinth = labyrinth;
        room = labyrinth.get(index);
        assert room != null;
        room.setWarningMessage(warningMessage());
    }

    protected Labyrinth labyrinth;
    protected Room room;
}