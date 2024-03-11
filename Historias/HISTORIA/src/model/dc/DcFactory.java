package model.dc;

import model.AbstractFactory;
import model.Imagen;
import model.Texto;

public class DcFactory implements AbstractFactory {
    @Override
    public Texto getTexto() {
        return new TextoDc();
    }

    @Override
    public Imagen getImagen() {
        return new ImagenDc();
    }
}
