package parte3.ejercicio1;

public class PrincipalSuma {

	public static void main(String[] args) {

		// Creamos un objeto de la clase suma.
		Suma calcularSuma = new Suma();

		// Imprimimos una suma con números enteros.
		System.out.println("Suma de enteros (4 + 3): " + calcularSuma.suma(4, 3));

		// Imprimimos una suma con números decimales.
		System.out.println("Suma de enteros (4.8 + 12.04): " + calcularSuma.suma(4.8, 12.04));

	}

}
