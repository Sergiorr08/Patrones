package BMW;

import model.AbstractFactory;
import model.Chasis;
import model.Motor;

public class BMWFactory implements AbstractFactory {

    @Override
    public Chasis getChasis() {
       return new BMWChasis();
    }

    @Override
    public Motor getMotor() {
       return new BMWMotor();
    }
    
}
