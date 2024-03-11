package patrones;



public class Main {
	
	public static void main(String[]args) {
		
		Operadores o=new Operadores();
		AskData ask=new Ask2Numbers();

		Logica l=new Logica(ask, o.initProc());
		l.mimismometodomain();
	
	
		
	}

}
