package Presentacion;


import Presentacion.Pokemon;
import Presentacion.TipoPokemon;

public class Hitmonlee extends Pokemon {
    public Hitmonlee() {
        super("Hitmonlee", 50, 120, TipoPokemon.LUCHA);
    }

    public void atacar(Pokemon oponente) {
        System.out.println(getNombre() + " usa patada alta contra " + oponente.getNombre() + "!");
        super.atacar(oponente);
    }
}
