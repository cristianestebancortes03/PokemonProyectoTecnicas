package Presentacion;


import Presentacion.EstadoPokemon;
import Presentacion.Pokemon;
import java.io.IOException;

public class Batalla {
    private Pokemon pokemon1;
    private Pokemon pokemon2;

public Batalla(Pokemon pokemon1,Pokemon pokemon2) {
    this.pokemon1 = pokemon1;
    this.pokemon2 = pokemon2;
}

public String iniciar() {
    System.out.println("¡Comienza la batalla entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + "!");
    while(pokemon1.getEstado() != EstadoPokemon.DEBILITADO && pokemon2.getEstado() != EstadoPokemon.DEBILITADO){
       pokemon1.atacar(pokemon2);
       if(pokemon2.getEstado() != EstadoPokemon.DEBILITADO){
        pokemon2.atacar(pokemon1);
       }
    }
    return pokemon1.getEstado() == EstadoPokemon.DEBILITADO ? pokemon2.getNombre() + " Ha GANADO" : pokemon1.getNombre() + "HA GANADO"; 
}
public void aplicarCondiciones(Pokemon oponente, EstadoPokemon estado) {
    switch (estado) {
        case PARALIZADO:
            System.out.println(oponente.getNombre() + " está paralizado y no puede atacar.");
            break;
        case ENVENENADO:
            oponente.recibirDaño(5); // Daño por veneno
            System.out.println(oponente.getNombre() + " pierde 5 puntos de salud por veneno.");
            break;
        default:
            break;
    }
}
public void iniciarConTeclas(Pokemon pokemon1, Pokemon pokemon2) {
    System.out.println("Presiona 'A' para que " + pokemon1.getNombre() + " ataque, 'L' para que " + pokemon2.getNombre() + " ataque.");
    while (pokemon1.getEstado() != EstadoPokemon.DEBILITADO && pokemon2.getEstado() != EstadoPokemon.DEBILITADO) {
        try {
            char key = (char) System.in.read();
            if (key == 'A') {
                pokemon1.atacar(pokemon2);
            } else if (key == 'L') {
                pokemon2.atacar(pokemon1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}
