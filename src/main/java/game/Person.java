package main.java.game;

import main.java.game.enemy.Listener;
import main.java.game.labyrinth.Room;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Person {

    private Integer arrows;
    private Room room;
    private final List<Listener> listeners;

    /**
     * Создает персонажа
     */
    Person(Room startRoom) {
        arrows = 5;
        room = startRoom;
        listeners = new ArrayList<>();
    }

    /**
     * Добавляет слушателей
     */
    public void addListeners(Collection<? extends Listener> buffer) {
        listeners.addAll(buffer);
    }

    /**
     * Перемещает в комнату
     */
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

    /**
     * Стрельба по пути
     */
    public Game.Result shout(List<Integer> path) {
        arrows--;
        Game.Result currentResult = (arrows == 0) ? (Game.Result.LOSE) : (Game.Result.NOTHING);
        for(Listener listener : listeners) {
            currentResult = listener.personShout(this, path);
            if (currentResult == Game.Result.WIN)
                return currentResult;
        }
        return currentResult;
    }

    /**
     * Текущая комната
     */
    public final Room getRoom() {
        return room;
    }
}