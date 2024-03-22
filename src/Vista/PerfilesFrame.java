package Vista;

import Controlador.Controlador;
import Modelo.Usuario.InformacionUsuario;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class PerfilesFrame extends JFrame {
    private Controlador controlador;
    private JTextArea perfilesTextArea;
    private InformacionUsuario infoUsuario;

    public PerfilesFrame(Controlador controlador, InformacionUsuario infoUsuario) {
        this.controlador = controlador;
        this.infoUsuario = infoUsuario;
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
        setLocationRelativeTo(null);
    }

    private void actualizarPerfiles() {
        perfilesTextArea.setText("");
        perfilesTextArea.append("Perfiles Disponibles:\n");
        String[] perfiles = controlador.obtenerPerfiles(infoUsuario);
        Arrays.stream(perfiles).forEach(perfil -> perfilesTextArea.append(perfil + "\n"));
    }
}