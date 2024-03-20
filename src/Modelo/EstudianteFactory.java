package Modelo;

import Modelo.Usuario.Usuario;

public class EstudianteFactory extends UsuarioFactory {
    public Usuario createUsuario() {
        UsuarioBuilder builder = new UsuarioBuilder();
        return builder
            .nombre(" ")
            .perfil(" ")
            .saldo(0) 
            .build();
    }

    // Método para crear una instancia de EstudianteFactory
    public static UsuarioFactory createFactory() {
        return new EstudianteFactory();
    }
}