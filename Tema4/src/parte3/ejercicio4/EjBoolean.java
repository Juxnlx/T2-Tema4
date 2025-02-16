package parte3.ejercicio4;

public class EjBoolean {

	/**
	 * Esta función se encarga de calcular si el valor pasado como parametro es 1 o
	 * distinto.
	 * 
	 * @param num El número pasado como parametro.
	 * @return true si el número es 1. False, si es 0 o distinto.
	 */
	public boolean parseToBoolean(int num) {
		// Creamos la variable esUno como boolean para indicar true si el numero es 1 o
		// false si es distinto de 1.
		boolean esUno;

		// Con este ternario asignamos a la variable esUno true o false dependiendo de
		// si se cumple que el número pasada como paramero sea igual a 1.
		esUno = num == 1 ? true : false;

		// Devolvemos la variable donde se almacena es valor.
		return esUno;
	}

	/**
	 * Esta función se encarga de calcular si la cadena pasada como parametro es
	 * true o distinto.
	 * 
	 * @param cadena La cadena pasada como parametro.
	 * @return true, si la cadena es true. False, si la cadena es distinta de true.
	 */
	public boolean parseToBoolean(String cadena) {
		// Creamos la variable esTrue como boolean para indicar true si la cadena es
		// true, false si la cadena es false o distinta a true.
		boolean esTrue;

		// Con este ternario asignamos a la variable esTrue true o false dependiendo de
		// si se cumple que la cadena es true o distinto.
		esTrue = cadena.equalsIgnoreCase("true") ? true : false;

		// Devolvemos la variable donde se almacena es valor.
		return esTrue;
	}
}
