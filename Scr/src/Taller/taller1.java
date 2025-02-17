package Taller;

import java.util.Arrays;

public class taller1 {

	public static void main(String[] args) {
		////declaracion de las variables y vectores
		int tamaño = 5;
		int[] vector1 = new int[tamaño];
		int[] vector2 = new int[tamaño];
		int parvector1 = 0;
		int parvector2 = 0;
		int imparvector1 = 0;
		int imparvector2 = 0;
            ///creamos para que nos entreguen los numeros aleatorios
            ///
		for (int i = 0; i < tamaño; i++) {
			vector1[i] = (int) (Math.random() * 500) + 1;
			vector2[i] = (int) (Math.random() * 500) + 1;
            ////creamos los contadores para los numeros pares e impares
			if (vector1[i] % 2 == 0)
				parvector1++;
			else
				imparvector1++;

			if (vector2[i] % 2 == 0)
				parvector2++;
			else
				imparvector2++;
		}///creamos para ver la cantidad de pares e impares
		System.out.println("Vector 1: " + Arrays.toString(vector1));
		System.out.println("numeros pares: " + parvector1);
		System.out.println("Vector 2: " + Arrays.toString(vector2));
		System.out.println("numeros pares: " + parvector2);
		////creamos para quien tiene mas cantidad de impares de los vectores
		if (imparvector1 > imparvector2) {
            System.out.println("el Vector 1 tiene mas numeros impares ");
        } else if (imparvector2 > imparvector1) {
            System.out.println("el Vector 2 tiene mas numeros impares ");
        } else {
            System.out.println("Ambos vectores tienen la misma cantidad de numeros impares ");
        } 
          ////Creamos para poder ordenar los vectores de mayor a menor
		for (int i = 0; i < tamaño - 1; i++) {
			for (int x = 0; x < tamaño - 1 - i; x++) {
				if (vector1[x] > vector1[x + 1]) {
					int temp = vector1[x];
					vector1[x + 1] = temp;
				}
				if (vector2[x] > vector2[x + 1]) {
					int temp = vector2[x];
					vector2[x] = vector2[x + 1];
					vector2[x + 1] = temp;
				}
			}
		}
		 System.out.println("Vector 1 ordenado: " + Arrays.toString(vector1));
	     System.out.println("Vector 2 ordenado: " + Arrays.toString(vector2));
	}

	}


