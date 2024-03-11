package patrones;

import java.util.HashMap;

import procedimientos.Modulo;
import procedimientos.Multiplicacion;
import procedimientos.Procedimientos;
import procedimientos.Resta;
import procedimientos.Suma;

public class Logica {
	private AskData ask;
	private HashMap<String, Procedimientos> myOp;
	
	public Logica(AskData ask,HashMap<String, Procedimientos> myOp) {
		this.ask=ask;
		this.myOp=myOp;
	}
	public void mimismometodomain() {
		ask.getData();
		Procedimientos p=myOp.get(ask.op);
		System.out.println("El resultado es: "+p.operar(ask.i, ask.j));
	}
	
}
