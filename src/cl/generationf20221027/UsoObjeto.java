package cl.generationf20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// Vamos a instanciar la clase Auto archivo auto.java
		
		Auto auto1 = new Auto();  // Estamos creando una referencia del auto
		 auto1.text ="sadjas";
		//auto1.color="rojo";
		
		// Asignar valores a los atributos privados
		// solo a través del metodo setter
		auto1.setColor("rojo");
		auto1.setMarca("Peugeot");
		
		// ¿Como consultamos el contenido de los atributos?
		
		System.out.println(auto1.getColor());
		System.out.println(auto1.getMarca());
		System.out.println(auto1.getModelo());
		
		
		// Aquí imprimos el contenido de todos los atributos
		System.out.println(auto1.toString());
		
		
		// Generamos una nueva instancia de Auto (Generar un nuevo objeto)
		Auto car = new Auto("Nissan", "Negro", "Qashqai", 1.6f, 10.0f, 240f);
		System.out.println(car.getModelo());
		System.out.println(car.toString());
	}

}
