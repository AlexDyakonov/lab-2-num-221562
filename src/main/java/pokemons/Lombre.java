package pokemons;


import attacks.Absorb;
import attacks.Astonish;
import ru.ifmo.se.pokemon.Type;

public class Lombre extends Lotad{

    public Lombre(String pokemonName, int pokemonLevel) {
        super(pokemonName, pokemonLevel);
        setStats(60,50, 50, 60, 70, 50);
        setType(Type.WATER, Type.GRASS);
        setMove(new Astonish(),new Absorb());
    }

}
