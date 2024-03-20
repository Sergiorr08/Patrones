import Controlador.Controlador;
import Vista.Vista;

public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador(null);
        Vista vista = new Vista(controlador);
        vista.setVisible(true);
    }
}

