package parte4.ejercicio2;

public class Contador {

	/**
	 * Creamos el atributo cont como int para almacenar la cantidad que vamos
	 * incrementando y decrementando,
	 */
	private int cont;

	public Contador(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}

	/**
	 * Creamos esta función para leer el valor del cont.
	 * 
	 * @return El valor del contador.
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * Esta función se encarga de incremntar en +1 el contador.
	 */
	public void incrementar() {
		this.cont++;
	}

	/**
	 * Esta función se encarga de decrementar en -1 el contador-
	 */
	public void decrementar() {
		// Comprobamos si el contador es mayor que 0 si es así, podemos decrementar en
		// -1 el contador.
		if (this.cont > 0) {
			this.cont--;
		}
	}

	/**
	 * Esta función se encarga de almacenar en una variable el valor del contador.
	 * 
	 * @return sol Cadena donde se encuentra el valor del contador.
	 */
	@Override
	public String toString() {
		// Creamos la variable sol como String para almacenar el valar del contador.
		String sol;

		sol = "Contador: " + this.cont;

		return sol;
	}

}
