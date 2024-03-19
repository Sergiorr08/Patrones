package Controlador;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import Modelo.UserManager;
import Modelo.UsuarioFactory;
import Modelo.Usuario.Usuario;
import Vista.Vista;

public class Controlador {
    private Vista vista;
    private UserManager userManager;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.userManager = UserManager.getInstance();
    }

    public String obtenerTipoUsuario(String nombre, int edad, double ingresoMensual, int familiaresQueGananDinero, boolean tieneEmprendimiento, double cantidadInversion) {
        // Determinar el tipo de usuario según los requisitos
        return determinarTipoUsuario(edad, ingresoMensual, familiaresQueGananDinero, tieneEmprendimiento, cantidadInversion);
    }

    public void crearUsuario(String tipoUsuario, String nombre) {
        UsuarioFactory factory = UsuarioFactory.createFactory(tipoUsuario);
        if (factory != null) {
            Usuario nuevoUsuario = factory.createUsuario();
            userManager.agregarUsuario(nuevoUsuario);
            vista.mostrarMensaje("Usuario creado exitosamente: " + nuevoUsuario.getNombre() + " - Plan: " + tipoUsuario);
        } else {
            vista.mostrarMensaje("Tipo de usuario no válido: " + tipoUsuario);
        }
    }

    // Método para determinar el tipo de usuario según los requisitos utilizando HashMap
    private String determinarTipoUsuario(int edad, double ingresoMensual, int familiaresQueGananDinero, boolean tieneEmprendimiento, double cantidadInversion) {
        // Crear un mapa de requisitos para cada tipo de usuario
        Map<String, Predicate<Usuario>> requisitosMap = new HashMap<>();
        requisitosMap.put("Estudiante", usuario -> usuario.getPerfil().equals("Estudiante"));
        requisitosMap.put("Basica", usuario -> ingresoMensual >= 1000000 && ingresoMensual < 2000000);
        requisitosMap.put("Black", usuario -> ingresoMensual >= 2000000 && ingresoMensual < 5000000);
        requisitosMap.put("Golden", usuario -> ingresoMensual >= 5000000);
        requisitosMap.put("Familiar", usuario -> familiaresQueGananDinero >= 2 && ingresoMensual >= 1000000);
        requisitosMap.put("Huesito", usuario -> usuario.getEdad() >= 65);
        requisitosMap.put("Chamba", usuario -> tieneEmprendimiento);

        // Iterar sobre el mapa y verificar si se cumplen los requisitos para cada tipo de usuario
        for (Map.Entry<String, Predicate<Usuario>> entry : requisitosMap.entrySet()) {
            String tipoUsuario = entry.getKey();
            Predicate<Usuario> requisitos = entry.getValue();
            if (requisitos.test(new Usuario("Dummy", tipoUsuario, 0, edad))) {
                return tipoUsuario;
            }
        }

        return null;
    }
}