package cl.generationf20221024;

import java.util.Arrays;

public class ejercicio2 {

	public static void main(String[] args) {

		// 1. Escribir un arreglo de tamaño de 10 ,con números positivos y negativos
		// capturar en máximo y mínimo
		// Ejemplo arreglo10 [-3,-5, 4,12, 3,35, -35,77,-1, 0];

		int[] ejercicio = { -3, -5, 4, 12, 3, 35, -35, 77, -1, 0 };
		int maximo = 0;
		int minimo = 0;

		for (int i = 0; i <= ejercicio.length - 1; i++) {
			if (ejercicio[i] > maximo) {
				maximo = ejercicio[i];
			}
			if (ejercicio[i] < minimo) {
				minimo = ejercicio[i];
			}
		}
		System.out.println("La máximo de la lista es " + maximo);
		System.out.println("La mínimo de la lista es " + minimo);

		// 2. El mismo arreglo crear otros 2 arreglos,
		// uno con solo los pares y otro arreglo solo con los impares

		int[] impares = new int[ejercicio.length];
		int[] pares = new int[ejercicio.length];
//impares: 
		for (int i = 0; i < ejercicio.length; i++) {
			if (ejercicio[i] % 2 == 0) { // obtenemos el par
				pares[i] = ejercicio[i]; // {0,0,4,12,0,0,0,0,0,0}
			} else {
				impares[i] = ejercicio[i]; // {-3,-5,0,0,3,35,-35,77,-1,0}
			}
		}
		System.out.println("Los pares son ");
		System.out.println(Arrays.toString( pares));
		System.out.println("Los impares son ");
		System.out.println(Arrays.toString( impares));

		// 3. Para el mismo arreglo, sacar el promedio de los números.

	}

}
