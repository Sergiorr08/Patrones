package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.RegistroVisitantes;
import Modelo.Visitante;
import Vista.InterfazGrafica;

public class Controlador {
    private RegistroVisitantes modelo;
    private InterfazGrafica vista;

    public Controlador(RegistroVisitantes modelo, InterfazGrafica vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.getBtnAgregar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarVisitante();
                vista.getCampoApellido().setText("");
                vista.getCampoNombre().setText("");
                vista.getCampoEdad().setText("");
            }
        });
        this.vista.getBtnLimpiar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                limpiar();
            }
        });
    }

    public void agregarVisitante() {
        String nombre = vista.getCampoNombre().getText();
        String apellido = vista.getCampoApellido().getText();
        int edad = Integer.parseInt(vista.getCampoEdad().getText());

        Visitante nuevoVisitante = new Visitante(nombre, apellido, edad);

        modelo.agregarVisitante(nuevoVisitante);

        vista.actualizarTabla(modelo.getVisitantes());
    }

    public void limpiar(){
        modelo.eliminarVisitantes();
        vista.actualizarTabla(modelo.getVisitantes());
    }
}
