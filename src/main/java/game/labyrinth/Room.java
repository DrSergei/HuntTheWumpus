package main.java.game.labyrinth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {

    Room(Integer id) {
        this.id = id;
        this.neighbours = new ArrayList<>();
        this.warningMessage = "";
    }

    Room(Integer id, List<Room> neighbours) {
        this.id = id;
        this.neighbours = neighbours;
        this.warningMessage = "";
    }

    public final Integer id;
    public String warningMessage;
    final private List<Room> neighbours;
    public List<Room> getNeighbours() {
        return Collections.unmodifiableList(neighbours);
    }
}
