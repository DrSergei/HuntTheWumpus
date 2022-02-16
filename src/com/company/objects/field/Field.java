package com.company.objects.field;

import com.company.objects.enemy.Enemy;
import com.company.objects.person.Person;

import java.util.List;

public class Field {

    public Field() {
        this.labyrinth = new RoomFactory().createRooms();
        this.player = new Person();
    }

    private final List<RoomFactory.Room> labyrinth;
    private List<Enemy> enemies;
    private final Person player;
}
