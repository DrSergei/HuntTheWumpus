package main.java.game.labyrinth;

import java.util.ArrayList;
import java.util.List;

public class LabyrinthFactory {

    public Labyrinth createLabyrinth() {
        List<Room> buffer = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            buffer.add(new Room(i));
        }
        for (int i = 0; i < 20; i++) {
            buffer.get(i).addNeighbour(buffer.get( (i + 16) % 20));
            buffer.get(i).addNeighbour(buffer.get((i + 4) % 20));
            buffer.get(i).addNeighbour(buffer.get( (i / 4) * 4 + (i + 1) % 4));
            buffer.get(i).addNeighbour(buffer.get( (i / 4) * 4 + (i + 3) % 4));
        }
        return new Labyrinth(buffer);
    }
}
