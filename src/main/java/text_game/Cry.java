package text_game;

public class Cry implements Ability {
    @Override
    public void apply(Hero from, Hero to) {
        System.out.println("Cry!!!");
    }
}
