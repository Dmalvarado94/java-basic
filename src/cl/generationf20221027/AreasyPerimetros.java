package cl.generationf20221027;

import java.util.Scanner;

public class AreasyPerimetros {

	public static void main(String[] args) {
	Menu2();
	}
	//Un programa que realice el calculo de areas y perimetros de triangulos ,rectangulos y circunferencias //Libreria math
		
	public static void Menu2() {
		System.out.println("*****     MENU DE CALCULO DE PERIMETROS Y AREAS    *****");
		System.out.println("1.Triangulo");
		System.out.println("2.Rectangulos");
		System.out.println("3.Circunferencias");
		Scanner scan = new Scanner(System.in);
		int op=scan.nextInt();
		float lado,lado2,lado3;
		float area=0;
		float perimetro=0;
		float altura,base;
		if(op!=0) {
			switch (op) {
			case 1:// Triangulo
				
				System.out.println("Indique Lado 1");
				lado=scan.nextFloat();
				
				System.out.println("Indique Lado 2");
				lado2=scan.nextFloat();
				
				System.out.println("Indique Lado 3");
				lado3=scan.nextFloat();
				
				perimetro= lado + lado2 + lado3;
				System.out.println("Indique Altura");
				
				altura=scan.nextFloat();
				System.out.println("Indique Base");
				
				base=scan.nextFloat();
				area=(float) (0.5 * base * altura);
				
				System.out.println("El resultado es del perimetro es " + perimetro);
				System.out.println("El resultado es del perimetro es " + area);
				
				break;
				
			case 2://Rectangulo
				System.out.println("Indique Lado 1");
				lado=scan.nextFloat();
				perimetro=4*lado;
				
				System.out.println("El resultado es del perimetro es " + perimetro);
				System.out.println("El resultado es del perimetro es " + area);
				break;
			case 3://Circunferencia
				
				//System.out.println("El resultado es " + resultado);
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
			
		}
	
	}
}
