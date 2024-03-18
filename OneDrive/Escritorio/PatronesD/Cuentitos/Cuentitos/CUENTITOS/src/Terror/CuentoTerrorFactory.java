package Terror;

import model.AbstractFactory;
import model.Cuento;

public class CuentoTerrorFactory implements AbstractFactory {

    @Override
    public Cuento getCuento() {
        return new CuentoTerror();
    }
    
}
