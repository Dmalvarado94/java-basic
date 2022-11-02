package cl.generationf20221102;

public class Basquetbolista extends EquipoBasquetball{
	
	private Float peso;
	private Float altura;
	public Basquetbolista() {
		super();
	}
	public Basquetbolista(Float peso, Float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}

}
