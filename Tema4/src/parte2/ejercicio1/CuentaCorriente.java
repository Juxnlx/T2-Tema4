package parte2.ejercicio1;

public class CuentaCorriente {

	/**
	 * Creamos el enum Nacionalidad para almacenar las dos nacionalidades posibles.
	 */
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	/**
	 * Creamos el atributo dni como String para almacenar el dni de la persona.
	 */
	private String dni;

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre de la
	 * persona.
	 */
	private String nombre = "";

	/**
	 * Creamos el atributo saldo como double para almacenar el saldo de la cuenta de
	 * la persona.
	 */
	private double saldo;

	/**
	 * Creamos el atributo nación para almacenar de forma predeterminada la
	 * nacionalidad española.
	 */
	private Nacionalidad nacion = Nacionalidad.ESPAÑOLA;

	/**
	 * Creamos un constructor con los siguientes parametros dni y saldo.
	 * 
	 * @param dni   El dni de la persona.
	 * @param saldo El saldo de la persona.
	 */
	public CuentaCorriente(String dni, double saldo) {
		// Comprobamos si el dni no esta a null ni vacio.
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		// Comprobamos si el saldo es mayor que 0.
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	/**
	 * Creamos un constructor con los siguientes parametros dni, nombre y saldo.
	 * 
	 * @param dni    El dni de la persona.
	 * @param nombre El nombre de la persona.
	 * @param saldo  El saldo de la persona.
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {

		// Comprobamos si el dni no esta a null ni vacio.
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		// Comprobamos si el nombre no esta a null ni vacio.
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		// Comprobamos si el saldo es mayor que 0.
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	/**
	 * Creamos un constructor con los siguientes parametros dni, nombre, saldo y
	 * nacion.
	 * 
	 * @param dni    El dni de la persona
	 * @param nombre El nombre de la persona.
	 * @param saldo  El saldo de la persona.
	 * @param nacion La nación a la que pertenece la persona.
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, String nacion) {

		// Comprobamos si el dni no esta a null ni vacio.
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		// Comprobamos si el nombre no esta a null ni vacio.
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		// Comprobamos si el saldo es mayor que 0.
		if (saldo > 0) {
			this.saldo = saldo;
		}

		// Comprobamos si la nación es extranjera.
		if (nacion.equalsIgnoreCase("extranjera")) {
			this.nacion = Nacionalidad.EXTRANJERA;
		}
	}

	/**
	 * Nos devuelve el nombre de la persona.
	 * 
	 * @return El nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Nos permite modificar el nombre de la persona.
	 * 
	 * @param nombre El nombre de la persona.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Nos devuelve la nación a la que pertenece la persona.
	 * 
	 * @return La nacionalidad de la persona.
	 */
	public Nacionalidad getNacion() {
		return nacion;
	}

	/**
	 * Nos permite modificar la nacionalidad de una persona.
	 * 
	 * @param nacion La nacionalidad de una persona.
	 */
	public void setNacion(String nacion) {
		if (nacion.equalsIgnoreCase("extranjera")) {
			this.nacion = Nacionalidad.EXTRANJERA;
		}
	}

	/**
	 * Nos devuelve el dni de la persona.
	 * 
	 * @return El dni de la persona.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Nos devuelve el saldo de la persona.
	 * 
	 * @return EL saldo de la persona.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Esta función nos permite sacar dinero modificando el saldo de la cuenta de la
	 * persona.
	 * 
	 * @param dinero El dinero de la persona.
	 * @return true, si se ha podido sacar el dinero. false si no se ha podido sacar
	 *         dinero.
	 */
	public boolean sacarDinero(double dinero) {
		// Creamos la variable retirada como boolean para indicar cuando ha sido posible
		// sacar o no dinero.
		boolean retirada = false;

		// Comprobamos si el saldo es mayor que el dinero que se desea retirar, si es
		// así, se actualiza el saldo de la cuenta y se devuelve true.
		if (this.saldo > dinero) {
			this.saldo -= dinero;
			retirada = true;
		}

		// Devolvemos true o false dependiendo de si se ha podido o no llevar a cabo la
		// retirada de dinero.
		return retirada;
	}

	/**
	 * Esta función se encarga en ingresar dinero modificando el saldo de la cuenta
	 * de la persona.
	 * 
	 * @param dinero El dinero de la persona.
	 * @return true, si se ha podido ingresar dinero. false, si no se ha podido.
	 */
	public boolean ingresarDinero(double dinero) {
		// Creamos la variable ingreso como boolean para indicar si ha sido posible
		// ingresar o no dinero.
		boolean ingreso = false;

		// Comprobamos si el dinero introducido como parametro es mayor que 0, si es así
		// actualizamos el saldo de la cuenta y indicamos que se ha podido efectuar el
		// ingreso.F
		if (dinero > 0) {
			this.saldo += dinero;
			ingreso = true;
		}

		// Devolvemos true o false dependiendo de si se ha podido o no llevar a cabo el
		// ingreso de dinero.
		return ingreso;
	}

	@Override
	public String toString() {
		// Creamos la variable datosCuenta como String para almacenar todos los datos de
		// la cuenta de una persona.
		String datosCuenta;

		// Almacenamos en la cadena todos los datos de una cuenta.
		datosCuenta = "DNI: " + this.dni + "\n";
		datosCuenta += "Nombre: " + this.nombre + "\n";
		datosCuenta += "Saldo: " + this.saldo + "\n";
		datosCuenta += "Nacionalidad: " + this.nacion;

		// Devolvemos la cadena donde se encuentran todos los datos.
		return datosCuenta;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		CuentaCorriente cuenta = (CuentaCorriente) obj;
		
		if (this.dni.equals(cuenta.dni) && this.nombre.equals(cuenta.nombre)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
}
