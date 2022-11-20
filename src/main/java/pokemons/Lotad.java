package pokemons;


import attacks.Astonish;
import attacks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

//посмотреть про list, дописать характеристики

public class Lotad extends Pokemon {
    public Lotad(String pokemonName, int pokemonLevel) {
        super(pokemonName, pokemonLevel);
        setStats(40,30, 30, 40, 50, 30);
        setType(Type.WATER, Type.GRASS);
        setMove(new Astonish(), new Rest());
    }
}
