package Modelo.Usuario;

public class InformacionUsuario {
    private String nombre;
    private int edad;
    private double ingresoMensual;
    private int familiaresQueGananDinero;
    private boolean tieneEmprendimiento;
    private double cantidadInversion;

    public InformacionUsuario(String nombre, int edad, double ingresoMensual, int familiaresQueGananDinero, boolean tieneEmprendimiento, double cantidadInversion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ingresoMensual = ingresoMensual;
        this.familiaresQueGananDinero = familiaresQueGananDinero;
        this.tieneEmprendimiento = tieneEmprendimiento;
        this.cantidadInversion = cantidadInversion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public int getFamiliaresQueGananDinero() {
        return familiaresQueGananDinero;
    }

    public boolean isTieneEmprendimiento() {
        return tieneEmprendimiento;
    }

    public double getCantidadInversion() {
        return cantidadInversion;
    }
}