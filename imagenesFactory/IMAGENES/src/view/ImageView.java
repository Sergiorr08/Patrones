package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ImageController;

public class ImageView  extends JPanel{
    private JButton perroBoton;
    private JButton carroBoton;
    private JButton casaBoton;
    private JLabel imagenLabel;
    private ImageController controller;

    public ImageView(ImageController controller){
        this.controller = controller;
        initializeUI();
    }

    private void initializeUI() {
        perroBoton = new JButton("Mostrar Perro");
        carroBoton = new JButton("Mostrar Carro");
        casaBoton = new JButton("Mostrar Casa");
        imagenLabel = new JLabel();

        perroBoton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.cargarImagen("perro");
                controller.mostrarImagen();
            }
            
        });

        carroBoton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.cargarImagen("carro");
                controller.mostrarImagen();
            }
            
        });

        casaBoton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                controller.cargarImagen("casa");
                controller.mostrarImagen();
            }
            
        });

        add(carroBoton);
        add(casaBoton);
        add(perroBoton);
        add(imagenLabel);
    }

    public void mostrarImagen(BufferedImage imagen) {
        imagenLabel.setIcon(new ImageIcon(imagen));
    }

    
}
