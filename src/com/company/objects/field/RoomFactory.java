package com.company.objects.field;

import com.company.objects.enemy.Enemy;

import java.util.ArrayList;
import java.util.List;

public class RoomFactory {

    public List<Room> createRooms() {
        return new ArrayList();
    }

    public static class Room {

        private Room(Integer id) {
            this.id = id;
            this.neighbours = new ArrayList<>();
        }

        private Room(Integer id, List<Room> neighbours) {
            this.id = id;
            this.neighbours = neighbours;
        }

        public final Integer id;

        final private List<Room> neighbours;
        public List<Room> getNeighbours() {
            return neighbours;
        }
    }
}
