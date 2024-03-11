package model.carro;

import model.AbstractFactory;
import model.Imagen;

public class CarroFactory implements AbstractFactory {

    @Override
    public Imagen getData() {
        return new ImagenCarro();
    }
    
}
