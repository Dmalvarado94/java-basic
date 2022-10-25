package cl.generationf20221025;

import java.util.HashMap;
import java.util.Map;

public class ArregloHashMaptest {

	public static void main(String[] args) {
		// HashMap
		// llave, valor(key, value)
		
		HashMap<Integer, String> relatores = new HashMap<Integer, String>();
		
		// Agregamos valores al mapa
		
		relatores.put(1, "Alejandro");
		relatores.put(2, "Andrea");
		relatores.put(3, "Laura");
		relatores.put(4, "Pamela");
		relatores.put(4, "Pamela");
		relatores.put(1, "Israel"); // Si existe esa clave se sobre escribe el valor.
		System.out.println("map" + relatores);
		
		// Tamaño del map
		
		System.out.println(relatores.size());
		
		// Acceder o muestra un dato (Get)
		System.out.println(relatores.get(3));
		
		// Eliminar un dato
		relatores.remove(1);
		System.out.println("map" + relatores);
		
		// Recorrer un mapa   (Version mapa)
		
		/* for (Map.Entry<Integer, String> relatores : map.entrySet()) {
			Integer key = relatores.getKey();
			String val = relatores.getValue();
		}    */
		
		
		// Recorrer un mapa  (Recorriendo Claves o Key)
		
		for(Integer clave : relatores.keySet() ) {
			System.out.println("clave " + clave + " valor " + relatores.get(clave));
		}
		
		
		
	}
	
	

}
