package main.java.game.enemy;

import main.java.game.Person;
//import main.java.game.Person.Result;

public interface Listener {

    Person.Result personMove(Person player);

    Person.Result personShout(Person player);
}

