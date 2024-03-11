package Vista;

import javax.swing.*;

import Controlador.Controlador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import Modelo.Calculito;
import Modelo.Punto;

public class Vista extends JPanel {

   

  private Controlador controlador;

  public Vista(Controlador controlador) {
    this.controlador = controlador;

    // ...

    // Agregar un botón para generar puntos aleatorios
    JButton generarPuntosButton = new JButton("Generar puntos");
    generarPuntosButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        controlador.generarPuntosAleatorios();
      }
    });
    add(generarPuntosButton);

    // ...
  }

  public void mostrarPuntos(List<Punto> puntos) {
    // ...

    for (Punto punto : puntos) {
      // Dibujar el punto
      // Ejemplo: usando Graphics2D
      Graphics2D g2 = (Graphics2D) getGraphics();
      g2.fillOval(punto.getX(), punto.getY(), 1, 1);
    }

    // ...
  }
}


