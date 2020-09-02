package text_game;

public class Hobbit extends Hero {
    public Hobbit() {
        super(new Cry());
        hp = 3;
        power = 0;
        name = "Hobbit";
    }
}
