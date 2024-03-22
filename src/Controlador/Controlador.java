package Controlador;

import Modelo.Usuario.InformacionUsuario;
import Modelo.UserManager;
import Modelo.UsuarioFactory;
import Modelo.Usuario.Usuario;
import Vista.Vista;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class Controlador {
    private Vista vista;
    private UserManager userManager;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.userManager = UserManager.getInstance();
    }

    public Map<String, Predicate<Usuario>> obtenerTipoUsuario(InformacionUsuario infoUsuario) {
        return determinarTipoUsuario(infoUsuario.getEdad(), infoUsuario.getIngresoMensual(), infoUsuario.getFamiliaresQueGananDinero(), infoUsuario.isTieneEmprendimiento(), infoUsuario.getCantidadInversion());
    }

    public void crearUsuario(String tipoUsuario, String nombre, InformacionUsuario infoUsuario) {
    Map<String, Predicate<Usuario>> requisitosMap = obtenerTipoUsuario(infoUsuario);
    Predicate<Usuario> requisitos = requisitosMap.get(tipoUsuario);
    
    if (requisitos != null && requisitos.test(new Usuario("Dummy", tipoUsuario, infoUsuario.getIngresoMensual(), infoUsuario.getEdad()))) {
        UsuarioFactory factory = UsuarioFactory.createFactory(tipoUsuario);
        if (factory != null) {
            Usuario nuevoUsuario = factory.createUsuario(nombre, infoUsuario);
            userManager.agregarUsuario(nuevoUsuario);
            vista.mostrarMensaje("Usuario creado exitosamente: " + nuevoUsuario.getNombre() + " - Plan: " + tipoUsuario);
        } else {
            vista.mostrarMensaje("Tipo de usuario no válido: " + tipoUsuario);
        }
    } else {
        vista.mostrarMensaje("El usuario no cumple con los requisitos del plan: " + tipoUsuario);
    }
}

    private Map<String, Predicate<Usuario>> determinarTipoUsuario(int edad, double ingresoMensual, int familiaresQueGananDinero, boolean tieneEmprendimiento, double cantidadInversion) {
        Map<String, Predicate<Usuario>> requisitosMap = new HashMap<>();
        requisitosMap.put("Estudiante", usuario -> usuario.getPerfil().equals("Estudiante"));
        requisitosMap.put("Basica", usuario -> ingresoMensual >= 1000000 && ingresoMensual < 2000000);
        requisitosMap.put("Black", usuario -> ingresoMensual >= 2000000 && ingresoMensual < 5000000);
        requisitosMap.put("Golden", usuario -> ingresoMensual >= 5000000);
        requisitosMap.put("Familiar", usuario -> familiaresQueGananDinero >= 2);
        requisitosMap.put("Huesito", usuario -> usuario.getEdad() >= 65);
        requisitosMap.put("Chamba", usuario -> tieneEmprendimiento);
    
        // Agregar lógica para los nuevos tipos de usuario aquí
    
        return requisitosMap;
    }

    public String[] obtenerPerfiles(InformacionUsuario infoUsuario) {
        Set<String> perfilesSet = new HashSet<>();
        // Obtener el mapa de requisitos directamente del método determinarTipoUsuario
        Map<String, Predicate<Usuario>> requisitosMap = determinarTipoUsuario(infoUsuario.getEdad(), infoUsuario.getIngresoMensual(), infoUsuario.getFamiliaresQueGananDinero(), infoUsuario.isTieneEmprendimiento(), infoUsuario.getCantidadInversion());
    
        for (Map.Entry<String, Predicate<Usuario>> entry : requisitosMap.entrySet()) {
            String tipoUsuario = entry.getKey();
            Predicate<Usuario> requisitos = entry.getValue();
            if (requisitos.test(new Usuario("Dummy", tipoUsuario, infoUsuario.getIngresoMensual(), infoUsuario.getEdad()))) {
                perfilesSet.add(tipoUsuario);
            }
        }
        return perfilesSet.toArray(new String[0]);
    }
    public void setVista(Vista vista) {
        this.vista = vista;
    }
}
