package model.casa;

import model.AbstractFactory;
import model.Imagen;

public class CasaFactory implements AbstractFactory{

    @Override
    public Imagen getData() {
        return new ImagenCasa();
    }
    
}
