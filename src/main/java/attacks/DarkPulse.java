package attacks;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
    public DarkPulse() {
        super(Type.DARK, 80, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)damage);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().turns(1).chance(0.2);
        Effect.flinch(pokemon);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "Dark Pulse! С шансом 20% покемон испугает противника.";
    }
}

//Dark Pulse deals damage and has a 20% chance of causing the target to flinch (if the target has not yet moved).