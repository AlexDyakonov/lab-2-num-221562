package attacks;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage){
        pokemon.setMod(Stat.HP, (int)damage);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(0).stat(Stat.HP, +(int)(pokemon.getHP() - pokemon.getStat(Stat.HP)/2)));
    }

    @Override
    protected String describe() {
        return "Absorb! Атака наносит урон и восстанавливает атакующему покемону 50% нанесенного урона.";
    }
}

//    Absorb deals damage and the user will recover 50% of the HP drained.
