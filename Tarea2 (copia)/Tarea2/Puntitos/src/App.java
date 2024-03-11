import Controlador.Controlador;
import Modelo.Calculito;
import Vista.Vista;

public class App {
    public static void main(String[] args) throws Exception {
        Calculito modelo = new Calculito(); 
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        controlador.generarVerticesTriangulo(); 
        controlador.generarPuntoAleatorio();
        for(int i =0; i<1000000000; i++){
            controlador.generar_puntos_intermedios();
        }
        
        vista.setVisible(true); 
    }
}
