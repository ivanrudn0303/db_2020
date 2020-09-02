package text_game;

public class PreciseKick implements Ability {
    @Override
    public void apply(Hero from, Hero to) {
        if (from.getPower() > to.getPower()) {
            to.decreaseHp(to.getHp());
        } else {
            to.decreasePower(1);
        }
    }
}
