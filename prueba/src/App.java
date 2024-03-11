import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        int numerito = 0;
        Random rand = new Random();

        numerito = rand.nextInt(11)+1;

        felina nn = new felina();
        
        if (numerito < 5) {
            nn = new gato();
        }else{
            nn = new puma();
        }

        nn.hacer_sonido();
       
    }
}
