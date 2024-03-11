import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Comedia.CuentoComediaFactory;
import Terror.CuentoTerrorFactory;
import infantil.CuentoInfantilFactory;
import model.AbstractFactory;
import model.Cuento;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        Map<String, AbstractFactory> fabricasCuentos = new HashMap<>();
        fabricasCuentos.put("1", new CuentoComediaFactory());
        fabricasCuentos.put("2", new CuentoInfantilFactory());
        fabricasCuentos.put("3", new CuentoTerrorFactory());

        do {
            System.out.println("Selecciona un tipo de cuento:");
            System.out.println("1. Comedia");
            System.out.println("2. Infantil");
            System.out.println("3. Terror");
            System.out.println("0. Salir");
            System.out.print("Ingresa tu elección: ");

            opcion = sc.next();
            AbstractFactory factory = fabricasCuentos.get(opcion);

            if (factory != null) {
                Cuento cuento = factory.getCuento();
                System.out.println("Aquí está tu cuento:");
                System.out.println(cuento.getCuento());
            } else if (!"0".equals(opcion)) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (!"0".equals(opcion));

        System.out.println("Saliendo del programa. ¡Hasta luego!");
        sc.close();
    }
}