package cl.generationf20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// doWhile
		// a lo menos se ejecuta una vez
		// Mientras sea verdadero se va a repetir siempre
		Scanner scanner = new Scanner(System.in);
		int edad = 0;
		Float peso = 2.23f;
		Float estatura = 0f;
		
		
		do {
			System.out.println("Ingresa tu edad");
			edad = scanner.nextInt();
			
		} while(edad < 18 || edad > 120);   // || es = o
		
		System.out.println("Edad ingresada " + edad);
		
		do {
			System.out.println("Ingresa tu peso");
			peso = scanner.nextFloat();
			
		} while(peso < 40 || peso > 170);   // || es = o
		
		System.out.println("Peso ingresado " + peso);
		
		
		do {
			System.out.println("Ingresa tu estatura");
			estatura = scanner.nextFloat();
			
		} while(estatura < 0.2 || estatura > 3.0);   // || es = o
		
		System.out.println("Estatura ingresada " + estatura);

		scanner.close();
	}

}
