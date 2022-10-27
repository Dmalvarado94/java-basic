package cl.generationf20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
	Float IMC = calculoIMC();
	System.out.println("Su IMC es: " + IMC);
	nivelIMC(IMC);
	}

	public static Float calculoIMC () {
		// capturar datos ingresados por el usuario
		Scanner scanner = new Scanner(System.in);
		// calculo del IMC; 
		// imc = Kilos/{estatura*estatura)
		
		System.out.println("Ingrese su peso en Kilogramos");
		Float peso = scanner.nextFloat();
		
		System.out.println("El peso del paciente es: " + peso);
		
		
		System.out.println("Ingrese su estatura en Kilogramos");
		Float estatura = scanner.nextFloat();
		System.out.println("La estatura del paciente es: " + estatura);
		
		
		Float IMC = peso / (estatura*estatura);
		
		scanner.close();
	
	
		return IMC;
	
	}
	
	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 Bajo peso 
		 * 18.5 - 24.9 Normal 
		 * 25.0 - 29.9 Sobrepeso 
		 * 30.0 o más Obeso
		 */
		if(IMC <= 18.5f){
			System.out.println("El paciente está bajo peso");
		} else if(IMC >= 18.5f && IMC < 25  ) {
			System.out.println("El paciente está normal de peso");	
		} else if (IMC >= 25f && IMC < 30 ) {
			System.out.println("El paciente está con sobrepeso");
		} else
			System.out.println("Paciente con obesidad");
		
		
		
	}
	
}
