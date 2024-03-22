package Modelo;

import Modelo.PerfilesFactory.BasicaFactory;
import Modelo.PerfilesFactory.BlackFactory;
import Modelo.PerfilesFactory.ChambaFactory;
import Modelo.PerfilesFactory.EstudianteFactory;
import Modelo.PerfilesFactory.FamiliarFactory;
import Modelo.PerfilesFactory.GoldenFactory;
import Modelo.PerfilesFactory.HuesitoFactory;
import Modelo.Usuario.InformacionUsuario;
import Modelo.Usuario.Usuario;

public interface UsuarioFactory {
    Usuario createUsuario(String nombre, InformacionUsuario infoUsuario);

    static UsuarioFactory createFactory(String tipoUsuario) {
        if (tipoUsuario.equals("Estudiante")) {
            return new EstudianteFactory();
        } else if (tipoUsuario.equals("Basica")) {
            return new BasicaFactory();
        } else if (tipoUsuario.equals("Black")) {
            return new BlackFactory();
        } else if (tipoUsuario.equals("Golden")) {
            return new GoldenFactory();
        } else if (tipoUsuario.equals("Familiar")) {
            return new FamiliarFactory();
        } else if (tipoUsuario.equals("Huesito")) {
            return new HuesitoFactory();
        } else if (tipoUsuario.equals("Chamba")) {
            return new ChambaFactory();
        }
        return null;
    }
}