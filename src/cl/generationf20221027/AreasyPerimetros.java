package cl.generationf20221027;

import java.util.Scanner;

public class AreasyPerimetros {

	public static void main(String[] args) {

		// Un programa que realice el calculo de areas y perimetros de triangulos
		// ,rectangulos y circunferencias //Libreria math
		// Menu de opciones
		// terminar la ejecución
		
		menu();
		
		
		}


public static void menu() {
	System.out.println("********************");
	System.out.println("*       MENU       *");
	System.out.println("********************");
	System.out.println("1.-   Perimetro Triangulo      **");
	System.out.println("2.-   Área Triangulo      **");
	System.out.println("3.-   Perimetro Rectangulo **");
	System.out.println("4.-   Area Rectangulo    **");
	System.out.println("5.-   Perimetro Circulo    **");
	System.out.println("6.-   Area Circulo    **");
	System.out.println("0.-   SALIR       **");
	System.out.println("********************");
	
	Scanner sc = new Scanner(System.in);
	int opciones = 0;
	int contadorErrores=4;
	
	do {
		System.out.println("* Seleccione una opción *");
		opciones = sc.nextInt();   // version resumida de un scanner

		//si la opcion es cero, salir del do-while
		if(opciones==0) {
			System.out.println("Usted a salido del programa");
			break;
		}
		
		if(contadorErrores==1) {
			System.out.println("Agoto la cantidad de intentos, chaolin!!");
			break;
		}else if(opciones< 0 || opciones >4){//condicion de error
			contadorErrores--;
			System.out.println("Te quedan "+contadorErrores+ " intentos" );
		}

	} while (opciones< 0 || opciones >4);
	
	if(opciones == 0  || contadorErrores == 0) {
		System.out.println("Bye!");
	}else {
		
		// Else - Anidamos con Switch y partimos con algunas variables

		float suma = 0;
		float base = 0;
		float altura = 0;
		float diametro = 0;
		float radio = 0;
		float area = 0;
		float perimetro = 0;
		
		switch (opciones) {
		case 1:   // Perimetro triangulo
			System.out.println("Ingresa el primer lado");
			float lado1 = sc.nextFloat();
			System.out.println("Ingresa el segundo lado");
			float lado2 = sc.nextFloat();
			System.out.println("Ingresa el tercer lado");
			float lado3 = sc.nextFloat();
			suma = lado1 + lado2 + lado3;
			System.out.println("El perimetro del triangulo es  "  + suma);
			break;
		case 2:    // Area triangulo
			System.out.println("Ingresa la base");
			base = sc.nextFloat();
			System.out.println("Ingresa la altura");
			altura = sc.nextFloat();
			area = base * (altura/2);
			System.out.println("El Area triangulo es  " + area);
			break;
		case 3: // Perimetro rectangulo 
			System.out.println("Ingresa el primer lado");
			lado1 = sc.nextFloat();
			System.out.println("Ingresa el segundo lado");
			lado2 = sc.nextFloat();
			perimetro = (lado1*2) + (lado2*2);
			System.out.println("El perimetro del rectangulo es " + perimetro);
			break;
		case 4: // Area rectangulo
			System.out.println("Ingresa el largo ");
			float largo = sc.nextFloat();
			System.out.println("Ingresa el ancho ");
			float ancho = sc.nextFloat();
			area = largo * ancho;
			System.out.println("El Area del rectangulo es " + area);
			break;
		case 5: // Perimetro Circulo
			System.out.println("Ingresa el diametro ");
			diametro = sc.nextFloat();
			System.out.println("El perimetro del circulo es " + diametro * Math.PI );
			break;
		case 6: // Área Circulo
			System.out.println("Ingresa el radio ");
			radio = sc.nextFloat();
			System.out.println("El área del circulo es " + (radio * 2) * Math.PI );
			break;
			
		default:
			System.out.println("Opción no valida");
			break;
		}

	}
	
			
}

}
	
			

