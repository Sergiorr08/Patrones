package Comedia;

import model.AbstractFactory;
import model.Cuento;

public class CuentoComediaFactory implements AbstractFactory{

    @Override
    public Cuento getCuento() {
       return new CuentoComedia();
    }
    
}
