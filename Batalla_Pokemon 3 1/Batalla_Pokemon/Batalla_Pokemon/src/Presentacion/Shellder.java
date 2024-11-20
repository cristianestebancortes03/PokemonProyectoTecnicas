package Presentacion;


import Presentacion.TipoPokemon;

public class Shellder extends Pokemon {
    
    public Shellder() {
        super("Shellder", + 30, 65, TipoPokemon.AGUA);
    }
    
    public void atacar(Pokemon oponente){
        System.out.println(getNombre() + "USA DISPARO DE CONCHA CONTRA" + oponente.getNombre() + "!");
        super.atacar(oponente);
    }
    
}
