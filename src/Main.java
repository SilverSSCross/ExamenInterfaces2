import UI.AddUsuario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddUsuario adivinar = new AddUsuario();
            adivinar.setVisible(true);
        });
    }
}
