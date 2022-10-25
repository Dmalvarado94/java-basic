package cl.generationf20221025;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// Funciones o metodos
		// Static es un accesador
		
		// llamar a un método
		nombreMetodo();
		metodo2("Juan");   // Cada vez que llamamos al método 2 debemos indicarle un String
		metodo2("Perez");
		metodo3(380);
		metodo4(12, 3.14f);
		String[] vocales = {"a","e","i","o","u"};  // Necesario indicar antes de llamarlo para poder imprimirlo.
		metodo5(vocales);

	}
	// Definicion o estructura de un método
	// void = El metodo no retornará ningun valor
	
	public static void nombreMetodo() {
		System.out.println("Hola mundo");
	}
	
	public static void metodo2(String nombre) {
		System.out.println("Soy " + nombre);
	}
	
	public static void metodo3(Integer numero) {
		System.out.println("Soy el numero  " + numero);
	}
	
	public static void metodo4(Integer numero1, Float numero2) {
		System.out.println("Soy el numero int  " + numero1);
		System.out.println("Soy el numero float " + numero2);
	}
	
	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo  " + Arrays.toString(arreglito));
		
	}

}
