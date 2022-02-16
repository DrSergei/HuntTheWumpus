package main.java.field.person;

import main.java.field.enemy.Hole;
import main.java.field.enemy.Listener;
import main.java.field.room.Room;

import java.util.List;

public class Person {

    private Integer arrows;
    private Integer healthPoints;
    private Room room;
    private List<Listener> listeners;

    public Person() {
        arrows = 5;
        healthPoints = 1;
    }

    public Person(Integer arrows, Integer healthPoints) {
        this.arrows = arrows;
        this.healthPoints = healthPoints;
    }

    public void move(Integer number) {
        for (Listener listener : listeners) {
            listener.personMove();
        }
    }

    public void shout() {
        assert(arrows > 0);
        arrows--;
        for (Listener listener : listeners) {
            listener.personShout();
        }
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }
}