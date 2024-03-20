package Vista;

import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JFrame {
    private Controlador controlador;
    private JTextField nombreField, edadField, ingresoField, familiaresField, inversionField;
    private JCheckBox emprendimientoCheckBox;
    private JTextArea mensajeArea;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Usuarios Bancarios");
        setLayout(new GridLayout(7, 2, 5, 5));

        // Crear componentes
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();

        JLabel edadLabel = new JLabel("Edad:");
        edadField = new JTextField();

        JLabel ingresoLabel = new JLabel("Ingreso Mensual (en pesos):");
        ingresoField = new JTextField();

        JLabel familiaresLabel = new JLabel("Familiares que ganan dinero:");
        familiaresField = new JTextField();

        JLabel emprendimientoLabel = new JLabel("¿Tiene un pequeño emprendimiento?");
        emprendimientoCheckBox = new JCheckBox();

        JLabel inversionLabel = new JLabel("Cantidad de Inversión (en pesos):");
        inversionField = new JTextField();

        JButton crearUsuarioButton = new JButton("Crear Usuario");
        crearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearUsuario();
            }
        });

        mensajeArea = new JTextArea();
        mensajeArea.setEditable(false);

        // Agregar componentes al panel
        add(nombreLabel);
        add(nombreField);
        add(edadLabel);
        add(edadField);
        add(ingresoLabel);
        add(ingresoField);
        add(familiaresLabel);
        add(familiaresField);
        add(emprendimientoLabel);
        add(emprendimientoCheckBox);
        add(inversionLabel);
        add(inversionField);
        add(crearUsuarioButton);
        add(mensajeArea);
        JButton perfilesButton = new JButton("Ver Perfiles");
        perfilesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaPerfiles();
            }
        });
        add(perfilesButton);

        pack();
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
    }

    private void crearUsuario() {
        String nombre = nombreField.getText();
        int edad = Integer.parseInt(edadField.getText());
        String ingresoText = ingresoField.getText().replaceAll(",", "").replaceAll("(?!\\d)\\.", ""); // Eliminar comas y puntos que no separan decimales
        double ingreso = Double.parseDouble(ingresoText);
        int familiaresQueGananDinero = Integer.parseInt(familiaresField.getText());
        boolean tieneEmprendimiento = emprendimientoCheckBox.isSelected();
        String inversionText = inversionField.getText().replaceAll(",", "").replaceAll("(?!\\d)\\.", ""); // Eliminar comas y puntos que no separan decimales
        double cantidadInversion = Double.parseDouble(inversionText);

        // Obtener el tipo de usuario del controlador
        String tipoUsuario = controlador.obtenerTipoUsuario(nombre, edad, ingreso, familiaresQueGananDinero, tieneEmprendimiento, cantidadInversion);

        // Si se determina un tipo de usuario válido, crear el usuario en el controlador
        if (tipoUsuario != null) {
            controlador.crearUsuario(tipoUsuario, nombre);
            mostrarMensaje("Usuario creado exitosamente - Plan: " + tipoUsuario);
        } else {
            mostrarMensaje("El usuario no cumple con los requisitos de ningún plan.");
        }
    }
    private void mostrarVentanaPerfiles() {
        PerfilesFrame perfilesFrame = new PerfilesFrame(controlador);
        perfilesFrame.setVisible(true);
    }

    public void mostrarMensaje(String mensaje) {
        mensajeArea.setText(mensajeArea.getText() + "\n" + mensaje);
    }

    public void ejecutar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejecutar'");
    }

    public void mostrarVentana() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarVentana'");
    }

    public void setControlador(Controlador controlador2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setControlador'");
    }

}