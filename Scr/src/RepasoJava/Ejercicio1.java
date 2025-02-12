package RepasoJava;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		var lector = new Scanner(System.in);
		
	
	System.out.println("escriba la nota del parcial 1: ");
		var notas1 =  lector.nextDouble();
		
		System.out.println("escriba la nota del parcial 2: ");
		var notas2 =  lector.nextDouble();
		
		System.out.println("escriba la nota del parcial 3: ");
		var notas3 = lector.nextDouble();
		
		var notasD= (notas1 + notas2 + notas3)/3;
		
		var resultado = notasD>=350 ? "Aprobo😁" : "Desaprobo 😔";
		
		System.out.println("Tu nota es: " + notasD);
		System.out.println("");
		System.out.println("usted " + resultado);
		
	}

}
