package pokemons;

import attacks.Absorb;
import attacks.Astonish;
import attacks.Waterfall;
import ru.ifmo.se.pokemon.Type;

public class Ludicolo extends Lombre {
    public Ludicolo(String pokemonName, int pokemonLevel) {
        super(pokemonName, pokemonLevel);
        setStats(80,70, 70, 90, 100, 70);
        setType(Type.WATER, Type.GRASS);
        setMove(new Astonish(),new Absorb(), new Waterfall());
    }

}
