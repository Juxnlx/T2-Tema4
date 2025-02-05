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

}
