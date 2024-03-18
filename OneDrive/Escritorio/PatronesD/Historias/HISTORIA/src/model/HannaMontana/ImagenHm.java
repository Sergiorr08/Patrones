package model.HannaMontana;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import model.Imagen;

public class ImagenHm implements Imagen {

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
            imagen = ImageIO.read(new File("C:\\Users\\Labing\\Downloads\\Historias\\imagenes\\historia dc 1.jpg"));
            imagen = resize(imagen, 200, 200); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Imagen 1 cargada: " + (imagen != null)); // Agrega esta línea para depurar
        return imagen;
    }

    @Override
    public BufferedImage getImagen2() {
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("C:\\Users\\Labing\\Downloads\\Historias\\imagenes\\dc historia 2.webp"));
            imagen = resize(imagen, 200, 200); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Imagen 2 cargada: " + (imagen != null)); // Agrega esta línea para depurar
        return imagen;
    }

    @Override
    public BufferedImage getImagen3() {
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("C:\\Users\\Labing\\Downloads\\Historias\\imagenes\\historia dc3.png"));
            imagen = resize(imagen, 200, 200); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Imagen 3 cargada: " + (imagen != null)); // Agrega esta línea para depurar
        return imagen;
    }
}
