package Punto3;

import java.util.Scanner;

public class Punto3 {
	int p=45;
	System.out.println("digite la cantidad de personas ");

			Scanner sc=new Scanner(System.in);

	if (p<=45) {
		System.out.println("Se utilizará un solo bus ");
	}
	else {
		int result = p-45;
	
	System.out.println("Se utiliza y adiciona furgonetas:   "+result);
	}
}

