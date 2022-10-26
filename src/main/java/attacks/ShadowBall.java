package attacks;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)damage);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        double chance = Math.random();
        if (chance <= 0.2){
            if (pokemon.getStat(Stat.DEFENSE) < 6){
                pokemon.setCondition(new Effect().turns(-1).stat(Stat.DEFENSE, +1));
            }
        }
    }

    @Override
    protected String describe() {
        return "Shadow Ball! Защита покемона увеличена на одну стадию.";
    }

}

//Shadow Ball deals damage and has a 20% chance of lowering the target's Special Defense by one stage.
//Stats can be lowered to a minimum of -6 stages each.