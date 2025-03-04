package parte4.ejercicio1_1;

public class Hora {

	/**
	 * Declaramos el atributo hora como int para almacenar la hora de una hora.
	 */
	private int hora;

	/**
	 * Declaramos el atributo minuto como int para almacenar los minutos de un hora.
	 */
	private int minuto;

	/**
	 * Declaramos el atributo segundo como int para almacenar los segundos de un
	 * hora.
	 */
	private int segundo;

	/**
	 * Creamos un constructor con todos los atributos.
	 * 
	 * @param hora    Las horas de una hora.
	 * @param minuto  Los minutos de una hora.
	 * @param segundo Los segundos de una hora.
	 */
	public Hora(int hora, int minuto, int segundo) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}

		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}

		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		}
	}

	/**
	 * Esta función nos devuelve las hora de una hora.
	 * 
	 * @return Las horas de una hora.
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Esta función nos permite modificar las horas de una hora.
	 * 
	 * @param hora Las hora de una hora.
	 */
	public void setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
	}

	/**
	 * Esta función nos devuelve los minutos de una hora.
	 * 
	 * @return Los minutos de una hora.
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Esta función nos permite modificar los minutos de una hora.
	 * 
	 * @param minuto Los minutos de una hora.
	 */
	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}

	/**
	 * Esta función nos devuelve los segundo de una hora.
	 * 
	 * @return Los segundoss de una hora.
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Esta función nos permite modificar los segundos de una hora.
	 * 
	 * @param segundo Los segundos de una hora.
	 */
	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
		}
	}

	public void incrementarHora() {
		this.segundo++;

		if (this.segundo == 60) {
			this.segundo = 0;
			this.minuto++;
		}

		if (this.minuto == 60) {
			this.minuto = 0;
			this.hora++;
		}

		if (this.hora == 24) {
			this.hora = 0;
		}
	}

	/**
	 * Esta función se encarga de añadir a una cadena la forma en la que queremos
	 * que se muestre nuestra hora.
	 * 
	 * @return sol La cadena donde se alamcena la solución.
	 */
	@Override
	public String toString() {

		// Creamos la variable sol como String para almacenar la hora con un minuto
		// incrementado.
		String sol;

		sol = this.hora + ":" + this.minuto + ":" + this.segundo;

		return sol;
	}

}
