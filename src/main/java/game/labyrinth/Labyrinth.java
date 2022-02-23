package main.java.game.labyrinth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static java.lang.Math.min;
import static java.util.Collections.shuffle;
import static java.util.Collections.sort;

public class Labyrinth {
    private List<Room> struct;

    public Labyrinth(List<Room> struct) {
        this.struct = struct;
    }

    public List<Integer> toValidPath(List<Integer> path) {
        Iterator<Integer> it = path.subList(0, min(5, path.size())).iterator();
        List<Integer> answer = new ArrayList();
        if (path.get(0) > struct.size())
            return answer;
        Room current = struct.get(path.get(0));
        answer.add(current.id);
        while (it.hasNext()) {
            Integer tmp = it.next();
            if (isNeighbour(current, tmp))
                answer.add(tmp);
            else
                break;
        }
        return answer;
    }

    public final Room getStartRoom() {
        return struct.get(0);
    }

    public final Room getRandomRoom() {
        return struct.get(new Random().nextInt(struct.size()));
    }

    public final Room get(Integer index) {
        if (index > struct.size())
            return null;
        return struct.get(index);
    }

    public boolean isNeighbour(Room room, Integer index) {
        for (Room curr : room.getNeighbours()) {
            if (curr.id == index)
                return true;
        }
        return false;
    }
}
