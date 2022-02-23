package main.java.io;

import main.java.game.Game;

import java.util.Scanner;

public class CLI {

    private CLI() {}
    // Цикл игры
    public static void play() {
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(game.warningMessage());
            System.out.println(game.neighboursMessage());
            game.playerMove(input.nextInt());
        }
    }
}
