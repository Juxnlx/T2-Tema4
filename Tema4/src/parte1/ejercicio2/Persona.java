package parte1.ejercicio2;

/**
 * Creamos la clase Persona para alamcenar los atributos de los que cosnta una
 * persona.
 */
public class Persona {

	// Creamos la varible dni como String para almacenar el dni de la persona.
	private String dni;

	// Creamos la variable nombre como String para almacenar el nombre de la
	// persona.
	private String nombre;

	// Creamos la variable apellidos como String para almacenar el apellido de la
	// persona.
	private String apellido;

	// Creamos la variable edad como int para almacenar la edad de la persona.
	private int edad;

	/**
	 * Creamos un constructor con parametros.
	 * 
	 * @param dni      DNI de la persona.
	 * @param nombre   Nombre de la persona.
	 * @param apellido Apellido de la persona.
	 * @param edad     Edad de la persona.
	 */
	public Persona(String dni, String nombre, String apellido, int edad) {
		// Comprobamos si el dni no esta a null ni vacio.
		if (dni != null && !dni.isEmpty()) {
			this.dni = dni;
		}

		// Comprobamos si el nombre no esta a null ni vacio.
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		// Comprobamos si el apellido no esta a null ni vacio.
		if (apellido != null && !apellido.isEmpty()) {
			this.apellido = apellido;
		}

		// Comprobamos si la edad es mayor que 0.
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Devueve el nombre de la persona.
	 * 
	 * @return El nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre de la persona.
	 * 
	 * @param nombre El nombre de la persona. Comprobando que no sea null ni cadena
	 *               vacia.
	 */
	public void setNombre(String nombre) {
		// Comprobamos si el nombre no esta a null ni vacio.
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Devuelve el apellido de la persona.
	 * 
	 * @return El apellido de la persona.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Modifica el apellido de la persona.
	 * 
	 * @param apellido El apellido de la persona. Se comprueba que no sea null ni
	 *                 cadena vacia.
	 */
	public void setApellido(String apellido) {
		// Comprobamos si el apellido no esta a null ni vacio.
		if (apellido != null && !apellido.isEmpty()) {
			this.apellido = apellido;
		}
	}

	/**
	 * Devuelve la edad de la persona
	 * 
	 * @return La edad de la persona.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Modifica la edad de la persona.
	 * 
	 * @param edad La edad de la persona. Comprobando que sea mayor que 0.
	 */
	public void setEdad(int edad) {
		// Comprobamos si la edad es mayor que 0.
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Devuelve el dni de la persona.
	 * 
	 * @return El dni de la persona.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Esta función se encarga de comprobar si la edad de la persona es mayor o no
	 * de edad.
	 * 
	 * @return mayorEdad. True si esa persona es mayor de edad. False si esa persona
	 *         es menor de edad.
	 */
	public boolean esMayorEdad() {
		// Creamos la variable mayorEdad como boolean para devolver true si es mayor de
		// edad, false si no lo es.
		boolean mayorEdad;

		// Con el ternario comprobamos si la edad es mayor o menor de edad, true si es o
		// no y false si no lo es. Almacenamos lo que nos devuelva en mayorEdad.
		mayorEdad = this.edad >= 18 ? true : false;

		// Devolvemos la variable donde se almacena true o false si es mayor o menor de
		// edad esa persona.
		return mayorEdad;
	}

	/**
	 * Esta función se encarga de comprobar si una persona es jubilada comprobando
	 * si una persona tiene mas de 65 años.
	 * 
	 * @return
	 */
	public boolean esJubilado() {
		// Creamos la variable esJubilado como boolean para almacenar true o false.
		boolean esJubilado;

		// Con un ternario comprobamos si la persona es mayor de 65 años o no, true si
		// tiene mas, false si no.
		esJubilado = this.edad >= 65 ? true : false;

		// Devolvemos la variable esJubilado donde se almacena true o false si es mayor
		// o menor de 65 esa persona.
		return esJubilado;
	}

	/**
	 * Esta función se encarga de calcular la edad entre la edad de la persona
	 * actual y edad de la persona pasada como parametro.
	 * 
	 * @param p El objeto de una nueva persona pasada como parametro.
	 * @return diferencia. La diferencia entre una edad y la otra.
	 */
	public int diferenciaEdad(Persona p) {
		// Creamos la variable diferencia como int para almacenar la diferencia de edad
		// entre la persona y la pasada como parametro.
		int diferencia;

		// Comprobamos si la edad de la persona actual es mayor o igual a la pasada como
		// parametro de otra persona.
		if (this.edad >= p.getEdad()) {
			// Almacenamos en diferencia, la diferencia entre la edad de la persona y de la
			// persona pasada como parametro.
			diferencia = this.edad - p.getEdad();

			// Si no...
		} else {
			// Almacenamos en diferencia, la diferencia de edad entre la persona pasada como
			// parametro y la actual.
			diferencia = p.getEdad() - this.edad;
		}

		// Devolvemos la diferencia entre edad de las dos personas.
		return diferencia;
	}

	public String toString() {
		// Creamos la variable persona como String para almacenar los datos de la
		// persona.
		String persona;

		// Almacenamos en persona todo lo que vamos a imprimir.
		persona = "DNI: " + this.dni;
		persona += "\nNombre: " + this.nombre;
		persona += "\nApellidos: " + this.apellido;
		persona += "\nEdad: " + this.edad;

		// Devolvemos los datos de una persona almacenados en persona.
		return persona;
	}
}
