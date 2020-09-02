package text_game;

import static java.lang.Integer.max;

abstract public class Hero {
    protected int hp;
    protected int power;
    protected String name;
    protected Ability ability;

    public Hero(Ability ability) {
        this.ability = ability;
    }

    public void kick(Hero to) {
        ability.apply(this, to);
    }

    public boolean isAlive() {return hp > 0;}

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void decreaseHp(int by) {
        hp-=by;
    }

    public int getHp() {
        return hp;
    }

    public void decreasePower(int by) {
        power = max(0, power - by);
    }
}
