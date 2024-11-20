package Presentacion;

import Presentacion.Pokemon;
import java.util.ArrayList;
import java .util.List;
import java.util.Scanner;

public class Entrenador {
    private String nombre;
    private List<Pokemon> equipo;
    
    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
    }
    
    public void agregarPokemon(Pokemon pokemon) {
        equipo.add(pokemon);
        System.out.println(pokemon.getNombre() + "Ha sido añadido al equipo de " + this.nombre);     
    }
    
    public void entrenarPokemon(Pokemon pokemon) {
        if (equipo.contains(pokemon)) {
            pokemon.entrenar();
        }
        else {
            System.out.println(pokemon.getNombre() + "No pertenece al equipo de " + this.nombre);
        }
    }
    public void mostrarEquipo() {
        System.out.println("Equipo de " + nombre + ":");
        for (Pokemon p : equipo)  
        System.out.println("- " + p.getNombre() + "(salud: " + p.getSalud() + ", Ataque: " + p.getPuntosDeAtaque() + ")");
        } 
    public Pokemon seleccionarPokemon() {
    System.out.println("Equipo de " + this.nombre + ":");
    for (int i = 0; i < equipo.size(); i++) {
        System.out.println((i + 1) + ". " + equipo.get(i).getNombre() + 
            " (Salud: " + equipo.get(i).getSalud() + ", Ataque: " + equipo.get(i).getPuntosDeAtaque() + ")");
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Seleccione el número del Pokémon que desea usar: ");
    int opcion = scanner.nextInt();
    if (opcion > 0 && opcion <= equipo.size()) {
        return equipo.get(opcion - 1);
    } else {
        System.out.println("Opción inválida. Inténtelo de nuevo.");
        return seleccionarPokemon();
    }
}
    String getNombre() {
        return this.nombre;
    }
    String getPuntosDeAtaque() {
        return this.getPuntosDeAtaque();
    }
  }
    
    

