import javax.swing.*;
import java.awt.*;

public class BatallaFrame extends JFrame {
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private JLabel pokemon1Info, pokemon2Info;

    public BatallaFrame(Pokemon p1, Pokemon p2) {
        this.pokemon1 = p1;
        this.pokemon2 = p2;

        setTitle("Batalla Pokémon");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(1, 2));
        pokemon1Info = new JLabel(getInfo(pokemon1));
        pokemon2Info = new JLabel(getInfo(pokemon2));
        panel.add(pokemon1Info);
        panel.add(pokemon2Info);

        JButton atacar1Button = new JButton(pokemon1.getNombre() + " Ataca");
        atacar1Button.addActionListener(e -> atacar(pokemon1, pokemon2));
        JButton atacar2Button = new JButton(pokemon2.getNombre() + " Ataca");
        atacar2Button.addActionListener(e -> atacar(pokemon2, pokemon1));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(atacar1Button);
        buttonPanel.add(atacar2Button);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void atacar(Pokemon atacante, Pokemon defensor) {
        atacante.atacar(defensor);
        actualizarInfo();
        if (defensor.getEstado() == EstadoPokemon.DEBILITADO) {
            JOptionPane.showMessageDialog(this, defensor.getNombre() + " ha sido derrotado.");
        }
    }

    private void actualizarInfo() {
        pokemon1Info.setText(getInfo(pokemon1));
        pokemon2Info.setText(getInfo(pokemon2));
    }

    private String getInfo(Pokemon p) {
        return "<html>" + p.getNombre() + "<br>Salud: " + p.getSalud() + "<br>Ataque: " + p.getPuntosDeAtaque() + "</html>";
    }
}
