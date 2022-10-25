package cl.generationf20221025;

import java.util.HashMap;
import java.util.Map;

public class ArregloHashMap {
	
	public static void main(String[] args) {
		
		// Es una tabla Map, tenemos que poblarla con un elemento y un identificador
		// HashMap<TipoDato,TipoDato> nombre_array = new HahsMap<TipoDato,TipoDato>();
		
		Map <String, String > takefive = new HashMap<String, String>();
		takefive.put("Kiara", "12");
		takefive.put("Cynthia", "16");
		takefive.put("Luis", "18");
		takefive.put("Pablo", "11");
		takefive.put("Daniel", "19");
		
		System.out.println(takefive);

		
		// Iterador en un HashMap
		
		for (Map.Entry<String, String> set: takefive.entrySet()) {
			 
           // Imprimimos elemento y valor 
           System.out.println(set.getKey() + " = " + set.getValue());
		
	}		
		
	
		
	
	}		

	

}
