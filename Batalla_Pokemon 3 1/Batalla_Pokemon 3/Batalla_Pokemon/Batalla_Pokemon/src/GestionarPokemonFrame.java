import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class GestionarPokemonFrame extends JFrame {
    private List<Pokemon> seleccionados = new ArrayList<>();

    public GestionarPokemonFrame(List<Pokemon> pokemonesDisponibles) {
        setTitle("Seleccionar Pokémon");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        pokemonesDisponibles.forEach(p -> listModel.addElement(p.getNombre()));

        JList<String> pokemonList = new JList<>(listModel);
        JButton seleccionarButton = new JButton("Seleccionar Pokémon");

        seleccionarButton.addActionListener(e -> {
            List<String> seleccionadosStr = pokemonList.getSelectedValuesList();
            if (seleccionadosStr.size() > 5) {
                JOptionPane.showMessageDialog(this, "Solo puedes seleccionar 5 Pokémon.");
            } else {
                seleccionados.clear();
                for (String nombre : seleccionadosStr) {
                    seleccionados.add(
                        pokemonesDisponibles.stream()
                            .filter(p -> p.getNombre().equals(nombre))
                            .findFirst()
                            .orElse(null)
                    );
                }
                JOptionPane.showMessageDialog(this, "Pokémon seleccionados: " + seleccionadosStr);
            }
        });

        setLayout(new BorderLayout());
        add(new JScrollPane(pokemonList), BorderLayout.CENTER);
        add(seleccionarButton, BorderLayout.SOUTH);
    }

    public List<Pokemon> getSeleccionados() {
        return seleccionados;
    }
}
