package miprograma;

import javax.swing.JButton;
import javax.swing.JFrame;

import miprograma.view.Myframe;

public class Main {
    public static void main(String[] args) {
        Myframe miVentana = new Myframe();
        JButton myButton = new JButton("soy un boton");

        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.add(myButton);

        myButton.setBounds(20, 20, 160, 90);

    }
}
