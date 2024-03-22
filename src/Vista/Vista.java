package Vista;

import Controlador.Controlador;
import Modelo.Usuario.InformacionUsuario;

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
        setLayout(new BorderLayout());

        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridLayout(6, 2, 5, 10));

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

        JPanel botonMensajePanel = new JPanel();
        botonMensajePanel.setLayout(new BorderLayout());

        JButton perfilesButton = new JButton("Ver Perfiles");
        perfilesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaPerfiles();
            }
        });

        mensajeArea = new JTextArea();
        mensajeArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(mensajeArea);

        formularioPanel.add(nombreLabel);
        formularioPanel.add(nombreField);
        formularioPanel.add(edadLabel);
        formularioPanel.add(edadField);
        formularioPanel.add(ingresoLabel);
        formularioPanel.add(ingresoField);
        formularioPanel.add(familiaresLabel);
        formularioPanel.add(familiaresField);
        formularioPanel.add(emprendimientoLabel);
        formularioPanel.add(emprendimientoCheckBox);
        formularioPanel.add(inversionLabel);
        formularioPanel.add(inversionField);

        botonMensajePanel.add(crearUsuarioButton, BorderLayout.WEST);
        botonMensajePanel.add(perfilesButton, BorderLayout.CENTER);
        botonMensajePanel.add(scrollPane, BorderLayout.SOUTH);

        add(formularioPanel, BorderLayout.CENTER);
        add(botonMensajePanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    private void crearUsuario() {
        String nombre = nombreField.getText();
        int edad = Integer.parseInt(edadField.getText());
        double ingreso = Double.parseDouble(ingresoField.getText().replaceAll("[^\\d.]", ""));
        int familiaresQueGananDinero = Integer.parseInt(familiaresField.getText());
        boolean tieneEmprendimiento = emprendimientoCheckBox.isSelected();
        double cantidadInversion = Double.parseDouble(inversionField.getText().replaceAll("[^\\d.]", ""));

        InformacionUsuario infoUsuario = new InformacionUsuario(nombre, edad, ingreso, familiaresQueGananDinero, tieneEmprendimiento, cantidadInversion);

        String tipoUsuario = controlador.obtenerTipoUsuario(infoUsuario);

        if (tipoUsuario != null) {
            controlador.crearUsuario(tipoUsuario, nombre, infoUsuario);
            mostrarMensaje("Usuario creado exitosamente - Plan: " + tipoUsuario);
        } else {
            mostrarMensaje("El usuario no cumple con los requisitos de ningún plan.");
        }
    }

    private void mostrarVentanaPerfiles() {
        InformacionUsuario infoUsuario = obtenerInformacionUsuario();
        PerfilesFrame perfilesFrame = new PerfilesFrame(controlador, infoUsuario);
        perfilesFrame.setVisible(true);
    }

    private InformacionUsuario obtenerInformacionUsuario() {
        String nombre = nombreField.getText();
        int edad = Integer.parseInt(edadField.getText());
        double ingreso = Double.parseDouble(ingresoField.getText().replaceAll("[^\\d.]", ""));
        int familiaresQueGananDinero = Integer.parseInt(familiaresField.getText());
        boolean tieneEmprendimiento = emprendimientoCheckBox.isSelected();
        double cantidadInversion = Double.parseDouble(inversionField.getText().replaceAll("[^\\d.]", ""));

        return new InformacionUsuario(nombre, edad, ingreso, familiaresQueGananDinero, tieneEmprendimiento, cantidadInversion);
    }
    public void mostrarMensaje(String mensaje) {
        mensajeArea.append(mensaje + "\n");
    }
}