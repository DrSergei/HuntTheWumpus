package com.company.objects.enemy;


import com.company.objects.field.RoomFactory;

public abstract class Enemy implements Listener {
    public abstract String warningMessage();

    protected RoomFactory.Room room;

    public void remove(RoomFactory.Room room) {
        this.room = room;
    }
}
