package main.java.game.labyrinth;

import main.java.game.enemy.Enemy;
import main.java.game.enemy.EnemyFactory;

import java.util.Collections;
import java.util.List;

public class Field {

    public Field() {
        this.labyrinth = new RoomFactory().createRooms();
        this.enemies = new EnemyFactory().createEnemies();
    }


    private final List<Room> labyrinth;
    public Room getStartRoom() {
        return labyrinth.get(0);
    }
    public List<Room> getLabyrinth() {
        return Collections.unmodifiableList(labyrinth);
    }
    private final List<Enemy> enemies;
    public List<Enemy> getEnemies() {
        return Collections.unmodifiableList(enemies);
    }
}
