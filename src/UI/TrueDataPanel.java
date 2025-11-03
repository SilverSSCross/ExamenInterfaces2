package UI;

import Clases.UsuarioDataService;
import DataController.PeliculaDataService;
import objetos.Pelicula;
import objetos.Usuario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TrueDataPanel extends JFrame {
    private JTable table1;
    private JPanel panel1;
    private JComboBox<String> comboBox1;
    private DefaultTableModel modelo_tabla;


    public TrueDataPanel() {
        UsuarioDataService usuarioDataService = new UsuarioDataService();
        usuarioDataService.getUsuarios();
        setTitle("Tabla de datos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setSize(800,600);
        setLocationRelativeTo(null);
        setContentPane(panel1);

    }
    //Funciones de la tabla
    //Crear la tabla
    public void cargarPeliculas(){

        table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table1.setRowSelectionAllowed(true);
        table1.setColumnSelectionAllowed(false);
        table1.setCellSelectionEnabled(false);

        String[]columna={"Correo", "Pais", "Plataforma"};
        modelo_tabla =new DefaultTableModel(columna,0);
        table1.setModel(modelo_tabla);

        

    }

}
