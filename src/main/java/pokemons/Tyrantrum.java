package pokemons;


import attacks.Bite;
import attacks.BrutalSwing;
import attacks.DarkPulse;
import ru.ifmo.se.pokemon.Type;

public class Tyrantrum extends Tyrunt{
    public Tyrantrum(String pokemonName, int pokemonLevel) {
        super(pokemonName, pokemonLevel);
        setStats(82,121, 119, 69, 59, 71);
        setType(Type.ROCK, Type.DRAGON);
        setMove(new DarkPulse(), new BrutalSwing(), new Bite());
    }
}
