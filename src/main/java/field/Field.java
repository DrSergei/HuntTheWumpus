package main.java.field;

import main.java.field.enemy.Enemy;
import main.java.field.enemy.EnemyFactory;
import main.java.field.enemy.Listener;
import main.java.field.person.Person;
import main.java.field.room.Room;
import main.java.field.room.RoomFactory;

import java.util.List;

public class Field {

    public Field() {
        this.labyrinth = new RoomFactory().createRooms();
        this.player = new Person();
        this.enemies = new EnemyFactory().createEnemies();
        for (Listener listener : enemies) {
            this.player.addListener(listener);
        }
    }

    public State iterate() {
        return State.PROCESS;
    }

    private final List<Room> labyrinth;
    private final List<Enemy> enemies;
    private final Person player;
}

enum State {
    LOOSE,
    WIN,
    PROCESS
}
