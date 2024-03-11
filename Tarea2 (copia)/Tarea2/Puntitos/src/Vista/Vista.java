package Vista;

import javax.swing.*;
import Controlador.Controlador;

public class Vista extends JFrame {

    private Mipanel panel;
    private Controlador controlador;

    public Vista() {
        panel = new Mipanel();
        
        this.setSize(500, 500);
        panel.setVisible(true);
        panel.setSize(400, 400);

        panel.setVisible(true);

        this.add(panel);

        this.setVisible(true);
        
    }

}
