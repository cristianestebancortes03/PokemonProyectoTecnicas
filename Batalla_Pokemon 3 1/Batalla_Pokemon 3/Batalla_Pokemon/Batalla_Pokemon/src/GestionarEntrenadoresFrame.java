import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GestionarEntrenadoresFrame extends JFrame {
    private List<Entrenador> entrenadores = new ArrayList<>();

    public GestionarEntrenadoresFrame() {
        setTitle("Gestionar Entrenadores");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> entrenadorList = new JList<>(listModel);
        JButton addTrainerButton = new JButton("Agregar Entrenador");

        addTrainerButton.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del entrenador:");
            if (nombre != null && !nombre.trim().isEmpty()) {
                Entrenador entrenador = new Entrenador(nombre);
                entrenadores.add(entrenador);
                listModel.addElement(nombre);
            }
        });

        setLayout(new BorderLayout());
        add(new JScrollPane(entrenadorList), BorderLayout.CENTER);
        add(addTrainerButton, BorderLayout.SOUTH);
    }

    public List<Entrenador> getEntrenadores() {
        return entrenadores;
    }
}
