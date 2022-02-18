package main.java.io;

import main.java.game.Person;

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
            Integer number = input.nextInt();
            currentResult = player.move(number);
        }
    }
}
