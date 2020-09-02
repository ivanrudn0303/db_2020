package text_game;

public class Elf extends Hero {
    public Elf() {
        super(new PreciseKick());
        hp = 10;
        power = 10;
        name = "Elf";
    }
}
