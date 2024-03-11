import java.util.Scanner;

import BMW.BMWFactory;
import MERCEDES.MecedesFactory;
import model.AbstractFactory;
import model.Chasis;
import model.Motor;

public class App {
    public static void main(String[] args) throws Exception {
        AbstractFactory factory = null;
        Scanner sc = new Scanner(System.in);
        String k = sc.next();

        if(k.equals("b")){
            factory = new BMWFactory();
        }else{
            factory = new MecedesFactory();
        }
        

        Motor m = factory.getMotor();
        Chasis ch = factory.getChasis();

        System.out.println(m.getData());
        System.out.println(ch.getMarca());

        sc.close();
    }
}
