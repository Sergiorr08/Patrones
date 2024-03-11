package model.perro;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Imagen;

public class ImagenPerro implements Imagen {

    @Override
    public BufferedImage getImagen() {
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("IMAGENES/src/res/CaraPerro.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagen;
    }

}
