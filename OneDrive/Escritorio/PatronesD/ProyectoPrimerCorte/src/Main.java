import Controlador.Controlador;
import Vista.Vista;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista(new Controlador(new Vista(null)));
        vista.ejecutar();
    }
}
