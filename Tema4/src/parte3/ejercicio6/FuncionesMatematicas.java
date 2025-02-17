package parte3.ejercicio6;

public class FuncionesMatematicas {

	/**
	 * Esta función calcula la suma de todos los números entre 1 y numero de forma
	 * recursiva.
	 * 
	 * @param numero El número hasta el que se calcula la suma.
	 * @return La suma de los números desde 1 hasta numero.
	 */
	public static int sumatorio(int numero) {
		// Creamos la variable sol como int para almacenar el resultado de la suma de
		// todos los números desde 1 hasta el número pasado como parametro.
		int sol;

		// CASO BASE - Comprobamos si el número es igual a 1, si es así sol igual a 1.
		if (numero == 1) {
			sol = 1;

			// CASO RECURSIVO - La ecuación seria el número mas la llamada a la propia
			// función como parametro numero -1.
		} else {
			sol = numero + sumatorio(numero - 1);
		}

		// Devolvemos la variable sol, donde se almacena la suma de todos los números.
		return sol;
	}

	/**
	 * Esta función se encarga de calcular la potencia de un número.
	 * 
	 * @param a El número que sera elevado.
	 * @param n El valor por el que se elevará el número.
	 * @return El número ya elevado.
	 */
	public static double potencia(double a, int n) {
		// Creamos la variable sol como double para almacenar la potencia de a.
		double sol;

		// CASO BASE - Comprobamos si el elevado es 0 porque en ese caso la solución es
		// igual a 1.
		if (n == 0) {
			sol = 1;
			// CASO RECURSIVO - Para calcular la potencia multiplicamos el número por el
			// número elevado a un exponente menor, para ello llamamos a la función de
			// nuevo.
		} else {
			sol = a * Math.pow(a, n - 1);
		}

		// Devolvemos la variable a, donde se almacena la potencia de a.
		return sol;
	}

	/**
	 * Esta función calcula cual es el valor de fibonacci segun la posición pasada
	 * como parametro.
	 * 
	 * @param numero La posición del valor que queremos saber en fibonacci.
	 * @return El valor que corresponda con la posición pasada como parametro.
	 */
	public static int serieFibonacci(int numero) {

		// Creamos la variable fibonacci como int para almacenar el valor de la posición
		// pasada por parametro.
		int fibonacci;

		// CASE BASE - Comprobamos si el número es igual a 1, en ese caso el resultado
		// es igual a 1.
		if (numero == 1) {
			fibonacci = 1;
			// CASE BASE - Comprobamos si el número es igual a 2, en ese caso el resultado
			// es igual a 1.
		} else if (numero == 2) {
			fibonacci = 1;
			// CASO RECURSIVO - Para calcular el valor al que corresponde la posición
			// llamamos a la función dos veces con el número de antes y de nuevo con dos
			// número anteriores y lo sumamos. Porque para calcular el número de fibonacci
			// debes de sumar los 2 números anteriores.s
		} else {
			fibonacci = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
		}

		// Devolvemos la variable fibonacci, donde se almacena el número de dicha
		// posición.
		return fibonacci;
	}
}
