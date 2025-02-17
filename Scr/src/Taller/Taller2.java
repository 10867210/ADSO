package Taller;

import java.util.Scanner;

public class Taller2 {

	public static void main(String[] args) {
		var lector= new Scanner(System.in);
		////le pedimos al usuario que digite la cantidad de nombres
	var vector=0;
     System.out.println("digite la cantidad de nombres: ");	
	 vector=lector.nextInt();     
     ///declaramos el arreglo
     ///
	 String[] nombres = new String[vector];
	 
	 ////creamos el bucle para que el usuario digite la cantidad de nombres pedido
	 ///
	 lector.nextLine();
	 for (int i = 0; i < nombres.length; i++) {
		System.out.println("digite el nombre no."+i);
		nombres[i]=lector.nextLine();
		
	}
     ////creamos para almacenar el nombre con mayo caracter
	 var mayorC= nombres[0];
	 
	 for (int i = 0; i < vector; i++) {
		 if (nombres[i].length()>mayorC.length()){
		 mayorC=nombres[i];
		 
		 }

	 }
  
	System.out.println("El nombre con mas carecteres es: "+mayorC);
	
	
	}

}