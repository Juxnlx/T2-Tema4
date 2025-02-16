package parte3.ejercicio2;

public class Media {

	/**
	 * Esta función se encarga de calcular la media de dos números pasados como
	 * parametro.
	 * 
	 * @param num1 El número 1 pasado como parametro.
	 * @param num2 El número 2 pasado como parametro.
	 * @return La media de los dos números pasados como parametro.
	 */
	public double media(int num1, int num2) {
		// Creamos la variable solMedia como double para almacenar el valor de la media
		// de los dos números pasados como parametro.
		double solMedia;

		// Llevamos a cabo la suma de los dos números y el resultado lo dividimos entre
		// 2 para obtener la media.
		solMedia = (double) (num1 + num2) / 2;

		// Devolvemos el resultado de la media.
		return solMedia;
	}

	/**
	 * Esta función se encarga de calcular la media de tres números pasados como
	 * parametro.
	 * 
	 * @param num1 El número 1 pasado como parametro.
	 * @param num2 El número 2 pasado como parametro.
	 * @param num3 El número 3 pasado como parametro.
	 * @return La media de los tres números pasados como parametro.
	 */
	public double media(int num1, int num2, int num3) {
		// Creamos la variable solMedia como double para almacenar el valor de la media
		// de los tres números pasados como parametro.
		double solMedia;

		// Llevamos a cabo la suma de los tres números y el resultado lo dividimos entre
		// 3 para obtener la media.
		solMedia = (double) (num1 + num2+ num3) / 3;

		// Devolvemos el resultado de la media.
		return solMedia;
	}
}
