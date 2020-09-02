package text_game;

import java.util.Random;

public class King extends Hero {
    static final int minPower = 5;
    static final int minHp = 5;
    static final int maxPower = 15;
    static final int maxHp = 15;
    public King() {
        super(new RandomKick());
        Random rnd = new Random();
        hp = rnd.nextInt(Knight.maxHp - Knight.minHp + 1) + Knight.minHp;
        power = rnd.nextInt(Knight.maxPower - Knight.minPower + 1) + Knight.minPower;
        name = "King";
    }
}
