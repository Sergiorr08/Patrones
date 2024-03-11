package Controlador;

import java.util.List;
import java.util.Random;

import Modelo.Calculito;
import Modelo.Punto;
import Vista.Vista;

public class Controlador {
    private static Calculito modelo;
    private Vista vista;

    public Controlador(Calculito modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public static List<Punto> obtenerLista(){
        return modelo.getPuntos();
    }

    public void generarPuntoAleatorio() {
        int x = (int) (Math.random() * vista.getWidth());
        int y = (int) (Math.random() * vista.getHeight());
    
        modelo.agregarPunto(new Punto(x, y));
        vista.repaint();
    }

    public void generarVerticesTriangulo() {
        int width = vista.getWidth();
        int height = vista.getHeight();

        modelo.limpiarPuntos();

        modelo.agregarPunto(new Punto(0, height-100)); 
        modelo.agregarPunto(new Punto((width / 2)-20, 0)); 
        modelo.agregarPunto(new Punto(width-70, height-100)); 

        vista.repaint();
    }

    public void generar_puntos_intermedios(){
        List<Punto> puntos = obtenerLista();
        int i = puntos.size()-1;
        Random random = new Random();
        Punto puntoInicial = puntos.get(random.nextInt(3));
        Punto puntoFinal = puntos.get(i);
        modelo.agregarPunto(new Punto((int)(puntoInicial.getX()+puntoFinal.getX())/2, (puntoInicial.getY()+puntoFinal.getY())/2)); 
    }
}

