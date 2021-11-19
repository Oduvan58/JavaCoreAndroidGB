package by.geekbrains.jca.lesson8;

import by.geekbrains.jca.lesson8.barriers.Barrier;
import by.geekbrains.jca.lesson8.barriers.Track;
import by.geekbrains.jca.lesson8.barriers.Wall;
import by.geekbrains.jca.lesson8.players.Cat;
import by.geekbrains.jca.lesson8.players.Human;
import by.geekbrains.jca.lesson8.players.Player;
import by.geekbrains.jca.lesson8.players.Robot;

public class Competition {
    public static void main(String[] args) {
        Player[] players = {
                new Human("Adam"),
                new Cat("Barsik"),
                new Robot("Chappi")
        };

        Barrier[] barriers = {
                new Track(1000),
                new Wall(1)
        };

        for (Player player : players) {
            for (Barrier barrier : barriers) {
                barrier.doAction(player);
                if (!player.isSuccess()) break;
            }
        }
    }
}
