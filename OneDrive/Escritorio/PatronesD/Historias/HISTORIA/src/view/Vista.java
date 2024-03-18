package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Vista extends JFrame {

    private JLabel imagenLabel1;
    private JLabel imagenLabel2;
    private JLabel imagenLabel3;
    private JTextArea textoArea;
    private JButton dcButton;
    private JButton marvelButton;
    private JButton hannaMontanaButton;

    public Vista() {
        setTitle("Historias");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400); // Ajuste el tamaño de la ventana para que se vea mejor

        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Panel de imágenes
        JPanel imagenPanel = new JPanel();
        imagenPanel.setLayout(new BoxLayout(imagenPanel, BoxLayout.Y_AXIS));

        // Centrar las imágenes
        imagenPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        imagenLabel1 = new JLabel();
        imagenLabel2 = new JLabel();
        imagenLabel3 = new JLabel();

        // Centrar cada imagen individualmente
        imagenLabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
        imagenLabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
        imagenLabel3.setAlignmentX(Component.CENTER_ALIGNMENT);

        imagenPanel.add(imagenLabel1);
        imagenPanel.add(imagenLabel2);
        imagenPanel.add(imagenLabel3);

        // Panel de texto
        JPanel textoPanel = new JPanel();
        textoPanel.setLayout(new GridLayout(1, 1));
        textoArea = new JTextArea();
        textoArea.setEditable(false);
        textoPanel.add(new JScrollPane(textoArea)); // Agregue un JScrollPane para desplazarse si el texto es largo

        // Panel de botones
        JPanel buttonPanel = new JPanel();
        dcButton = new JButton("DC");
        marvelButton = new JButton("Marvel");
        hannaMontanaButton = new JButton("Hanna Montana");
        buttonPanel.add(dcButton);
        buttonPanel.add(marvelButton);
        buttonPanel.add(hannaMontanaButton);

        // Centrar los botones
        dcButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        marvelButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        hannaMontanaButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainPanel.add(imagenPanel, BorderLayout.WEST);
        mainPanel.add(textoPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Centrar el panel principal en la ventana
        mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.setAlignmentY(Component.CENTER_ALIGNMENT);

        add(mainPanel);
    }

    public void setImagen1Icon(ImageIcon icon) {
        imagenLabel1.setIcon(icon);
    }

    public void setImagen2Icon(ImageIcon icon) {
        imagenLabel2.setIcon(icon);
    }

    public void setImagen3Icon(ImageIcon icon) {
        imagenLabel3.setIcon(icon);
    }

    public void setTexto(String texto) {
        textoArea.setText(texto);
    }

    public void addDCButtonListener(ActionListener listener) {
        dcButton.addActionListener(listener);
    }

    public void addMarvelButtonListener(ActionListener listener) {
        marvelButton.addActionListener(listener);
    }

    public void addHannaMontanaButtonListener(ActionListener listener) {
        hannaMontanaButton.addActionListener(listener);
    }
}