package patrones;

import java.util.Scanner;

public class Ask1Number extends AskData{

	public  void getData() {
		Scanner sc =new Scanner(System.in);
		System.out.println("ingrese un número:");
		String n= sc.next();
		i=Integer.parseInt(n);
		System.out.println("ingrese el operador:");
		op= sc.next();
		
	}

}
