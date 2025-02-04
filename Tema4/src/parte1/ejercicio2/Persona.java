package parte1.ejercicio2;

/**
 * Creamos la clase Persona para alamcenar los atributos de los que cosnta una
 * persona.
 */
public class Persona {

	// Creamos la varible dni como String para almacenar el dni de la persona.
	String dni;

	// Creamos la variable nombre como String para almacenar el nombre de la
	// persona.
	String nombre;

	// Creamos la variable apellidos como String para almacenar el apellido de la
	// persona.
	String apellido;

	// Creamos la variable edad como int para almacenar la edad de la persona.
	int edad;

	/**
	 * Creamos un constructor con parametros.
	 * 
	 * @param dni      DNI de la persona.
	 * @param nombre   Nombre de la persona.
	 * @param apellido Apellido de la persona.
	 * @param edad     Edad de la persona.
	 */
	public Persona(String dni, String nombre, String apellido, int edad) {
		//Comprobamos si el dni no esta a null ni vacio.
		if (dni != null && !dni.isEmpty()) {
			this.dni = dni;
		}
		
		//Comprobamos si el nombre no esta a null ni vacio.
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		//Comprobamos si el apellido no esta a null ni vacio.
		if (apellido != null && !apellido.isEmpty()) {
			this.apellido = apellido;
		}
		
		//Comprobamos si la edad es mayor que 0.
		if (edad > 0) {
			this.edad = edad;
		}
	}

}
