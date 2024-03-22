package Modelo.PerfilesFactory;

import Modelo.UsuarioFactory;
import Modelo.Usuario.InformacionUsuario;
import Modelo.Usuario.Usuario;

public class GoldenFactory implements UsuarioFactory {
    @Override
    public Usuario createUsuario(String nombre, InformacionUsuario infoUsuario) {
        return new Usuario(nombre, "Golden", 0, infoUsuario.getEdad());
    }
}