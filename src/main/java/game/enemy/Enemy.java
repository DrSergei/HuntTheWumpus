package main.java.game.enemy;


import main.java.game.labyrinth.Room;

public abstract class Enemy implements Listener {

    public abstract String warningMessage();

    public Enemy(Room room) {
        this.room = room;
        room.warningMessage = warningMessage();
    }

    protected Room room;

    public final Room getRoom() {
        return room;
    }
}