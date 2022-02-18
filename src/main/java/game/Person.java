package main.java.game;

import main.java.game.labyrinth.Field;
import main.java.game.enemy.Listener;
import main.java.game.labyrinth.Room;

import java.util.List;

public class Person {

    private Integer arrows;
    private Room room;
    private List<Listener> listeners;
    public final Field field;

    public Person() {
        arrows = 5;
        field = new Field();
        for (Listener listener : field.getEnemies()) {
            addListener(listener);
        }
        room = field.getStartRoom();
    }

    public enum Result {
        WIN,
        LOSE,
        NOTHING
    }

    // добавляет наблюдателя действий игрока
    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    // функция перехода в соседнюю комнату
    public Result move(Integer number) {
        List<Room> neighbours = room.getNeighbours();
        for (Room room : neighbours) {
            if (room.id == number) {
                this.room = room;
                for (Listener listener : listeners) {
                    Result result = listener.personMove(this);
                    if (result == Result.LOSE || result == Result.WIN) {
                        return result;
                    }
                }
            }
        }
        return Result.NOTHING;
    }

    // функция переноса в любую комнату
    public Result setRoom(Room room) {
        this.room = room;
        for (Listener listener : listeners) {
            Result result = listener.personMove(this);
            if (result == Result.LOSE || result == Result.WIN) {
                return result;
            }
        }
        return Result.NOTHING;
    }

    // возвращает текущую комнату
    public final Room getRoom() {
        return room;
    }

    public String warningMessage() {
        StringBuilder buffer = new StringBuilder();
        // TODO
        return buffer.toString();
    }

    public String labyrinthMessage() {
        // TODO
        return "";
    }

    // функция стрельбы
    public Result shout() {
        assert(arrows > 0);
        arrows--;
        for (Listener listener : listeners) {
            Result result = listener.personMove(this);
            if (result == Result.LOSE || result == Result.WIN) {
                return result;
            }
        }
        if (arrows == 0) {
            return Result.LOSE;
        }
        return Result.NOTHING;
    }
}