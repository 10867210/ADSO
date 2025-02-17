package Taller;

import java.util.Scanner;

public class taller3 {
	public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
		///Le preguntamos al usuario la cantidad de productos
      System.out.println("Digite la cantidad de productos comprados: ");
      int productos = lector.nextInt(); 
		
		 //// declaracion del arreglo
      double [] precios = new double [productos];
      ////creamos el for para que el usuario digite los nombres de los productos
      for (int i = 0; i < productos; i++) {
		System.out.println("ingrese los nombres de los productos: ");
		precios[i] = lector.nextDouble();
	}////creamos los descuentos
      for (int i = 0; i < productos; i++) {
		if (precios[i]>55000) {
			precios[i] *= 0.90;
		}else {
			precios[i]*=0.95;
		}
		 System.out.printf("producto",( i + 1), (precios[i]));
      } 
	
	}
}
