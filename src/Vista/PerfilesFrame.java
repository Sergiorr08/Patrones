package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerfilesFrame extends JFrame {
    private Controlador controlador;
    private JTextArea perfilesTextArea;

    public PerfilesFrame(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

    private void initComponents() {
        setTitle("Selección de Perfiles");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        perfilesTextArea = new JTextArea();
        perfilesTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(perfilesTextArea);
        add(scrollPane, BorderLayout.CENTER);

        actualizarPerfiles();
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    private void actualizarPerfiles() {
        perfilesTextArea.setText("");
        perfilesTextArea.append("Perfiles Disponibles:\n");
        // Agregar aquí la lógica para obtener y mostrar los perfiles disponibles
    }
}
