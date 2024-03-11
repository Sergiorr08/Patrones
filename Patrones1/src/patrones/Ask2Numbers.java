package patrones;

import java.util.Scanner;

public class Ask2Numbers extends AskData{

	
	public  void getData() {
		Scanner sc =new Scanner(System.in);
		System.out.println("ingrese un número:");
		String n= sc.next();
		i=Integer.parseInt(n);
		System.out.println("ingrese el operador:");
		op= sc.next();
		System.out.println("ingrese otro número:");
		n= sc.next();
		j=Integer.parseInt(n);
	}

}
