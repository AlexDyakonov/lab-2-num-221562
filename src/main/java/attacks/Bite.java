package attacks;

import ru.ifmo.se.pokemon.*;

public class Bite extends PhysicalMove {
    public Bite() {
        super(Type.DARK, 60, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)damage);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().turns(1).chance(0.3);
        Effect.flinch(pokemon);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "Bite! С шансом 30% покемон испугает противника.";
    }
}

// Bite deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).