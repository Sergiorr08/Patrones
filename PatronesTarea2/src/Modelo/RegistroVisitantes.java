package Modelo;

import java.util.ArrayList;

public class RegistroVisitantes {

    private ArrayList<Visitante> visitantes;

    public RegistroVisitantes() {
        this.visitantes = new ArrayList<>();
    }

    public void agregarVisitante(Visitante visitante) {
        visitantes.add(visitante);
        
    }
    public ArrayList<Visitante> getVisitantes() {
        return visitantes;
    }
}