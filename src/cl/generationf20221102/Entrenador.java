package cl.generationf20221102;

public class Entrenador extends EquipoBasquetball{
	
	
	private int aniosExperiencia;
	private String equipo;
	public Entrenador() {
		super();
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public Entrenador(int aniosExperiencia, String equipo) {
		super();
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Entrenador [aniosExperiencia=" + aniosExperiencia + ", equipo=" + equipo + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}


	


}
