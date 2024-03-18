package model.marvel;

import model.AbstractFactory;
import model.Imagen;
import model.Texto;

public class MarvelFactory implements AbstractFactory {
    @Override
    public Texto getTexto() {
        return new TextoMarvel();
    }

    @Override
    public Imagen getImagen() {
        return new ImagenMarvel();
    }
}
