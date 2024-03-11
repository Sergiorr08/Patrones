import Controlador.Controlador;
import Modelo.Calculito;
import Vista.Vista;

public class App {
    public static void main(String[] args) throws Exception {
        Calculito modelo = new Calculito();
        Controlador controlador = new Controlador(modelo, null);
        Vista vista = new Vista(controlador);

        // ...

        vista.setVisible(true);

    }
}