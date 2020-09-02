package text_game;

import java.util.Random;

public class RandomKick implements Ability {
    private Random rnd = new Random();
    @Override
    public void apply(Hero from, Hero to) {
        int effect = rnd.nextInt(1 + from.getPower());
        to.decreaseHp(effect);
    }
}
