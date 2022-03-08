package main.java.game.labyrinth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Room {

    /**
     * Создает комнату
     */
    Room(Integer id) {
        this.id = id;
        this.neighbours = new ArrayList<>();
        this.warningMessage = "";
    }

    /**
     * Сообщения о соседях
     */
    public String neighboursMessage() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Соседние комнаты:");
        for (Room room : neighbours) {
            buffer.append(" ").append(room.id);
        }
        return buffer.toString();
    }

    /**
     * Сообщения об опасностях в соседних комнатах
     */
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

    /**
     * устанавливает сообщение об опасности в этой комнате
     */
    public void setWarningMessage(String buffer) {
        warningMessage = buffer;
    }
    private final List<Room> neighbours;

    /**
     * Добавляет соседа
     */
    void addNeighbour(Room room) {
        neighbours.add(room);
    }

    /**
     * Список соседей
     */
    public List<Room> getNeighbours() {
        return Collections.unmodifiableList(neighbours);
    }
}
