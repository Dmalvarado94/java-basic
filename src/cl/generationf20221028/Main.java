package cl.generationf20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// instanciar a Estudiante
		
		// (1) Primero definimos métodos que utilizaremos, Scanner y Arraylist en este caso.
		
		Scanner sc = new Scanner(System.in);
		//arrelo de estudiantes
		ArrayList<Estudiante> estudiantes= new ArrayList<Estudiante>();
		
		// (2) Luego creamos un bucle do - While 
		int continuar=2;  // Esto es por si queremos un ¿Quiere agregar otro estudiante?
		do {
			
			System.out.println("Ingrese el nombre del estudiante");
			String nombre = sc.nextLine();// israel alexis
			System.out.println("Ingrese el apellido del estudiante");
			String apellido = sc.nextLine();
			
		// (3) Instanciamos al objeto estudiante con un new
			
			Estudiante estudiante = new Estudiante();
			   // (3.1) Asignamos un valor a los atributos que scaneamos anteriormente
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			
			  // (3.2) Agregamos un objeto dentro del arreglo con .add
			estudiantes.add(estudiante);
			
		// Un lujito, Quiere agregar otro estudiante?, con su Scan necesario.
			System.out.println("Quiere agregar otro estudiante");
			System.out.println("(1)SI  (2)NO");
			continuar= sc.nextInt();
			sc.nextLine();//corrige el error de capturar un numero y despues solicitar un string
			
		} while (continuar==1);  // Finalizamos el While con la condición ==1 indico Si, y se repite el ciclo.
		
		
		// (4) Ahora un ciclo for para poder consultar los atributos.
		for (Estudiante estudiante : estudiantes) {
			System.out.println("nombre: "+estudiante.getNombre());
			System.out.println("apellido: "+estudiante.getApellido());
		}
		//Obtener un estudiante especifico por posicion
		System.out.println(estudiantes.get(0));
		
		//accedemos a un atributo del objeto
		System.out.println(estudiantes.get(0).getNombre());
		
	}

}