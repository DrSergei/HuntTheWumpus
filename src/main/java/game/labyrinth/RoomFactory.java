package main.java.game.labyrinth;

import java.util.ArrayList;
import java.util.List;

public class RoomFactory {

    public List<Room> createRooms() {
        Integer counter = 1;
        List<Room> buffer = new ArrayList();
        while (counter <= 20) {
            buffer.add(new Room(counter++));
        }
        return buffer;
    }
}
