package cl.generationf20221025;

import java.util.HashSet;

public class ArregloHarshSet {

	public static void main(String[] args) {
		// Set o HarshSet (Agrega solo 1 dato, no admite repiticion.
		// HashSet<TipoDato> nombre_array = new HahsSet<TipoDato>();
		
		HashSet<String> relatores = new HashSet<String>();
		
		// 2 Agregar elemento al arreglo
		
		relatores.add("Alejandro");
		relatores.add("Andrea");
		relatores.add("Alejandro");
		relatores.add("Israel");
		relatores.add("Daniel");
		
		System.out.println(relatores);
		
		// Verificar contenido del arreglo (true, false)
		
		boolean verificacionNombre = relatores.contains("Andrea");
		System.out.println(verificacionNombre);
		
		// Eliminar un elemento
		
		relatores.remove("Daniel");
		System.out.println(relatores);
		
		// Tamaño del arreglo
		
		System.out.println("El tamaño del HashSet es " + relatores.size());  // Siempre retorna un numero entero
		
		// Recorrer el arreglo
		for(String relator: relatores) {
			System.out.println(relator);
		}
		
		
		

	}

}
