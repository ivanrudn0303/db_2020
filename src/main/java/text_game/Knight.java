package text_game;

import java.util.Random;

public class Knight extends Hero {
    static final int minPower = 2;
    static final int minHp = 2;
    static final int maxPower = 12;
    static final int maxHp = 12;
    public Knight() {
        super(new RandomKick());
        Random rnd = new Random();
        hp = rnd.nextInt(Knight.maxHp - Knight.minHp + 1) + Knight.minHp;
        power = rnd.nextInt(Knight.maxPower - Knight.minPower + 1) + Knight.minPower;
        name = "Knight";
    }
}
