package by.geekbrains.jca.lesson8.barriers;

import by.geekbrains.jca.lesson8.players.Player;

public class Wall extends Barrier {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doAction(Player player) {
        player.jump(height);
    }
}
