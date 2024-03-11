package patrones;

import java.util.HashMap;

import procedimientos.Modulo;
import procedimientos.Multiplicacion;
import procedimientos.Potencia;
import procedimientos.Procedimientos;
import procedimientos.Resta;
import procedimientos.Suma;

public class Operadores {

	public HashMap<String, Procedimientos> initProc(){
		HashMap<String, Procedimientos> myOp=new HashMap<>();
		myOp.put("+", new Suma());
		myOp.put("-", new Resta());
		myOp.put("*", new Multiplicacion());
		myOp.put("%", new Modulo());
		myOp.put("p", new Potencia());
		
		return myOp;
	}
}
