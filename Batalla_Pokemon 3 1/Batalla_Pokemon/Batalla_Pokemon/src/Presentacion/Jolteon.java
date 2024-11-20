package Presentacion;


import Presentacion.Pokemon;
import Presentacion.TipoPokemon;

public class Jolteon extends Pokemon {
    
    public Jolteon(){
        super("Jolteon", + 65, 65, TipoPokemon.ELECTRICO);
    }
    public void atacar(Pokemon oponente) {
        System.out.println(getNombre() + "LANZA UN RAYO CONTRA" + oponente.getNombre() + "!");
        super.atacar(oponente);
    }
}
