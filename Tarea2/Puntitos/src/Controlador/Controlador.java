package Controlador;

import java.awt.List;
import java.util.ArrayList;

import Modelo.Calculito;
import Modelo.Punto;
import Vista.Vista;

public class Controlador {
    private Calculito modelo;
    private Vista vista;
  
    public Controlador(Calculito modelo, Vista vista) {
      this.modelo = modelo;
      this.vista = vista;
  
      // ...
    }
  
    public void generarPuntosAleatorios() {
      // ...
  
      for (int i = 0; i < 100; i++) {
        int x = (int) (Math.random() * vista.getWidth());
        int y = (int) (Math.random() * vista.getHeight());
  
        modelo.agregarPunto(new Punto(x, y));
      }
  
      // ...
  
      vista.mostrarPuntos(modelo.getPuntos());
    }
}
