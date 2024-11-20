package Presentacion;


import Presentacion.Pokemon;
import Presentacion.TipoPokemon;

public class Diglett extends Pokemon {
    public Diglett() {
        super("Diglle", 10, 55, TipoPokemon.TIERRA);
    }
    
    public void atacar(Pokemon oponente) {
        System.out.println(getNombre() + "USA EXCAVAR CONTRA" + oponente.getNombre() + "!");
        super.atacar(oponente);
    }
}
