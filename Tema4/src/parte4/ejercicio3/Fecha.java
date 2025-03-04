package parte4.ejercicio3;

public class Fecha {

	/**
	 * Creamos el atributo dia como int para almacenar el dia de una fecha.
	 */
	private int dia;

	/**
	 * Creamos el atributo mes como int para almacenar el mes de una fecha.
	 */
	private int mes;

	/**
	 * Creamso el atributo año como int para almacenar el año de una fecha.
	 */
	private int año;

	/**
	 * Creamos un constructor con todos los atributos.
	 * 
	 * @param dia El dia de una fecha.
	 * @param mes El mes de una fecha.
	 * @param año El año de una fecha.
	 */
	public Fecha(int dia, int mes, int año) {
		if (this.año > 0) {
			this.año = año;
		}
		if (this.mes >= 1 && this.mes <= 12) {
			this.mes = mes;
		}

		if (this.dia >= 1 && this.dia <= 31) {
			this.dia = dia;
		}
	}

	/**
	 * Esta función nos devuelve el dia de una fecha.
	 * 
	 * @return El dia de una fecha.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Esta función nos permite modificar el dia de una fecha.
	 * 
	 * @param dia El nuevo dia por el que vamos a modificar al fecha.
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Esta función nos devuelve el mes de una fecha.
	 * 
	 * @return El mes de una fecha.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Esta función nos permite modificar el mes de una fecha.
	 * 
	 * @param mes El nuevo mes por el que vamos a modificar la fecha.
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Esta función nos devuelve el año de una fecha.
	 * 
	 * @return El año de una fecha.
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Esta función nos permite modificar el año de una fecha.
	 * 
	 * @param año El nuevo año por el que vamos a modificar la fecha.
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Esta función se encarga de comprobar si el año es bisiesto o no.
	 * 
	 * @return true si el año es bisiesto. False si no es bisiesto.
	 */
	public boolean esBisiesto() {
		// Creamos la variable bisiesto como boolean para almacenar si el año de la
		// fecha es o no bisiesto.
		boolean bisiesto = false;

		// Comprobamos si el año es divisible entre 4, si es así, significa que el año
		// es bisiesto por lo tanto devolvemos true.
		if (this.año % 4 == 0) {
			bisiesto = true;
		}

		// Devolvemos la variable bisiesto.
		return bisiesto;
	}

	/**
	 * Esta función se encarga de comprobar si la fecha es correcta o no.
	 * 
	 * @return true si la fecha es correcta. False si no es correcta.
	 */
	public boolean fechaCorrecta() {
		// Creamos la variable esCorrecta como boolean para almacenar si la fecha es
		// correcta o no.
		boolean esCorrecta = false;

		// Comprobamos si el año es mayor que 0.
		if (this.año > 0) {
			// Comprobamos si el mes de la fecha es enero, marzo, mayo, julio, agosto,
			// octubre o diciembre.
			if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10
					|| this.mes == 12) {
				// Comprobamos si el dia esta entre 1 y 31, si es así la fecha es correcta.
				if (this.dia >= 1 && this.dia <= 31) {
					esCorrecta = true;
				}
				// Comprobamos si el mes es febrero.
			} else if (this.mes == 2) {
				// Comprobamos si el año es bisiesto y el dia esta entre 1 y 29, si es así es
				// correcta la fecha.
				if (esBisiesto() && (this.dia >= 1 && this.dia <= 29)) {
					esCorrecta = true;
					// Comprobamos si el año no es bisiesto y si el dia esta entre 1 y 28, si es así
					// es correcta la fecha.
				} else if (!esBisiesto() && (this.dia >= 1 && this.dia <= 28)) {
					esCorrecta = true;
				}

				// Comprobamos si el mes de la fecha es abril, junio, septiembre o diciembre.
			}
			if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
				// Comprobamos si el dia esta entre 1 y 30, si es así la fecha es correcta.
				if (this.dia >= 1 && this.dia <= 30) {
					esCorrecta = true;
				}
			}
		}
		// Devolvemos la varible esCorrecta.
		return esCorrecta;
	}
	
	public void diaSiguiente() {
		this.dia++;
		
		if (this.dia == )
	}

	/**
	 * Esta función almacena en una variable 
	 */
	@Override
	public String toString() {
		
	}
	
}
