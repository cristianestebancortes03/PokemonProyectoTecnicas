package Precentacion.pokedex;
    
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPokemon extends JFrame {
    private JButton btnGestionarEntrenadores, btnGestionarPokemon, btnIniciarBatalla;

    public VistaPokemon() {
        setTitle("Simulador de Batallas Pokémon");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnGestionarEntrenadores = new JButton("Gestionar Entrenadores");
        btnGestionarPokemon = new JButton("Gestionar Pokémon");
        btnIniciarBatalla = new JButton("Iniciar Batalla");

        setLayout(new FlowLayout());
        add(btnGestionarEntrenadores);
        add(btnGestionarPokemon);
        add(btnIniciarBatalla);

        // Acción para iniciar batalla
        btnIniciarBatalla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para iniciar la batalla
                // Se podría abrir una nueva ventana para seleccionar entrenadores y Pokémon
            }
        });
    }

    public void mostrar() {
        setVisible(true);
    }

    public void mostrarResultado(String resultado) {
        JOptionPane.showMessageDialog(this, resultado);
    }

    public void actualizarPokemon(Pokemon pokemon) {
        System.out.println(pokemon.getNombre() + " actualizado: Salud = " + pokemon.getSalud() + ", Ataque = " + pokemon.getPuntosDeAtaque());
    }

    private static class Pokemon {

        private String nombre;
        private String Salud;
        private String PuntosDeAtaque;

        public Pokemon() {
        }

        private String getNombre() {
        return this.nombre;    
        }

        private String getSalud() {
           return this.Salud;
        }

        private String getPuntosDeAtaque() {
           return this.PuntosDeAtaque;
        }
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
