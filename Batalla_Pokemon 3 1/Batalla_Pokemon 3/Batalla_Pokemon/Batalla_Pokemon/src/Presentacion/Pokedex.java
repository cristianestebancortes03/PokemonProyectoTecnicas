package Presentacion; 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pokedex extends JFrame {
    public Pokedex() {
        setTitle("Pokedex - Simulador Pokémon");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Simulador de Batallas Pokémon", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        add(title, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton manageTrainers = new JButton("Gestionar Entrenadores");
        JButton managePokemon = new JButton("Gestionar Pokémon");
        JButton startBattle = new JButton("Iniciar Batalla");

        manageTrainers.addActionListener(e -> {
           JFrame trainersFrame = new JFrame("Gestionar Entrenadores");
    trainersFrame.setSize(400, 300);
    trainersFrame.setLocationRelativeTo(null);

    DefaultListModel<String> listModel = new DefaultListModel<>();
    JList<String> trainerList = new JList<>(listModel);

    JButton addTrainerButton = new JButton("Agregar Entrenador");
    addTrainerButton.addActionListener(ev -> {
        String name = JOptionPane.showInputDialog(trainersFrame, "Ingrese el nombre del entrenador:");
        if (name != null && !name.trim().isEmpty()) {
            listModel.addElement(name);
        }
        });

       trainersFrame.setLayout(new BorderLayout());
       trainersFrame.add(new JScrollPane(trainerList), BorderLayout.CENTER);
       trainersFrame.add(addTrainerButton, BorderLayout.SOUTH);

        trainersFrame.setVisible(true);
        });
        managePokemon.addActionListener(e -> {
    JFrame pokemonFrame = new JFrame("Gestionar Pokémon");
    pokemonFrame.setSize(400, 300);
    pokemonFrame.setLocationRelativeTo(null);

    DefaultListModel<String> pokemonModel = new DefaultListModel<>();
    JList<String> pokemonList = new JList<>(pokemonModel);

    JButton addPokemonButton = new JButton("Agregar Pokémon");
    addPokemonButton.addActionListener(ev -> {
        String name = JOptionPane.showInputDialog(pokemonFrame, "Ingrese el nombre del Pokémon:");
        if (name != null && !name.trim().isEmpty()) {
            pokemonModel.addElement(name);
        }
    });

    pokemonFrame.setLayout(new BorderLayout());
    pokemonFrame.add(new JScrollPane(pokemonList), BorderLayout.CENTER);
    pokemonFrame.add(addPokemonButton, BorderLayout.SOUTH);

    pokemonFrame.setVisible(true);
   });

        startBattle.addActionListener(e -> {
    JFrame battleFrame = new JFrame("Iniciar Batalla");
    battleFrame.setSize(400, 300);
    battleFrame.setLocationRelativeTo(null);

    JLabel label = new JLabel("Esta función está en desarrollo. ¡Pronto estará lista!");
    label.setHorizontalAlignment(SwingConstants.CENTER);

    battleFrame.setLayout(new BorderLayout());
    battleFrame.add(label, BorderLayout.CENTER);

    battleFrame.setVisible(true);
    ;});

        buttonPanel.add(manageTrainers);
        buttonPanel.add(managePokemon);
        buttonPanel.add(startBattle);

        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Pokedex().setVisible(true);
        });
    }
}

   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

