package main.java.game.enemy;


import main.java.game.labyrinth.Labyrinth;
import main.java.game.labyrinth.Room;

public abstract class Enemy implements Listener {

    public abstract String warningMessage();

    public Enemy(Labyrinth labyrinth, Integer index) {
        this.labyrinth = labyrinth;
        room = labyrinth.get(index);
    }

    protected Labyrinth labyrinth;
    protected Room room;

    public final Room getRoom() {
        return room;
    }
}