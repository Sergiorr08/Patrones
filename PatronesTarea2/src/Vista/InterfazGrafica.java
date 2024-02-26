package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Modelo.Visitante;
import java.awt.*;
import java.util.ArrayList;

public class InterfazGrafica {
    private JFrame ventana;
    private JPanel panel;
    private JLabel etiquetaNombre;
    private JLabel etiquetaApellido;
    private JLabel etiquetaEdad;
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoEdad;
    private JButton btnAgregar;
    private JTable tabla;

    public InterfazGrafica() {
        inicializarInterfaz();
    }

    public void inicializarInterfaz() {

        ventana = new JFrame("Registro de Visitantes");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 300);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        etiquetaNombre = new JLabel("Nombre:");
        campoNombre = new JTextField();
        etiquetaApellido = new JLabel("Apellido:");
        campoApellido = new JTextField();
        etiquetaEdad = new JLabel("Edad:");
        campoEdad = new JTextField();
        btnAgregar = new JButton("Agregar");
        tabla = new JTable();

        panel.add(etiquetaNombre);
        panel.add(campoNombre);
        panel.add(etiquetaApellido);
        panel.add(campoApellido);
        panel.add(etiquetaEdad);
        panel.add(campoEdad);
        panel.add(btnAgregar);

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Edad");
        tabla.setModel(modeloTabla);

        ventana.getContentPane().add(BorderLayout.NORTH, panel);
        ventana.getContentPane().add(BorderLayout.CENTER, new JScrollPane(tabla));

        // Mostrar ventana
        ventana.setVisible(true);
    }
    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JTextField getCampoApellido() {
        return campoApellido;
    }

    public JTextField getCampoEdad() {
        return campoEdad;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }
    public void actualizarTabla(ArrayList<Visitante> visitantes) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.setRowCount(0); 

        for (Visitante visitante : visitantes) {
            modeloTabla.addRow(new Object[]{visitante.getNombre(), visitante.getApellido(), visitante.getEdad()});
        }
    }
}