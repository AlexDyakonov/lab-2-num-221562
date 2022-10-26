package pokemons;

import attacks.Moonblast;
import attacks.ShadowBall;
import attacks.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cosmog extends Pokemon {

    public Cosmog(String pokemonName, int pokemonLevel) {
        super(pokemonName, pokemonLevel);
        setStats(43,29, 31, 29, 31, 37);
        setType(Type.PSYCHIC);
        setMove(new ShadowBall(), new Waterfall(), new Moonblast());
    }
}

