package parte4.ejercicio1;

public class Disco {

	/**
	 * Creamos el enum Generos para almacenar los tipos de generos disponibles.
	 */
	enum Generos {
		ROCK, POP, JAZZ, BLUES
	}

	/**
	 * Creamos el atributo codigo como int para almacenar el codigo del disco.
	 */
	private int codigo;

	/**
	 * Creamos el atributo autor como String para almacenar el autor del disco.
	 */
	private String autor;

	/**
	 * Creamos el atributo titulo como String para almacenar el titulo del disco
	 */
	private String titulo;

	/**
	 * Creamos el atributo duración como int para almacenar la duración del disco.
	 */
	private double duracion;

	/**
	 * Creamos el atributo genero como String para almacenar el genero del disco.
	 */
	private Generos genero;

	/**
	 * Creamos un constructor con solo el codigo como parametro.
	 * 
	 * @param codigo El codigo del disco pasado como parametro.
	 */
	public Disco(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}

	/**
	 * Creamos un constructor con todos los parametros.
	 * 
	 * @param codigo   El codigo del disco.
	 * @param autor    El autor del disco.
	 * @param titulo   El titulo del disco.
	 * @param duracion La duración del disco.
	 * @param genero   El genero del disco.
	 */
	public Disco(int codigo, String autor, String titulo, double duracion, String genero) {
		if (codigo > 0) {
			this.codigo = codigo;
		}

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

		if (duracion > 0) {
			this.duracion = duracion;
		}

		if (genero != null)
			tipoGenero(genero);
	}

	/**
	 * Esta función se encarga de comprobar si el estado introducido pertenece a
	 * algun genero del enum.
	 * 
	 * @param genero El genero pasado como parametro.
	 */
	private void tipoGenero(String genero) {

		switch (genero) {
		case "ROCK", "POP", "JAZZ", "BLUES" -> {
			this.genero = Generos.valueOf(genero);
		}
		}
	}

	/**
	 * Esta función devuelve el codigo de un disco.
	 * 
	 * @return El codifo del disco.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Esta función devuelve el autor de un disco.
	 * 
	 * @return El codigo de un disco.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Esta función devuelve el titulo de un disco.
	 * 
	 * @return El titulo de un disco.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Esta función devuelve la duración de un disco.
	 * @return
	 */
	public double getDuracion() {
		return duracion;
	}

	public Generos getGenero() {
		return genero;
	}

}
