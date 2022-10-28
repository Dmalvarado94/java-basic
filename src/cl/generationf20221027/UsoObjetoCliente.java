package cl.generationf20221027;

import java.util.Scanner;

public class UsoObjetoCliente {

	public static void main(String[] args) {
		// Vamos a instanciar la clase Auto archivo Cliente.java
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Luis");
		cliente1.setApellidoPaterno("Pino");
		cliente1.setApellidoMaterno("Hormazabal");
		cliente1.setCorreo("luishormazabal@gmail.com");
		cliente1.setEdad(20);		
		
		// Obtenemos atributos
		System.out.println(cliente1.getNombre());
		System.out.println(cliente1.getApellidoPaterno());
		System.out.println(cliente1.getApellidoMaterno());
		System.out.println(cliente1.getCorreo());
		System.out.println(cliente1.getEdad());
		
		// Contenido del cliente
		System.out.println(cliente1.toString());
		
		Cliente cliente2 = new Cliente();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Su nombre" + scan.next() );
		
	
	}

}
