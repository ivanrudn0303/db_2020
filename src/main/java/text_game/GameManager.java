package text_game;

public class GameManager {
    public void fight(Hero left, Hero right) {
        while (left.isAlive() && right.isAlive()){
            left.kick(right);
            System.out.println(left.getName() + " kicks " + right.getName());
            Hero tmp = left;
            left = right;
            right = tmp;
        }
        writeTollIfDead(left);
        writeTollIfDead(right);
    }

    private void writeTollIfDead(Hero h) {
        if (!h.isAlive()) {
            System.out.println(h.getName() + " is dead");
        }
    }

    public static void main(String[] args) throws Exception {
        GameManager gm = new GameManager();
        HeroFactory factory = new HeroFactory();
        Hero h1 = factory.createHero();
        Hero h2 = factory.createHero();
        gm.fight(h1, h2);
    }
}
