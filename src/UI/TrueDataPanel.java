package UI;

import Clases.Usuario;
import Clases.UsuarioDataService;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class TrueDataPanel extends JFrame {
    private JTable table1;
    private JPanel panel1;
    private JComboBox<String> comboBox1;
    private DefaultTableModel modelo_tabla;
    private UsuarioDataService usuarioDataService = new UsuarioDataService();


    public TrueDataPanel() {
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

        List<Usuario> lista=usuarioDataService.getUsuarios();

    }

}
