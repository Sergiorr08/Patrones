package Modelo;

import Modelo.Usuario.Usuario;

public class EstudianteFactory extends UsuarioFactory {
    @Override
    public Usuario createUsuario() {
        UsuarioBuilder builder = new UsuarioBuilder();
        return builder
            .nombre("Estudiante Ejemplo")
            .perfil("Estudiante")
            .saldo(0) 
            .build();
    }

    // Método para crear una instancia de EstudianteFactory
    public static UsuarioFactory createFactory() {
        return new EstudianteFactory();
    }
}