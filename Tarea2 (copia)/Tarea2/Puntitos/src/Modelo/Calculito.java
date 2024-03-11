package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Calculito {
    private List<Punto> puntos;

    public Calculito() {
        puntos = new ArrayList<>();
    }

    public void agregarPunto(Punto punto) {
        puntos.add(punto);
    }

    public void limpiarPuntos() {
        puntos.clear();
    }

    public List<Punto> getPuntos() {
        return puntos;
    }

    public  int calcularDistancia(Punto p1, Punto p2) {
        return (int) Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}
