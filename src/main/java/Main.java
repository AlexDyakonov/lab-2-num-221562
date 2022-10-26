import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Cosmog("Cosmog", 1);
        Pokemon p2 = new Lombre("Ломбре", 1);
        Pokemon p3 = new Lotad("Лотад", 1);
        Pokemon p4 = new Ludicolo("Лудицоло", 1);
        Pokemon p5 = new Tyrunt("Турунт", 1);
        Pokemon p6 = new Tyrantrum("Турунтрум", 1);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}

//Создать один из классов покемонов для своего варианта. Класс должен наследоваться от базового класса Pokemon.
// В конструкторе нужно будет задать типы покемона и его базовые характеристики.
// После этого попробуйте добавить покемона в сражение.