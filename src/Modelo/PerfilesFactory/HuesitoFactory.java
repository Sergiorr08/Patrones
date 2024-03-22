package Modelo.PerfilesFactory;

import Modelo.UsuarioFactory;
import Modelo.Usuario.InformacionUsuario;
import Modelo.Usuario.Usuario;

public class HuesitoFactory implements UsuarioFactory {
    @Override
    public Usuario createUsuario(String nombre, InformacionUsuario infoUsuario) {
        return new Usuario(nombre, "Huesito", 0, infoUsuario.getEdad());
    }
}