package text_game;

import java.util.Random;

public class HeroFactory {
    static final String[] heros = {"text_game.Hobbit", "text_game.Elf", "text_game.Knight", "text_game.King"};
    public Hero createHero() throws Exception {
        Random rnd = new Random();
        String pick = heros[rnd.nextInt(heros.length)];
        return (Hero) Class.forName(pick).getConstructor().newInstance();
    }
}
