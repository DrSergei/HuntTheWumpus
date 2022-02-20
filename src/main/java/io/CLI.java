package main.java.io;

import main.java.game.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CLI {

    // Цикл игры
    public void play() {
        Person player = new Person();
        Scanner input = new Scanner(System.in);
        Person.Result currentResult = Person.Result.NOTHING;
        while (currentResult == Person.Result.NOTHING) {
            System.out.println(player.warningMessage());
            System.out.println(player.labyrinthMessage());
            System.out.println("Будете ли вы стрелять(Да/Нет)?");
            if (input.next().equals("Да")) {
                System.out.println("Введите путь стрелы");
                List<Integer> path = new ArrayList();
                while (input.hasNextInt()) {
                    path.add(input.nextInt());
                }
                //currentResult = player.shout(path);
            }
            Integer number = input.nextInt();
            currentResult = player.move(number);
        }
    }
}
