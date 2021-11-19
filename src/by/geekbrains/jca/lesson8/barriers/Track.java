package by.geekbrains.jca.lesson8.barriers;

import by.geekbrains.jca.lesson8.players.Player;

public class Track extends Barrier {

    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void doAction(Player player) {
        player.run(length);
    }
}
