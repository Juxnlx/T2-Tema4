package parte2.ejercicio2;

public class Libro {

	/**
	 * Creamos el enum Generos donde almacenamos todos los generos posibles de los
	 * libros.
	 */
	enum Generos {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	};

	/**
	 * Creamos el atributo titulo como String para almacenar el titulo de el libro.
	 */
	private String titulo;

	/**
	 * Creamos el atributo autor como String para almacenar el autor de el libro.
	 */
	private String autor;

	/**
	 * Creamos el atributo ejemplares como int para almacenar la cantidad de
	 * ejemplares que hay de un libro.
	 */
	private int ejemplares;

	/**
	 * Creamos el atributo prestados como int para almacenar la cantidad de libros
	 * que se han prestado.
	 */
	private int prestados;

	/**
	 * Creamos el atributo genero de tipo Generos para almacenar algunos de los
	 * tipos de genero.
	 */
	private Generos genero = Generos.NARRATIVO;

	/**
	 * Constructor con parametros titulo y autor.
	 * 
	 * @param titulo El titulo de un libro.
	 * @param autor  El autor de un libro.
	 */
	public Libro(String titulo, String autor) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}

	/**
	 * Constructor con los siguientes parametros, titulo, autor, ejemplares y
	 * prestados.
	 * 
	 * @param titulo     El titulo de un libro.
	 * @param autor      El autor de un libro.
	 * @param ejemplares La cantidad de libros que hay en total.
	 * @param prestados  La cantidad de libros que se han prestado.
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados >= 0) {
			this.prestados = prestados;
		}
	}

	/**
	 * Constructor con los siguientes parametros, titulo, autor, ejemplares,
	 * prestados y genero.
	 * 
	 * @param titulo     El titulo de un libro.
	 * @param autor      El autor de un libro.
	 * @param ejemplares La cantidad de libros que hay en total.
	 * @param prestados  La cantidad de libros que se han prestado.
	 * @param genero     El genero de de cada libro.
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
		if (prestados >= 0) {
			this.prestados = prestados;
		}
		if (genero != null) {
			tipoGenero(genero.toUpperCase());
		}
	}

	/**
	 * Devolvemos los ejemplares de libros que tenemos.
	 * 
	 * @return La cantidad que tenemos de un mismo libro.
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Modificamos los ejemplares de libros que tenemos.
	 * 
	 * @param ejemplares La cantidad que tenemos de un mismo libro.
	 */
	public void setEjemplares(int ejemplares) {
		if (ejemplares >= 0) {
			this.ejemplares = ejemplares;
		}
	}

	/**
	 * Devolvemos la cantidad de libros prestados.
	 * 
	 * @return La cantidad de libros prestados
	 */
	public int getPrestados() {
		return prestados;
	}

	/**
	 * Modificamos la cantidad de libros prestados.
	 * 
	 * @param prestados La cantidad de libros prestados.
	 */
	public void setPrestados(int prestados) {
		if (prestados >= 0) {
			this.prestados = prestados;
		}
	}

	/**
	 * Devolvemos el titulo del libro
	 * 
	 * @return El titulo del libro.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Devolvemos el autor del libro.
	 * 
	 * @return El autor del libro.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Devolvemos el genero del libro.
	 * 
	 * @return El genero del libro.
	 */
	public Generos getGenero() {
		return genero;
	}

	/**
	 * Esta función se encarga de comprobar si el genero introducido es alguno de
	 * los que aparece en el enum.
	 * 
	 * @param genero El genero introducido por el usuario.
	 */
	private void tipoGenero(String genero) {
		switch (genero) {
		case "LIRICO", "DRAMATICO", "DIDACTICO", "POETICO" -> {
			this.genero = Generos.valueOf(genero);
		}
		}
	}

	/**
	 * Esta función se encarga de modificar el atributo de libros prestados segun la
	 * cantida
	 * 
	 * @param librosPrestados La cantidad de libros que vamos a prestar.
	 * @return true si se han podido prestar, false si no se han podido.
	 */
	public boolean prestamo(int librosPrestados) {
		// Creamos la variable esPrestado como boolean para indicar true si se ha podido
		// prestar, false en caso de que no.
		boolean esPrestado = false;

		// Comprobamos si los libros prestados mas la cantidad que se van a prestar no
		// sobrepasa los ejemplares existentes.
		if (this.ejemplares >= this.prestados + librosPrestados) {
			// Añadimos la cantidad de libros que se van a prestar a la variable prestados.
			this.prestados += librosPrestados;
			// Ponemos esPrestado a true.
			esPrestado = true;
		}

		// Devolvemos esPrestado
		return esPrestado;
	}

	/**
	 * Esta función se encarga de modificar la variable prestados actualizando la
	 * cantidad segun los que se han devuelto.
	 * 
	 * @param librosDevolver La cantidad de libros que vamos a devolver.
	 * @return true si se han podido devolver, false si no se han podido.
	 */
	public boolean devolucion(int librosDevolver) {
		// Creamos la variable esDevolucion como boolean para indicar true si se ha
		// podido devolver, false si no se puede.
		boolean esDevuelto = false;

		// Comprobamos si los libros que tenemos prestados son mas de los que vamos a
		// devolver, porque en caso contrario no se podrian devolver mas libros de los
		// que tienes prestados.
		if (this.prestados >= librosDevolver) {
			// Restamos la cantidad de libros prestados ya que han sido devueltos.
			this.prestados -= librosDevolver;
			// Indicamos que la devolución ha sido posible devolviendo la variable a true.
			esDevuelto = true;
		}

		// Devolvemos esDevuelto
		return esDevuelto;
	}

	/**
	 * Esta función se encarga de imprimir una cadane con todos los datos de nuestro
	 * objeto libro.
	 * 
	 * @return Devolvemos una cadena con todos los datos de un libro.
	 */
	@Override
	public String toString() {
		// Creamos la variable datosLibro como String para almacenar todos los datos y
		// movimientos de un libro.
		String datosLibro;

		// Almacenamos en la cadena todos los datos de un libro.
		datosLibro = "Titulo: " + this.titulo + "\n";
		datosLibro += "Autor: " + this.autor + "\n";
		datosLibro += "Ejemplares: " + this.ejemplares + "\n";
		datosLibro += "Cant libros prestados: " + this.prestados + "\n";
		datosLibro += "Genero: " + this.genero;

		// Devolvemos la cadena donde se encuentran todos los datos.
		return datosLibro;
	}

	/**
	 * Esta función se encarga de comparar si dos objetos son iguales teniendo en
	 * cuenta el titulo y el autor.
	 * 
	 * @param Objeto de heredado de la clase object.
	 * @return true, si son iguales. False si no lo son.
	 */
	@Override
	public boolean equals(Object obj) {
		// Creamos la función sonIguales para comparar si los dos objetos son iguales o
		// no.
		boolean sonIguales = false;

		// Concatenamos el objeto de object a uno de tipo Libro.
		Libro libros = (Libro) obj;

		// Comprobamos si los titulos y los autores de los dos libros son iguales, si es
		// así devolvemos true.
		if (this.titulo.equals(libros.titulo) && this.autor.equals(libros.autor)) {
			sonIguales = true;
		}

		// Devolvemos la variable sonIguales que almacena true o false.
		return sonIguales;
	}
}
