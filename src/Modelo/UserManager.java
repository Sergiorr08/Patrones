package Modelo;

import java.util.ArrayList;
import java.util.List;
import Modelo.Usuario.Usuario;

public class UserManager {
    private static UserManager instance;
    private List<Usuario> usuarios;

    private UserManager() {
        usuarios = new ArrayList<>();
    }

    public static synchronized UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarios;
    }

}
