package com.company.objects.enemy;

import org.jetbrains.annotations.NotNull;

public class Wumpus extends Enemy {

    @Override
    @NotNull
    public String warningMessage() {
        return "чувствуете смрадный запах";
    }

    @Override
    public void personMove() {

    }

    @Override
    public void personShout() {

    }
}
