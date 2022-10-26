package attacks;

import ru.ifmo.se.pokemon.*;

public class Moonblast extends SpecialMove {
    public Moonblast() {
        super(Type.FAIRY, 95, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)damage);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setCondition(new Effect().chance(0.30).turns(0).stat(Stat.SPECIAL_ATTACK, -1));
    }

    @Override
    protected String describe() {
        return "Moonblast! С шансом 30% покемон понизит специальную атаку противника на одну стадию.";
    }
}

//Moonblast deals damage and has a 30% chance of lowering the target's Special Attack by one stage.
