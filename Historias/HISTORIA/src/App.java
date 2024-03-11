import controller.Controlador;
import model.AbstractFactory;
import model.dc.DcFactory;
import model.marvel.MarvelFactory;
import model.HannaMontana.HmFactory;
import view.Vista;

public class App {
    public static void main(String[] args) {
        Vista vista = new Vista();

        // Instanciar fábricas
        AbstractFactory dcFactory = new DcFactory();
        AbstractFactory marvelFactory = new MarvelFactory();
        AbstractFactory hannaMontanaFactory = new HmFactory();

        // Crear controlador con las fábricas correspondientes
        Controlador controlador = new Controlador(vista, dcFactory, marvelFactory, hannaMontanaFactory);

        vista.setVisible(true);
    }
}
