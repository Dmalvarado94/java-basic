package cl.generationf20221102;

public class Estudiantes extends Persona {
	
	private String curso;
	private Float promedio;
	
	public Estudiantes() {
		super();
	}
	

	public Estudiantes(String curso, Float promedio) {
		super();
		this.curso = curso;
		this.promedio = promedio;
	}


	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Float getPromedio() {
		return promedio;
	}

	public void setPromedio(Float promedio) {
		this.promedio = promedio;
	}


	@Override
	public String toString() {
		return "Estudiantes [curso=" + curso + ", promedio=" + promedio + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}


	
	


}
