package main.java.game.enemy;


import main.java.game.labyrinth.Room;

public abstract class Enemy implements Listener {
    public abstract String warningMessage();

    protected Room room;
}