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
  
    public List<Punto> getPuntos() {
      return puntos;
    }
}
