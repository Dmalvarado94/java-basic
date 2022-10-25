package cl.generationf20221024;

import java.util.Arrays;

public class arreglos {

	public static void main(String[] args) {
		// Arreglos(Array) en Java
		// Son estáticos, no cambian de tamaño
		
		int[] arreglo = new int[3];   // color naranjo es palabra reservada
		// arreglo.length; tamaño del arreglo
		
		// En Java tenemos que agregar datos
		arreglo[0]=4;
		arreglo[1]=8;
		arreglo[2]=12;
		
		// arreglo[3]=24; // Error fuera del índice, indicamos solo para 3.
		System.out.println(arreglo.toString());
		System.out.println(Arrays.toString(arreglo));
		System.out.println(arreglo.length+"");
		System.out.println(arreglo[0]);
		
		// Arreglos con forma {}
		int[] sinNumeros = {};  // vacío es = 0;
		// sinNumeros[0] = 123;  // Recuerda que si es 0 no podemos agregar.
		System.out.println(sinNumeros.length);
		
		
		String[] vocales = {"a", "e", "i", "o", "u"};
		System.out.println("Cantidad de elementos "+vocales.length);
		vocales[1]= "o";
		vocales[2]= "e";
		vocales[3]= "hola amiguitos";
		
		
		// Crea un array de numeros flotantes de tamaño 6
		float[] array = new float[6];
		array[0]= 2;  // 2.0 por default de float.
		array[1]= -0.6f; 
		array[2]= 4f;
		array[3]= 5f;
		array[4]= 6f;
		array[5]= 6f;
		
		
		int[] numeroInt = new int[2];
		numeroInt[0]= (int) 0.2;  // En este caso imprime 0
		System.out.println(numeroInt[0]);
		
		// Crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente
		// desde el 1 al 100
		
		int[] numeroInt2 = new int[100];
		for(int i=1; i <=100; i++) {
			numeroInt2[i-1]=i;		
		}
		System.out.println(Arrays.toString(numeroInt2));
		
		
		// Ahora lo mismo pero del 100 al 1
		
		int [] arreglo100a1 = new int [100];
		for (int i= arreglo100a1.length;i>0 ; i--) {
			arreglo100a1[arreglo100a1.length - i]= i;
		}
		System.out.println(Arrays.toString(arreglo100a1));

	
	
	// Acá otra forma de realizar el inverso 100 a 1
	
	int [] ejercicio3 = new int [100];
	for (int i= 0; i<ejercicio3.length; i++) {
		ejercicio3[i]= 100-i;
	}
	System.out.println(Arrays.toString(ejercicio3));

	}
	}
