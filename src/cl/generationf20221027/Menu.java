package cl.generationf20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// Menu de opciones
		// terminar la ejecución
		menu();

		// Calculadora con 4 operaciones basicas
		// solicitar y capturar 2 numeros float
		// imprimir resultados y gardar en una variable
		// ofrecer opciones de repeticion (bucles)
		// definir los metodos
		// validaciones

		// limpiar las variables

	}

	public static void menu() {
		System.out.println("********************");
		System.out.println("*       MENU       *");
		System.out.println("********************");
		System.out.println("*1.-   SUMAR       *");
		System.out.println("*2.-   RESTAR      *");
		System.out.println("*3.-   MULTIPLICAR *");
		System.out.println("*4.-   DIVIDIR     *");
		System.out.println("*0.-   SALIR       *");
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
			System.out.println("Adios!!");
		}else {  // Solo ingresará para opciones 1,2,3,4
			System.out.println("fuera del while " + opciones);
			// esta es la base de un Switch
			// solicitaresmos 2 numeros
			System.out.println("Ingresa el primer numero");
			float numero1 = sc.nextFloat();
			System.out.println("Ingresa el segundo numero");
			float numero2 = sc.nextFloat();
			
			float suma = 0;
			float resta = 0;
			float multiplicacion = 0;
			float division = 0;
			switch (opciones) {
			case 1:   // 1 SumarCase = los casos fijos de ver 
				suma = numero1 + numero2;
				System.out.println("La suma de los numeros  " +numero1 + " + " + numero2 + " es = " + suma);
				break;
			case 2:  
				resta = numero1 - numero2;
				System.out.println("La resta de los numeros  " +numero1 + " - " + numero2 + " es = " + resta);
	
				break;
			case 3: 
				multiplicacion = numero1 * numero2;
				System.out.println("La multiplicacion de los numeros  " +numero1 + " * " + numero2 + " es = " + multiplicacion);
	
				break;
			case 4: 
				division = numero1 / numero2;
				
				if(numero2 == 0) {
					System.out.println("Alto ahí cerebrito");
				} else {
					System.out.println("La division de los numeros  " +numero1 + " / " + numero2 + " es = " + division);
				}
				break;

			default:
				System.out.println("Opción no valida");
				break;
			}

		}
		
				
	}

}
