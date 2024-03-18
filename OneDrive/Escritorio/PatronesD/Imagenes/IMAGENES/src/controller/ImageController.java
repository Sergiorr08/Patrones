package controller;

import java.awt.image.BufferedImage;



import model.AbstractFactory;
import model.Imagen;
import model.carro.CarroFactory;
import model.casa.CasaFactory;
import model.perro.PerroFactory;
import view.ImageView;

public class ImageController {
    private ImageView vista;
    private AbstractFactory factory;
    private BufferedImage i;

    public ImageController(){
        this.vista = new ImageView(this);
    }

    public void cargarImagen(String string) {
       if(string.equals("perro")){
        factory = new PerroFactory();
       }else if (string.equals("casa")) {
        factory = new CasaFactory();
       }else{
        factory = new CarroFactory();
       }

       Imagen imagen = factory.getData();
       i = imagen.getImagen();
    }


    public void mostrarImagen() {
        vista.mostrarImagen(i);
    }

    public ImageView getVista() {
        return vista;
    }

}
