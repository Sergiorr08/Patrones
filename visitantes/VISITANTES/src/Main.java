import Modelo.RegistroVisitantes;
import Vista.InterfazGrafica;
import Controlador.Controlador;

public class Main {
    public static void main(String[] args) {
        // Crear instancia del modelo
        RegistroVisitantes modelo = new RegistroVisitantes();

        // Crear instancia de la vista
        InterfazGrafica vista = new InterfazGrafica();

        // Crear instancia del controlador y pasarle el modelo y la vista
        Controlador controlador = new Controlador(modelo, vista);
    }
}
