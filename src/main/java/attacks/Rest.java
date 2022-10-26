package attacks;

import ru.ifmo.se.pokemon.*;


// Статус покемона, не атака

public class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setCondition(new Effect().condition(Status.SLEEP).turns(2));
        pokemon.restore();
    }

    @Override
    protected String describe() {
        return "Покемон отдыхает 2 хода и восстанавливает очки здоровья.";
    }
}
