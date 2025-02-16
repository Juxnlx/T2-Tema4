package parte3.ejercicio3;

public class SumaEnteros {

	/**
	 * Esta función se encarga de calcular la suma de todos los números desde 1
	 * hasta el introducido por parametro.
	 * 
	 * @param numero El número introducido por parametro.
	 * @return La suma de todos los números.
	 */
	public int sumaEnteros(int numero) {
		// Creamos la variable solSuma como int para almacenar la suma desde el número
		// hasta el 1.
		int solSuma = 0;

		// Con este for recorremos todos los números desde 1 hasta el introducido por el
		// usuario y los va sumando. Almacenando la suma en solSuma.
		for (int i = 1; i <= numero; i++) {
			solSuma += i;
		}

		// Devolvemos la variable solSuma donde se almacena la suma total de todos los
		// valores.
		return solSuma;
	}

	/**
	 * Esta función se encarga de calcular la suma de todos los números entre los
	 * dos números pasados como parametro.
	 * 
	 * @param num1 El primer número pasado como parametro.
	 * @param num2 El segundo número pasado como parametro.
	 * @return La suma de todos los número entre los pasados como parametros
	 *         incluidos.
	 */
	public int sumaEnteros(int num1, int num2) {
		// Creamos la variable solSuma como int para almacenar la suma de todos los
		// números entre num1 y num2.
		int solSuma = 0;

		// Creamos la variable max como int para almacenar el mayor número de los
		// introducidos por parametro.
		int max;

		// Creamos la variable min como int para almacenar el menor número de los
		// introducidos por parametro.
		int min;

		// Comprobamos si el num1 es menor o igual que num2, si es asi asiganamos el
		// num1 como minimo y el num2 como maximo.
		if (num1 <= num2) {
			min = num1;
			max = num2;
			// Si no hacemos lo contario.
		} else {
			min = num2;
			max = num1;
		}

		// Creamos este bucle for para recorrer todos los números entre el mas pequeño y
		// mas grande para poder sumarlos y almacenarlos en solSuma.
		for (int i = min; i <= max; i++) {
			solSuma += i;
		}

		// Devolvemos la variable solSuma donde se almacena la suma total de todos los
		// valores.
		return solSuma;
	}
}
