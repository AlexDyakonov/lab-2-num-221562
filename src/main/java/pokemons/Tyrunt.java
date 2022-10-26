package pokemons;

import attacks.Bite;
import attacks.DarkPulse;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tyrunt extends Pokemon {

    public Tyrunt(String pokemonName, int pokemonLevel) {
        super(pokemonName, pokemonLevel);
        setStats(58,89, 77, 45, 45, 58);
        setType(Type.ROCK, Type.DRAGON);
        setMove(new DarkPulse(), new Bite());
    }

}
