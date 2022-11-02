package cl.generationf20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Herencia en Java
		
		// Instanciando objetos
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre("Jhon");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAniosExperiencia(10);
		entrenador.setEquipo("Valdivia");
		
		System.out.println(entrenador.toString());
		
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEspecialidad("Quiropractico");
		kine.setTitulo("Kinesiologia");
		kine.setEdad(52);
		
		ArrayList<Basquetbolista> equipo = new ArrayList<Basquetbolista>();
		
		Basquetbolista basque = new Basquetbolista();
		basque.setNombre("Michel");
		basque.setApellido("Pipen");
		basque.setAltura(2.15f);
		
		equipo.add(basque);  // Agregar un objeto a la lista
		
		Basquetbolista basque2 = new Basquetbolista();
		basque2.setNombre("Steve");
		basque2.setApellido("Curry");
		basque2.setAltura(2.2f);
		equipo.add(basque2);
		
		for(Basquetbolista jugador : equipo ) {
			System.out.println(jugador.toString());
		}
	}

}
