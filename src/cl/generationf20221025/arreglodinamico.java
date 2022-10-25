package cl.generationf20221025;

import java.util.ArrayList;

public class arreglodinamico {

	public static void main(String[] args) {
		// ArrayList  (Lo mismo q un array pero no hay q definir tamaño)
		// Ctrl + shift + o = Importar dependencias necesarias para codear.
	// ArrayList<TIPODATO> nombre array = new ArrayList<TIPODATO>();

	
		ArrayList<String> takeFive = new ArrayList<String>();
		
		// Agregar valores al arreglo (En JAVA reemplazamos el push por add)
		takeFive.add("Luis Pino");
		takeFive.add("Cynthia Martinez");
		takeFive.add("Kiara Mimbela");
		takeFive.add("Pablo Vasquez ");
		takeFive.add("Daniel Moya");
		
		System.out.println(takeFive);
		System.out.println(takeFive.size()); // takeFive. <- encontramos el Size, va dentro de un syso.
		
		
		// Obtener un elemento dentro del arreglo
		takeFive.get(3);
		System.out.println(takeFive.get(3));
		
		// Eliminar un elemento del array
		// takeFive.remove(0);
		System.out.println(takeFive.remove(0));
		System.out.println(takeFive);
		
		// Recorrer el ArrayList
		for(int i = 0; i<takeFive.size();i++){
			System.out.println("relator: "+takeFive.get(i));
		}
		
		// for iterador o for de objeto, otra forma de for mas rapido
		for(String take: takeFive ) {
			System.out.println(take);
		}
		
	}

}
