package Operaciones.app;
import java.util.HashMap;


import Operaciones.operacion;
import Operaciones.resta;
import Operaciones.suma;

public class ejecutable {
    public static void main(String[] args) {
        HashMap<String, operacion> myOp= new HashMap<>();

        myOp.put("+", new suma());
        myOp.put("-", new resta());
    }

    operacion p = myOp.get(askData)
}
