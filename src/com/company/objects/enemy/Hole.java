package com.company.objects.enemy;

import org.jetbrains.annotations.NotNull;

public class Hole extends Enemy {

    @Override
    @NotNull
    public String warningMessage() {
        return "ощущаете сквозняк";
    }

    @Override
    public void personMove() {

    }

    @Override
    public void personShout() {

    }
}
