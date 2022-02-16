package com.company.objects.enemy;

import org.jetbrains.annotations.NotNull;

public class Bat extends Enemy {

    @Override
    @NotNull
    public String warningMessage() {
        return "слышите шум";
    }

    @Override
    public void personMove() {

    }

    @Override
    public void personShout() {

    }
}
