package com.company.objects.person;

import com.company.objects.enemy.Listener;
import com.company.objects.field.Field;
import com.company.objects.field.RoomFactory;

import java.util.List;

public class Person {

    private Integer arrows;
    private Integer healthPoints;
    private RoomFactory.Room room;
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


    }

    public void shout() {
        assert(arrows > 0);
        arrows--;
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }
}