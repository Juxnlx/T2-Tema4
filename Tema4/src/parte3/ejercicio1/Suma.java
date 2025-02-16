package parte3.ejercicio1;

public class Suma {

	/**
	 * Esta función recibe dos números enteros y se encarga de calcular la suma de
	 * dichos números.
	 * 
	 * @param num1 El primer número entero pasado como parametro.
	 * @param num2 El segundo número entero pasado como parametro.
	 * @return La suma de los dos números.
	 */
	public int suma(int num1, int num2) {
		// Creamos la variable sumaNumeros como int para almacenar el valor de la suma
		// de los dos números pasados como parametro.
		int sumaNumeros;

		// Realizamos la ecuación y lo almacenamos en sumaNumeros.
		sumaNumeros = num1 + num2;

		// Devolvemos la variable sumaNumeros donde se almacena el resultado de la suma
		return sumaNumeros;
	}

	/**
	 * Esta función recibe dos números decimales y se encarga de calcular la suma de
	 * dichos números.
	 * 
	 * @param num1 El primer número decimal pasado como parametro.
	 * @param num2 El segundo número decimal pasado como parametro.
	 * @return La suma de los dos números.
	 */
	public double suma(double num1, double num2) {
		// Creamos la variable sumaNumeros como double para almacenar el valor de la
		// suma de los dos números pasados como parametro.
		double sumaNumeros;

		// Realizamos la ecuación y lo almacenamos en sumaNumeros.
		sumaNumeros = num1 + num2;

		// Devolvemos la variable sumaNumeros donde se almacena el resultado de la suma.
		return sumaNumeros;
	}

}
