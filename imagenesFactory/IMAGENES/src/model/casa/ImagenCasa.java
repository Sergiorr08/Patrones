package model.casa;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Imagen;

public class ImagenCasa implements Imagen{
    @Override
    public BufferedImage getImagen() {
                BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("IMAGENES/src/res/casa.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagen;
    }
}
