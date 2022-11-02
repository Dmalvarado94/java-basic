package cl.generationf20221102;

public class Administrativo extends Persona{

	private String titulo;
	private String cargo;
	public Administrativo() {
		super();
	}
	public Administrativo(String titulo, String cargo) {
		super();
		this.titulo = titulo;
		this.cargo = cargo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Administrativo [titulo=" + titulo + ", cargo=" + cargo + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
	
	

	
}
