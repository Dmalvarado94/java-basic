package cl.generationf20221026;

import java.util.Scanner;

public class TareaCapturas {

	public static void main(String[] args) {
		
		// Tenemos que imprimir en pantalla la ficha completa del paciente.
		// Nombre completo + peso + estatura + IMC.
		// Recuerda ir escaneando cada paso.

		
		
		
		Float IMC = calculoIMC();
		System.out.println("Su IMC es: " + IMC);
		String nombreCompleto = obtenerNombreCompleto();
		System.out.println("El nombre completo es: " + nombreCompleto);
		
	}		

	
	public static Float calculoIMC () {
		// capturar datos ingresados por el usuario
		Scanner scanner = new Scanner(System.in);
		// calculo del IMC; 
		// imc = Kilos/{estatura*estatura)
		
		System.out.println("Ingrese su peso en Kilogramos");
		Float peso = scanner.nextFloat();
		
		System.out.println("Ingrese su estatura con una coma ,");
		Float estatura = scanner.nextFloat();			
		Float IMC = peso / (estatura*estatura);
		
		scanner.close();
	
	
		return IMC;
	
	}
	
	public static String obtenerNombreCompleto(){
		Scanner scannerNombre = new Scanner(System.in);
		System.out.println("Ingrese su primer nombre");
		String nombre = scannerNombre.nextLine();
		scannerNombre.nextLine();
		System.out.println("Ingrese su primer apellido");
		String apellido = scannerNombre.nextLine();
		scannerNombre.nextLine();
		String nombreCompleto = nombre + " " + apellido;
		
		scannerNombre.close();
		
		return nombreCompleto;
		
		
	}
	
	
	
	
}