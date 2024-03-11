package model.perro;

import model.AbstractFactory;
import model.Imagen;

public class PerroFactory implements AbstractFactory{

    @Override
    public Imagen getData() {
       return new ImagenPerro();
    }
    
}
