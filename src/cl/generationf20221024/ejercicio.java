package cl.generationf20221024;

public class ejercicio {

	public static void main(String[] args) {
	
		// Transformar de int a primitivos
	int num = 22;
	long num2 = num;
	System.out.println(num2);
	
	int num3 = 100;
	float num4 = (float) num3;
	System.out.println(num4);
	
	int num5 = 40;
	double num6 = num5;  // No fue necesario (double) 
	System.out.println(num6);
	
	/* Una forma no recomendada de realizar es parseLong y ojalá evitarlo.
	
	int numero1 = 250;
	long intafloat = Long.valueOf(numero1); // Retorna objeto numerico o variable no primitiva(integer)
	long intafloat2 = Long.parseLong(numero1+"");   // de String a primitivo
	System.out.println(intafloat2);
	*/
	
	
		// Transformar de primitivos a int
	
	float a=8.61f;
    int b;
    b=(int)a;
    System.out.println(b);
    
    long numero2 = 234563432;
	int numero2aint1 = (int)numero2;
	System.out.println(numero2aint1);
	
	// Double a int a través de una multiplicación
	int numm = 10;
	double otronum = 30;
	double result = numm*otronum;
	System.out.println(result);
	
	
	


    

		
	}
}
