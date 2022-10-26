package attacks;

import ru.ifmo.se.pokemon.*;

public class Withdraw extends StatusMove {
    public Withdraw () {
        super(Type.WATER, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (pokemon.getStat(Stat.DEFENSE) < 6){
            pokemon.setCondition(new Effect().turns(-1).stat(Stat.DEFENSE, +1));
        }
    }

    @Override
    protected String describe() {
        return "Withdraw! Защита покемона увеличена на 1 стадию!";
    }
}
