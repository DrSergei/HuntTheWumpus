package main.java.game;

import main.java.game.enemy.Listener;
import main.java.game.labyrinth.Room;


import java.util.Collection;
import java.util.List;

public class Person {

    private Integer arrows;
    private Room room;
    private List<Listener> listeners;

    Person(Room startRoom) {
        arrows = 5;
        room = startRoom;
    }

    public void addListeners(Collection<? extends Listener> buffer) {
        listeners.addAll(buffer);
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public Game.Result move(Room newRoom) {
        room = newRoom;
        Game.Result currentResult = Game.Result.NOTHING;
        for(Listener listener : listeners) {
            currentResult = listener.personMove(this);
            if (currentResult != Game.Result.NOTHING)
                return currentResult;
        }
        return currentResult;
    }

    public Game.Result shout(List<Integer> path) {
        arrows--;
        if (arrows == 0)
            return Game.Result.LOSE;
        return Game.Result.NOTHING;
    }

    public final Room getRoom() {
        return room;
    }
}