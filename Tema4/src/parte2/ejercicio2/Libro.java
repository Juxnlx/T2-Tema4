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
	 * Esta función se encarga de modificar el atributo de libros prestados segun la cantida
	 * @param librosPrestados
	 * @return
	 */
	public boolean prestamo(int librosPrestados) {
		// Creamos la variable esPrestado como boolean para indicar true si se ha podido
		// prestar, false en caso de que no.
		boolean esPrestado = false;

		// Comprobamos si los libros prestados mas la cantidad que se van a prestar no
		// sobrepasa los ejemplares existentes.
		if (this.ejemplares >= this.prestados + librosPrestados) {
			esPrestado = true;
		}

		// Devolvemos esPrestado
		return esPrestado;
	}
	
	public boolean devolucion (int librosDevolver) {
		//Creamos la variable esDevolucion
	}
}
