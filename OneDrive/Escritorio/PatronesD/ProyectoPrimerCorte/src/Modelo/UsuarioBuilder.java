package Modelo;

import Modelo.Usuario.Usuario;

public class UsuarioBuilder {
    private String nombre;
    private String perfil;
    private double saldo;

    public UsuarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder perfil(String perfil) {
        this.perfil = perfil;
        return this;
    }

    public UsuarioBuilder saldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public Usuario build() {
        return new Usuario(nombre, perfil, saldo, 0);
    }
}
