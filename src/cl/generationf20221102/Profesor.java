package cl.generationf20221102;

public class Profesor extends Persona {
	private String curso;
	private int aniosExperiencia;
	private String colegio;

	public Profesor() {
		super();
	}

	public Profesor(String curso, int aniosExperiencia, String colegio) {
		super();
		this.curso = curso;
		this.aniosExperiencia = aniosExperiencia;
		this.colegio = colegio;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	@Override
	public String toString() {
		return "Profesor [Curso = " + curso + ", Experiencia = " + aniosExperiencia + ", Colegio = " + colegio
				+ ", Nombre = " + getNombre() + ", Apellido = " + getApellido() + ", Edad = " + getEdad() + "]";
	}

}