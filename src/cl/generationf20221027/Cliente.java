package cl.generationf20221027;

public class Cliente {
	// Atributos
	private String nombre;    
	private String apellidoPaterno;    
	private String apellidoMaterno; 
	private String correo;   
	private Integer edad;
	private Float cedula;
	
	
	// Instanciar
	
	public Cliente() {
		super();
	}
	public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String correo, Integer edad,
			Float cedula) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.correo = correo;
		this.edad = edad;
		this.cedula = cedula;
	}
	
	// Generate y mutador
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Float getCedula() {
		return cedula;
	}
	public void setCedula(Float cedula) {
		this.cedula = cedula;
	} 

	// Metodos del objeto
	
	public void consultar() {   // Esto si lo escribimos
		System.out.println("Estoy en el metodo consultar del objeto");
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", correo=" + correo + ", edad=" + edad + ", cedula=" + cedula + "]";
	} 
	
	
	
}
