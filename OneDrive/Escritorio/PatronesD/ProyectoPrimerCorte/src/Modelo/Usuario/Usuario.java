package Modelo.Usuario;

public class Usuario {
    private String nombre;
    private String perfil;
    private double saldo;
    private int edad;

    public Usuario(String nombre, String perfil, double saldo, int edad) {
        this.nombre = nombre;
        this.perfil = perfil;
        this.saldo = saldo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPerfil() {
        return perfil;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getEdad() {
        return edad;
    }
}

