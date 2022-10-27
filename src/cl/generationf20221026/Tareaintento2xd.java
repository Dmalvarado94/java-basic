package cl.generationf20221026;

import java.util.Scanner;

public class Tareaintento2xd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Existe un problema con el método Scanner, que si lo usas 2 veces o más..
		
		
		Float IMC = calculoIMC();
		System.out.println("Su IMC es: " + IMC);
		String nombre = nombreCom();
		System.out.println("Su nombre es " + nombre);
		
	}		

	
	public static Float calculoIMC () {
	
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Ingrese su peso en Kilogramos");
		Float peso = scanner.nextFloat();
		
		System.out.println("Ingrese su estatura con una coma ,");
		Float estatura = scanner.nextFloat();			
		Float IMC = peso / (estatura*estatura);
		
		scanner.close();
	
	
		return IMC;
	
	}
	
	public static String nombreCom() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su primer nombre");
		String nombre = scanner.next();
		System.out.println(nombre);
		scanner.close();
		
		return nombre;
	}
	

	
	
}

