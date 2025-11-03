package UI;

import Clases.Pais;
import Clases.Usuario;

import javax.swing.*;

public class AddUsuario extends JFrame {
    private JTextField textCorreo;
    private JComboBox comboPais;
    private JComboBox comboPlataforma;
    private JButton addButton;
    private JButton cancelarButton;
    private JPanel addPanel;
    private JButton contactosButton;

    public AddUsuario() {
        setTitle("Add Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,600);
        setLocationRelativeTo(null);

        setComboPais();
        setComboPlataforma();

        setContentPane(addPanel);

        addButton.addActionListener(e -> {});
        cancelarButton.addActionListener(e -> {dispose();});


    }

    public void setComboPais() {
        String[] paises = new String[Pais.values().length];
        comboPais = new JComboBox(paises);
    }

    public void setComboPlataforma() {
        comboPlataforma = new JComboBox();
        comboPlataforma.addItem("Windows");
        comboPlataforma.addItem("MacOS");
        comboPlataforma.addItem("Linux");
    }

    public Usuario addUsuario() {
        Usuario u=new Usuario(
                textCorreo.getText(),
                comboPais.getSelectedItem().toString(),
                comboPlataforma.getSelectedItem().toString()
        );
        return u;
    }
}
