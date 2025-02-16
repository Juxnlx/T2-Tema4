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

			// CASO RECURSIVO - La ecuación seria el número menos la llamada a la propia
			// función como parametro numero -1.
		} else {
			sol = numero - sumatorio(numero - 1);
		}

		// Devolvemos la variable sol, donde se almacena la suma de todos los números.
		return sol;
	}

	public static double potencia(double a, int n) {
		// Creamos la variable sol como double para almacenar la potencia de a.
		double sol;
		
		if (n == 0) {
			sol = 1;
		} else {
			sol = a * Math.pow(a, n-1);
		}
		
		//Devolvemos la variable a, donde se almacena la potencia de a.
		return sol;
	}
}
