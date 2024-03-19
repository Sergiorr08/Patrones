package Modelo;

import Modelo.Usuario.Usuario;

public abstract class UsuarioFactory {
    public abstract Usuario createUsuario();

    // Método abstracto para crear una instancia de UsuarioFactory
    public static UsuarioFactory createFactory(String tipoUsuario) {
        // Aquí puedes implementar la lógica para devolver la fábrica adecuada según el tipo de usuario
        if (tipoUsuario.equals("Estudiante")) {
            return EstudianteFactory.createFactory();
        }
        // Agrega más casos según sea necesario para otros tipos de usuario
        return null;
    }
}