package model.HannaMontana;

import model.AbstractFactory;
import model.Imagen;
import model.Texto;

public class HmFactory implements AbstractFactory {
    @Override
    public Texto getTexto() {
        return new Textohm();
    }

    @Override
    public Imagen getImagen() {
        return new ImagenHm();
    }
}

