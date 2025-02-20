package parte2.ejercicio4;

public class Pizza {

	/**
	 * Creamos un enumerado para almacenar los tamaños posibles de una pizza.
	 */
	enum Size {
		MEDIANA, FAMILIAR
	}

	/**
	 * Creamos un emumerado para almacenar los tipos de pizza que tenemos.
	 */
	enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	}

	/**
	 * Creamos un enumerado estado para almacenar los distintos tipos en lo que se
	 * encuentra la pizza.
	 */
	enum Estado {
		PEDIDA, SERVIDA
	}

	/**
	 * Creamos el atributo codigo como int para almacenar el codigo significativo
	 * para cada pizza.
	 */
	private int codigo;

	/**
	 * Creamos el atributo size de tipo Size para almacenar el tamaño de la pizza.
	 */
	private Size size = Size.MEDIANA;

	/**
	 * Creamos el atributo tipo de tipo Tipo para almacenar el tipo de pizza que
	 * queremos.
	 */
	private Tipo tipo = Tipo.CUATROQUESOS;

	/**
	 * Creamos el atributo estado de tipo Estado para almacenar el estado en el que
	 * se encuentra la pizza, que de forma prederterminada va a estar en "PEDIDA".
	 */
	private Estado estado = Estado.PEDIDA;

	/**
	 * Creamos un constructor con los parametros codigo, size y tipo.
	 * 
	 * @param codigo El codido identificativo de una pizza.
	 * @param size   El tamaño de la pizza.
	 * @param tipo   EL tipo de la pizza.
	 */
	public Pizza(int codigo, String size, String tipo) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}
		if (size != null) {
			tipoSize(size.toUpperCase());
		}

		if (tipo != null) {
			tiposTipo(tipo.toUpperCase());
		}
	}

	/**
	 * Esta función devuelve el estado de la pizza.
	 * 
	 * @return El estado de la pizza.
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Esta función modifica el estado de la pizza.
	 * 
	 * @param estado El estado en el que se encuentra la pizza.
	 */
	public void setEstado(String estado) {
		compruebaEstado(estado.toUpperCase());
	}

	/**
	 * Esta función devuelve el codigo de la pizza.
	 * 
	 * @return El codigo de la pizza.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Esta función devuelve el tamaño de la pizza.
	 * 
	 * @return El tamaño de la pizza.
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * Esta función devuelve el tipo de la pizza.
	 * 
	 * @return El tipo de la pizza.
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * Esta función se encarga de comprobar si el tamaño introducido es alguno de
	 * los que aparece en el enum.
	 * 
	 * @param size El tamaño introducido por el usuario.
	 */
	private void tipoSize(String size) {
		switch (size) {
		case "FAMILIAR" -> {
			this.size = Size.valueOf(size);
		}
		}
	}

	/**
	 * Esta función se encarga de comprobar si el tipo introducido es alguno de los
	 * que aparece en el enum.
	 * 
	 * @param tipo El tipo introducido por el usuario.
	 */
	private void tiposTipo(String tipo) {
		switch (tipo) {
		case "CUATROQUESOS", "FUNGHI" -> {
			this.tipo = Tipo.valueOf(tipo);
		}

		}
	}

	/**
	 * Esta función se encarga de comprobar si el estado introducido es alguno de
	 * los que aparece en el enum
	 * 
	 * @param estado El estado pasado como parametro.
	 */
	private void compruebaEstado(String estado) {
		switch (estado) {
		case "PEDIDA", "SERVIDA" -> this.estado = Estado.valueOf(estado);
		}
	}

	/**
	 * Esta función se encarga de imprimir una cadena con todos los datos de nuestro
	 * objeto pizza.
	 * 
	 * @return Devolvemos una cadena con todos los datos de una pizza.
	 */
	@Override
	public String toString() {
		// Creamos la variable datosLibro como String para almacenar todos los datos y
		// movimientos de una pizza.
		String datosPizza;

		// Almacenamos en la cadena todos los datos de una pizza.
		datosPizza = this.codigo + ": " + this.size + " - " + this.tipo + " - " + this.estado;

		// Devolvemos la cadena donde se encuentran todos los datos.
		return datosPizza;
	}

	/**
	 * Esta función se encarga de comparar si dos objetos son iguales teniendo en
	 * cuenta el codigo.
	 * 
	 * @param Objeto de heredado de la clase object.
	 * @return true, si son iguales. False si no lo son.
	 */
	@Override
	public boolean equals(Object obj) {
		// Creamos la función sonIguales para comparar si los dos objetos son iguales o
		// no.
		boolean sonIguales = false;

		// Concatenamos el objeto de object a uno de tipo Pizza.
		Pizza pizzas = (Pizza) obj;

		// Comprobamos si los codigos de las dos pizza son iguales, si es así devolvemos
		// true.
		if (this.codigo == pizzas.codigo) {
			sonIguales = true;
		}

		// Devolvemos la variable sonIguales que almacena true o false.
		return sonIguales;
	}

}
