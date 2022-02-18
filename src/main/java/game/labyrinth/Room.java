package main.java.game.labyrinth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {

    Room(Integer id) {
        this.id = id;
        this.neighbours = new ArrayList<>();
    }

    Room(Integer id, List<Room> neighbours) {
        this.id = id;
        this.neighbours = neighbours;
    }

    public final Integer id;

    final private List<Room> neighbours;
    public List<Room> getNeighbours() {
        return Collections.unmodifiableList(neighbours);
    }
}