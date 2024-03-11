package Vista;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import Controlador.Controlador;
import Modelo.Punto;

public class Mipanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

List<Punto> puntosParaDibujar = new ArrayList<>(Controlador.obtenerLista());
for (Punto punto : puntosParaDibujar) {
    g.fillOval(punto.getX(), punto.getY(), 10, 10);
}

    }
}
