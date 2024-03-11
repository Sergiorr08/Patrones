import javax.swing.JFrame;

import controller.ImageController;

public class App {
    public static void main(String[] args) throws Exception {

        ImageController controlador = new ImageController();
        JFrame frame = new JFrame("Ejemplo MVC con Botones y Abstract Factory");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(controlador.getVista());
        frame.setSize(800, 1200);
        frame.setVisible(true);
    }
   }

