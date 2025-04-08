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
	public Fecha(int dia, int mes, int año) throws DiaException, MesException, YearException {
		if (año <= 0) {
			throw new YearException(); // Lanzamos la excepción si el año es inválido
		}
		if (mes < 1 || mes > 12) {
			throw new MesException(); // Lanzamos la excepción si el mes no es válido
		}
		if (dia < 1 || dia > 31) {
			throw new DiaException(); // Lanzamos la excepción si el día no es válido
		}

		// Comprobamos si la fecha es correcta
		if (!fechaCorrecta()) {
			throw new DiaException(); // Si la fecha no es correcta, lanzamos DiaException
		}

		this.dia = dia;
		this.mes = mes;
		this.año = año;
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
		if ((this.año % 4 == 0 && this.año % 100 != 0) || (this.año % 400 == 0)) {
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

		switch (this.mes) {
		// Comprobamos si el mes de la fecha es enero, marzo, mayo, julio, agosto,
		// octubre o diciembre.
		case 1, 3, 5, 7, 8, 10, 12 -> {
			// Comprobamos si el dia esta entre 1 y 31, si es así la fecha es correcta.
			if (this.dia >= 1 && this.dia <= 31) {
				esCorrecta = true;
			}
			// Comprobamos si el mes es febrero.
		}
		case 2 -> {
			// Comprobamos si el año es bisiesto y el dia esta entre 1 y 29, si es así es
			// correcta la fecha.
			if (esBisiesto() && (this.dia >= 1 && this.dia <= 29)) {
				esCorrecta = true;
				// Comprobamos si el año no es bisiesto y si el dia esta entre 1 y 28, si es así
				// es correcta la fecha.
			} else if (!esBisiesto() && (this.dia >= 1 && this.dia <= 28)) {
				esCorrecta = true;
			}

		}
		// Comprobamos si el mes de la fecha es abril, junio, septiembre o diciembre.
		case 4, 6, 9, 11 -> {
			// Comprobamos si el dia esta entre 1 y 30, si es así la fecha es correcta.
			if (this.dia >= 1 && this.dia <= 30) {
				esCorrecta = true;
			}
		}
		}
		// Devolvemos la varible esCorrecta.
		return esCorrecta;
	}

	/**
	 * Esta función incrementa de forma valida un dia mas en la fecha.
	 */
	public void diaSiguiente() {
		// Incrementamos el dia en mas 1.
		this.dia++;

		// Creamos la variable diaMes como int para alamcenar los dias de cada mes.
		int diaMes = 0;

		// Comprobamos el mes de la fecha.
		switch (this.mes) {

		// En el caso de estos meses establecemos el diaMes a 31.
		case 1, 3, 5, 7, 8, 10, 12 -> {
			diaMes = 31;
		}
		// En el caso de febrero debemos de comprobar si el año es bisiesto y en ese
		// caso diaMes es 29 0 28.
		case 2 -> {
			if (esBisiesto()) {
				diaMes = 29;
			} else {
				diaMes = 28;
			}
		}

		// En el caso del resto de meses establecemos diaMes a 30.
		case 4, 6, 9, 11 -> {
			diaMes = 30;
		}
		}

		// Comprobamos si el dia de la fecha es mayor al maximo del mes, en ese caso dia
		// lo ponemos a 1 e incrementamos el mes.
		if (this.dia > diaMes) {
			this.dia = 1;
			mes++;
		}

		// Comprobamos si el mes es mayor que 12, en ese caso mes lo ponemos a 1 (Enero)
		// y incrementamos en +1 el año.
		if (this.mes > 12) {
			this.mes = 1;
			this.año++;
		}

	}

	/**
	 * Esta función se encarga de imprimir la fecha en un formato especifico
	 * dd/mm/aaaa.
	 * 
	 * @return Una cadena donde se almacena la decha.
	 */
	@Override
	public String toString() {
		// Creamos la variable sol como String para almacenar el formato en el que vamos
		// a imprimir la fecha.
		String sol = "";

		if (this.dia >= 1 && this.dia <= 9) {
			sol += "0" + this.dia + "-";
		} else {
			sol += this.dia + "-";
		}

		if (this.mes >= 1 && this.mes <= 9) {
			sol += "0" + this.mes + "-";
		} else {
			sol += this.mes + "-";
		}

		sol += this.año;

		// Devolvemos la variable sol donde se encuentra el formato de impresión de la
		// fecha.
		return sol;
	}

}
