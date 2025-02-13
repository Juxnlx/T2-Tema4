package parte2.ejercicio3;

public class Alumno {

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del alumno.
	 */
	private String nombre;

	/**
	 * Creamos el atributo notaMedia como double para almacenar la nota media del
	 * alumno.
	 */
	private double notaMedia;

	/**
	 * Constructor con el nombre y notaMedia pasado como parametro.
	 * 
	 * @param nombre    El nombre del alumno.
	 * @param notaMedia La notaMedia del alumno.
	 */
	public Alumno(String nombre, double notaMedia) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	/**
	 * Esta función devuelve el nombre del alumno.
	 * 
	 * @return EL nombre del alumno.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Esta fución se encarga de modificar el nombre del alumno.
	 * 
	 * @param nombre El nombre del alumno.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Esta función devuelve la nota media del alumno.
	 * 
	 * @return La nota media del alumno.
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Esta función se encarga de modificar la notaMedia del alumno.
	 * 
	 * @param notaMedia La nota media del alumno.
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	/**
	 * Esta función se encarga de devolver los datos del alumno.
	 * 
	 * @return Una cadena donde se almacena los datos del alumno.
	 */
	@Override
	public String toString() {
		// Creamos la variable datosAlumnos como String para almacenar los datos del
		// alumno.
		String datosAlumnos;

		// Almacenamos en la cadena datosAlumnos el nombre y la nota media del alumno.
		datosAlumnos = this.nombre + " " + this.notaMedia;

		// Devolvemos la cadena.
		return datosAlumnos;
	}

	/**
	 * Esta función se encarga de comparar si dos objetos son iguales teniendo en
	 * cuenta si el nombre es igual.
	 * 
	 * @param Objeto heredado de la clase object.
	 * @return true, si son iguales. False si no lo son.
	 */
	@Override
	public boolean equals(Object obj) {
		// Creamos la función sonIguales para comparar si los dos objetos son iguales o
		// no.
		boolean sonIguales = false;

		// Concatenamos el objeto de object a uno de tipo Alumno.
		Alumno alum = (Alumno) obj;

		// Comprobamos si los nombres son iguales, si es así devolvemos true.
		if (this.nombre.equals(alum.nombre)) {
			sonIguales = true;
		}

		// Devolvemos la variable sonIguales que almacena true o false.
		return sonIguales;
	}

}
