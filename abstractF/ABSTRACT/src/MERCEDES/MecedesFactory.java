package MERCEDES;

import model.AbstractFactory;
import model.Chasis;
import model.Motor;

public class MecedesFactory implements AbstractFactory {
    @Override
    public Chasis getChasis() {
        return new MercedesChasis();
    }

    @Override
    public Motor getMotor() {
        return new MercedesMotor();
    }
}
