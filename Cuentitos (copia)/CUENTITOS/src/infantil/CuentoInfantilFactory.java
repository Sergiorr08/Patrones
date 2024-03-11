package infantil;

import model.AbstractFactory;
import model.Cuento;

public class CuentoInfantilFactory implements AbstractFactory {
    @Override
    public Cuento getCuento() {
        return new CuentoInfantil();
    }
}
