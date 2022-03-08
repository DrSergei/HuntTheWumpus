package main.java.io;

import main.java.game.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {

    private CLI() {}

    /**
     * Цикл общения с игроком
     */
    public static void play() {
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        Game.Result result;
        while (true) {
            System.out.println(game.warningMessage());
            System.out.println(game.neighboursMessage());
            while (true) {
                System.out.println("Вы хотите стрелять(Да/Нет)?");
                String answer = input.next();
                if (answer.equals("Да")) {
                    List<Integer> path = new ArrayList<>();
                    while (input.hasNextInt()) {
                        path.add(input.nextInt());
                    }
                    result = game.playerShout(path);
                    System.out.println(path);
                    if (result == Game.Result.WIN) {
                        System.out.println("Победа");
                        return;
                    }
                    else if (result == Game.Result.LOSE) {
                        System.out.println("Проигрыш");
                        return;
                    }
                } else if (answer.equals("Нет")) {
                    break;
                }
            }
            System.out.println("Выберете следующую комнату:");
            result = game.playerMove(input.nextInt());
            if (result == Game.Result.WIN) {
                System.out.println("Победа");
                return;
            }
            else if (result == Game.Result.LOSE) {
                System.out.println("Проигрыш");
                return;
            }
        }
    }
}
