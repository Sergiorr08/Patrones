package model.marvel;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import model.Imagen;

public class ImagenMarvel implements Imagen {

    private BufferedImage resize(BufferedImage img, int newWidth, int newHeight) {
        BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resizedImage.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0, newWidth, newHeight, null);
        g.dispose();
        return resizedImage;
    }
    
    @Override
    public BufferedImage getImagen1() {
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("C:\\Users\\Labing\\Downloads\\Historias\\imagenes\\tchouameni1.jpg"));
            imagen = resize(imagen, 200, 200); // Redimensiona a un tamaño de 200x200
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagen;
    }

    @Override
    public BufferedImage getImagen2() {
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("C:\\Users\\Labing\\Downloads\\Historias\\imagenes\\negro morales.jpg"));
            imagen = resize(imagen, 200, 200); // Redimensiona a un tamaño de 200x200
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagen;
    }

    @Override
    public BufferedImage getImagen3() {
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("C:\\Users\\Labing\\Downloads\\Historias\\imagenes\\historia marvel 1.jpg"));
            imagen = resize(imagen, 200, 200); // Redimensiona a un tamaño de 200x200
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagen;
    }
}
