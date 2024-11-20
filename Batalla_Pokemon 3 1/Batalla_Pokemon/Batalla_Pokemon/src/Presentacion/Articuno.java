package Presentacion;


import Presentacion.Pokemon;
import Presentacion.TipoPokemon;

public class Articuno extends Pokemon {
    public Articuno(){
    super("Articuno", 90, 85, TipoPokemon.HIELO);
    }
    public void atacar(Pokemon oponente){
        System.out.println(getNombre() + "LANZA UN ATACQUE DE HIELO A" + oponente.getNombre() + "!");
        super.atacar(oponente);
    }
}
    
