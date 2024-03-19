package Vista;

import Controlador.Controlador;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vista {
    private Controlador controlador;
    private Scanner scanner;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido al sistema de gestión de usuarios bancarios");
        System.out.println("1. Crear usuario");
        System.out.println("2. Salir");
    }

    public void ejecutar() {
        int opcion;
        Map<Integer, Runnable> acciones = new HashMap<>();
        acciones.put(1, this::crearUsuario);
        acciones.put(2, () -> System.out.println("Saliendo del programa..."));

        do {
            mostrarMenu();
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            Runnable accion = acciones.getOrDefault(opcion, () -> System.out.println("Opción no válida. Intente nuevamente."));
            accion.run();
        } while (opcion != 2);
    }

    public void crearUsuario() {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
    
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
    
        System.out.print("Ingrese su ingreso mensual (en pesos): ");
        double ingreso = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner
    
        System.out.print("Ingrese el número de familiares que ganan dinero: ");
        int familiaresQueGananDinero = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
    
        System.out.print("¿Tiene un pequeño emprendimiento? (Sí/No): ");
        boolean tieneEmprendimiento = scanner.nextLine().equalsIgnoreCase("Sí");
    
        System.out.print("¿Cuánto dinero desea invertir? (en pesos): ");
        double cantidadInversion = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner
    
        // Obtener el tipo de usuario del controlador
        String tipoUsuario = controlador.obtenerTipoUsuario(nombre, edad, ingreso, familiaresQueGananDinero, tieneEmprendimiento, cantidadInversion);
    
        // Si se determina un tipo de usuario válido, crear el usuario en el controlador
        if (tipoUsuario != null) {
            controlador.crearUsuario(tipoUsuario, nombre);
            
            // Mostrar los planes disponibles y elegir uno
            String planElegido = elegirPlanDisponible(tipoUsuario);
            System.out.println("Plan seleccionado: " + planElegido);
        } else {
            mostrarMensaje("El usuario no cumple con los requisitos de ningún plan.");
        }
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String elegirPlanDisponible(String tipoUsuario) {
        // Mostrar los planes disponibles al usuario
        System.out.println("Seleccione uno de los siguientes planes disponibles:");
        Map<Integer, String> planesDisponibles = new HashMap<>();
        planesDisponibles.put(1, "Estudiante");
        planesDisponibles.put(2, "Básica");
        planesDisponibles.put(3, "Black");
        planesDisponibles.put(4, "Golden");
        planesDisponibles.put(5, "Familiar");
        planesDisponibles.put(6, "Huesito");
        planesDisponibles.put(7, "Chamba");
    
        planesDisponibles.forEach((key, value) -> System.out.println(key + ". " + value));
    
        // Solicitar al usuario que elija un plan
        int opcion;
        do {
            System.out.print("Ingrese el número correspondiente al plan deseado: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
    
            if (!planesDisponibles.containsKey(opcion)) {
                System.out.println("Opción inválida. Intente nuevamente.");
                continue;
            }
    
            String planElegido = planesDisponibles.get(opcion);
    
            // Validar si el usuario cumple los requisitos para seleccionar este plan
            if (!planElegido.equals(tipoUsuario)) {
                System.out.println("Lo siento, no cumple los requisitos para seleccionar este plan.");
                continue;
            }
    
            System.out.println("Se adquirió de forma satisfactoria el plan: " + planElegido);
    
            // Devolver el tipo de usuario seleccionado
            return planElegido;
    
        } while (true);
    }
}