package cl.generationf20221102;

public class Persona {
	private String Nombre;
	private String Apellido;
	private int edad;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, int edad) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
  
  ////////////////////////////////////////////////////////
  
}


	

