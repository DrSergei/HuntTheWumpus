package main.java.game.enemy;

import main.java.game.labyrinth.Room;

import java.util.ArrayList;
import java.util.List;

public class EnemyFactory {
    public List<Enemy> createEnemies(List<Room> labyrinth) {
        List<Enemy> buffer = new ArrayList();
        buffer.add(new Wumpus(labyrinth.get(0)));
        return buffer;
    }
}
