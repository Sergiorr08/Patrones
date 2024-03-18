package model.carro;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.Imagen;

public class ImagenCarro implements Imagen{
    @Override
    public BufferedImage getImagen() {
                BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("IMAGENES/src/res/carro.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return imagen;
    }
}
