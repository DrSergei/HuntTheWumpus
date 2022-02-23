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

    public String neighboursMessage() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Соседние комнаты:");
        for (Room room : neighbours) {
            buffer.append(" ").append(room.id);
        }
        return buffer.toString();
    }

    public String WarningMessage() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Вы ");
        for (Room room : neighbours) {
            buffer.append(room.warningMessage).append(" ");
        }
        return buffer.toString();
    }

    public final Integer id;
    private String warningMessage;
    public void setWarningMessage(String buffer) {
        warningMessage = buffer;
    }
    private final List<Room> neighbours;
    void addNeighbour(Room room) {
        neighbours.add(room);
    }
    public List<Room> getNeighbours() {
        return Collections.unmodifiableList(neighbours);
    }
}
