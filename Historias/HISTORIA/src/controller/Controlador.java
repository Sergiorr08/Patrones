package controller;

import model.AbstractFactory;
import model.Imagen;
import model.Texto;
import view.Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

    private Vista vista;
    private AbstractFactory dcFactory;
    private AbstractFactory marvelFactory;
    private AbstractFactory hannaMontanaFactory;

    public Controlador(Vista vista, AbstractFactory dcFactory, AbstractFactory marvelFactory, AbstractFactory hannaMontanaFactory) {
        this.vista = vista;
        this.dcFactory = dcFactory;
        this.marvelFactory = marvelFactory;
        this.hannaMontanaFactory = hannaMontanaFactory;

        // Agregar listeners a los botones
        vista.addDCButtonListener(new DCButtonListener());
        vista.addMarvelButtonListener(new MarvelButtonListener());
        vista.addHannaMontanaButtonListener(new HannaMontanaButtonListener());
    }

    class DCButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mostrarHistoria(dcFactory);
        }
    }

    class MarvelButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mostrarHistoria(marvelFactory);
        }
    }

    class HannaMontanaButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mostrarHistoria(hannaMontanaFactory);
        }
    }

    private void mostrarHistoria(AbstractFactory factory) {
        Imagen imagen = factory.getImagen();
        vista.setImagen1Icon(new ImageIcon(imagen.getImagen1()));
        vista.setImagen2Icon(new ImageIcon(imagen.getImagen2()));
        vista.setImagen3Icon(new ImageIcon(imagen.getImagen3()));
        Texto texto = factory.getTexto();
        vista.setTexto(texto.getTexto());
    }
}
