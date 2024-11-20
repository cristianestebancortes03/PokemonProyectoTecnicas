package Presentacion;


import Presentacion.Pokemon;
import Presentacion.TipoPokemon;

public class Caterpie extends Pokemon{
    
    public Caterpie(){
        super("Caterpie", + 45, 30, TipoPokemon.BICHO);
    }
    public void atacar(Pokemon oponente){
        System.out.println(getNombre() + "LANZA UN ATAQUE DE SEDA CONTRA" + oponente.getNombre() + "!");
        super.atacar(oponente);
    }
}
