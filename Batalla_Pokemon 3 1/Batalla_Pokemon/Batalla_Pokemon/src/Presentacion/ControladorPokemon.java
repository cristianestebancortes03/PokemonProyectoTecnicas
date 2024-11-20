package Presentacion;


import Presentacion.Pokemon;
import javax.swing.JOptionPane;

public class ControladorPokemon {
private VistaPokemon vista;

public ControladorPokemon(VistaPokemon vista) {
    this.vista = vista;
}
public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
    Batalla batalla = new Batalla(pokemon1, pokemon2);
    String resultado = batalla.iniciar();
    vista.mostrarResultado(resultado);
}
 public void entrenarPokemon(Pokemon pokemon) {
     pokemon.entrenar();
     vista.actualizarPokemon(pokemon);
 }

    private static class VistaPokemon {

        public VistaPokemon() {
        }

        private void mostrarResultado(String resultado) {
                JOptionPane.showMessageDialog(null, "Resultado de la Batalla: " + resultado);
    }

        private void actualizarPokemon(Pokemon pokemon) {
           System.out.println(pokemon.getNombre() + " actualizado. Salud: " + pokemon.getSalud() + ", Ataque: " + pokemon.getPuntosDeAtaque());
    }
    }
    
}
