package main.java.game.enemy;

import main.java.game.labyrinth.Labyrinth;

import java.util.ArrayList;
import java.util.List;

public class EnemyFactory {
    public List<Enemy> createEnemies(Labyrinth labyrinth) {
        List<Enemy> buffer = new ArrayList();
        buffer.add(new Wumpus(labyrinth, 1));
        buffer.add(new Bat(labyrinth, 5));
        buffer.add(new Bat(labyrinth, 9));
        buffer.add(new Hole(labyrinth, 13));
        buffer.add(new Hole(labyrinth, 17));
        return buffer;
    }
}
