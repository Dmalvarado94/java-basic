package cl.generationf20221102;

import java.util.ArrayList;

public class MainColegio {

	public static void main(String[] args) {
		// Instanciar Colegio
		
		// Instanciando objetos
		
		Profesor profe = new Profesor();
		profe.setNombre("Juan");
		profe.setApellido("Perez");
		profe.setEdad(55);
		profe.setAniosExperiencia(23);
		profe.setCurso("3A");
		profe.setColegio("Garcia de la Vega");
		
		
		System.out.println(profe.toString());
		
		Administrativo adm = new Administrativo();
		adm.setNombre("Pancho");
		adm.setApellido("Ubilla");
		adm.setTitulo("Administracion de Colegios");
		adm.setCargo("UTP");	
		System.out.println(adm.toString());
		
		Estudiantes alumno = new Estudiantes();
		alumno.setNombre("Mario");
		alumno.setApellido("Cantinas");
		alumno.setCurso("5B");
		alumno.setPromedio(5.6f);	
		System.out.println(alumno.toString());
		
	
		
		
	
		
		/* / for(Basquetbolista jugador : equipo ) {
			System.out.println(jugador.toString());
		}
	 */
	}
}