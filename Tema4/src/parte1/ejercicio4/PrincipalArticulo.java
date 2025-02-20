package parte1.ejercicio4;

import java.util.Scanner;

/**
 * Esta clase crea dos objetos Articulo con distintos datos cada uno e
 * imprimimos su precio final y luego lo volvemos a mostrar pero con el precio
 * cambiado, eso de cada articulo.
 */
public class PrincipalArticulo {
	// Creamos el Scanner como static para poder leer datos introducidos por el
	// usuario en todos las funciones donde se precise.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Nos creamos un objeto de la clase ArticuloCRUD para recorrer el conjunto..
		ArticuloCRUD listaArtic = new ArticuloCRUD();

		// Nos creamos el objeto de tipo Articulo para almacenar algun objeto de forma
		// temporal.
		Articulo articulo;

		// Creamos la variable opcion como char para almacenar la opción seleccionada
		// por el usuario para el menú.
		char opcion;

		// Creamos la variable nombreArticulo como String para almacenar el nombre
		// introducido por el usuario de forma temporal, en las funciones que se
		// requiera.
		String nombreArticulo = "";

		// Creamos la variable precioArticulo como double para almacenar el precio
		// introducido por el usurio.
		double precioArticulo;

		// Creamos la variable stock como int para almacenar la cantidad de producto a
		// incrementar o decrementar.
		int stock;

		do {
			// Mostramos el menú llamando a la función.
			mostrarMenu();
			// Leemos la opción seleccionada por el usuario.
			opcion = sc.nextLine().toLowerCase().charAt(0);

			// Segun la opción seleccionada del menú...
			switch (opcion) {

			// Listar articulos...
			case 'a' -> {
				// Llamamos a la función listarArticulos para imprimir todos los articulos
				// disponibles hasta el momento.
				listaArtic.listarArticulos();
			}

			// Crear nuevo articulo...
			case 'b' -> {
				// Almacenamos en el objeto articulo el objeto que nos devuelve la función
				// altaArticulo.
				articulo = altaArticulo();

				// Comprobamos si el objeto articulo se ha añadido al conjunto correctamente, si
				// es así lo comunicamos.
				if (listaArtic.alta(articulo)) {
					System.out.println("¡ENHORABUENA! El articulo se ha añadido correctamente.");

					// Si no, indicamos que no se ha podido añadir.
				} else {
					System.out.println("¡LO SIENTO! El articulo no se ha añadido.");
				}
			}

			// Eliminar nuevo articulo...
			case 'c' -> {
				// Almacenamos en la variable nombreArticulo el nombre que nos devuelve la
				// función pedirNombre.
				nombreArticulo = pedirNombre();
				// En el objeto articulo almacenamos el objeto articulo que nos devuelve la
				// función buscarArticulo, ese objeto se corresponde al nombre pasado como
				// parametro.
				articulo = listaArtic.buscarArticulo(nombreArticulo);

				// Comprobamos si la función baja nos ha devuelto true, en ese caso, se ha
				// eliminado ese articulo.
				if (listaArtic.baja(articulo)) {
					// Le indicamos al usuario que el alumno ha sido eliminado
					System.out.println("¡ENHORABUENA! Articulo eliminado correctamente");

					// Si no...
				} else {
					// Le indicamos al usuario que el alumno no ha sido eliminado.
					System.out.println("¡LO SIENTO! No se ha podido eliminar el articulo");
				}
			}

			// Modificación articulo...
			case 'd' -> {
				// Almacenamos en la variable nombreArticulo el nombre que nos devuelve la
				// función pedirNombre.
				nombreArticulo = pedirNombre();

				// En el objeto articulo almacenamos el objeto articulo que nos devuelve la
				// función buscarArticulo, ese objeto se corresponde al nombre pasado como
				// parametro.
				articulo = listaArtic.buscarArticulo(nombreArticulo);

				// Comprobamos si ese articulo es distinto a null, si es así pedimos el nuevo
				// precio y se lo actualizamos a ese objeto.
				if (articulo != null) {
					precioArticulo = pedirPrecio();
					articulo.setPrecio(precioArticulo);
					System.out.println("¡ENHORABUENA! Precio modificado correctamente");
					// Si no, imprimimos que el alumno no existe.
				} else {
					System.out.println("¡LO SIENTO! No se ha podido modificar el precio");
				}
			}

			// Incrementar el stock...
			case 'e' -> {
				// Almacenamos en la variable nombreArticulo el nombre que nos devuelve la
				// función pedirNombre.
				nombreArticulo = pedirNombre();
				// En el objeto articulo almacenamos el objeto articulo que nos devuelve la
				// función buscarArticulo, ese objeto se corresponde al nombre pasado como
				// parametro.
				articulo = listaArtic.buscarArticulo(nombreArticulo);

				// Comprobamos si ese articulo es distinto a null, si es así pedimos la cantidad
				// a añadir al stock del producto y se lo actualizamos a ese objeto.
				if (articulo != null) {
					// Almacenamos en la variable stock la cantidad de articulos a añadir de un
					// articulo.
					stock = pedirStock();
					// Modificamos de ese articulo el stock que se acaba de pedir con la función
					// almacenar que es quien actualiza el stock.
					articulo.almacenar(stock);
					System.out.println("Los nuevos productos del articulo han sido añadidos correctamente.");
					// Si no, mostramos un mensaje de que el producto no se ha podido añadir.
				} else {
					System.out.println("¡LO SIENTO! No se ha podido modificar el stock");
				}
			}

			// Decrementar el stock...
			case 'f' -> {
				// Almacenamos en la variable nombreArticulo el nombre que nos devuelve la
				// función pedirNombre.
				nombreArticulo = pedirNombre();
				// En el objeto articulo almacenamos el objeto articulo que nos devuelve la
				// función buscarArticulo, ese objeto se corresponde al nombre pasado como
				// parametro.
				articulo = listaArtic.buscarArticulo(nombreArticulo);

				// Comprobamos si ese articulo es distinto a null, si es así pedimos la cantidad
				// a eliminar al stock del producto y se lo actualizamos a ese objeto.
				if (articulo != null) {
					// Almacenamos en la variable stock la cantidad de articulos a quitar
					// de un articulo..
					stock = pedirStock();

					// Comprobamos si la función vender, nos elimina la cantidad de articulos
					// disponibles, si es así mostramos un mensaje comunicandolo.
					if (articulo.vender(stock)) {
						System.out.println("Los articulos se han vendido correctamente.");

						// Si no, indicamos que no hay productos suficientes.
					} else {
						System.out.println("No hay articulos suficientes para vender");
					}

					// Si no, mostramos un mensaje de que el producto no se ha podido añadir.
				} else {
					System.out.println("¡LO SIENTO! No se ha podido modificar el stock");
				}
			}

			// Salimos...
			case 'g' -> {
				System.out.println("Saliendo del programa...");
			}

			// Indicamos que la opción introducida es incorrecta.
			default -> {
				System.out.println("Opción no válida, intenta de nuevo.");
			}
			}

			// Comprobamos si la opción es distinto de 7.
		} while (opcion != 'g');

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de mostrar las distintas operaciones que podemos
	 * hacer con los articulos.
	 */
	public static void mostrarMenu() {
		System.out.println("\n--- ARTICULOS ---");
		System.out.println("a. Listado");
		System.out.println("b. Alta");
		System.out.println("c. Baja");
		System.out.println("d. Modificación");
		System.out.println("e. Entrada de mercancía");
		System.out.println("f. Salida de mercancía");
		System.out.println("g. Salir");
		System.out.print("Elige una opción: ");
	}

	/**
	 * Esta función se encarga de pedir los datos para un nuevo objeto articulo y
	 * crearlo con esos datos seleccionados.
	 * 
	 * @return El objeto que acabamos de crear.
	 */
	public static Articulo altaArticulo() {
		// Declaramos un nuevo objeto Articulo.
		Articulo art;

		// Creamos la variable nombre como int para almacenar el nombre del articulo.
		String nombre = "";

		// Creamos la variable precio como double para almacenar el precio del articulo.
		double precio;

		// Creamos la variable stock como int para almacenar la cantidad de unidades de
		// ese articulo.
		int stock;

		// En la variable nombre almacenamos el valor que nos devuelve la función
		// pedirNombre.
		nombre = pedirNombre();

		// En la variable precio almacenamos el valor que nos devuelve la función
		// pedirPrecio.
		precio = pedirPrecio();

		// En la variable stock almacenamos el valor que nos devuelve la función
		// pedirStock.
		stock = pedirStock();

		// Creamos un objeto articulo con los datos solicitados al usuario.
		art = new Articulo(nombre, precio, stock);

		// Devolvemos el nuevo articulo.
		return art;
	}

	/**
	 * Esta función se encarga de leer un nombre y devolver ese nombre recien leido.
	 * 
	 * @return El nombre que acaba de leer.
	 */
	public static String pedirNombre() {
		// Creamos la variable nombre como int para almacenar el nombre del articulo.
		String nombre = "";

		// Le pedimos al usuario que introduzca el nombre del nuevo articulo y lo
		// leemos.
		System.out.print("Introduce el nombre del articulo: ");
		nombre = sc.nextLine();

		// Devolvemos el nombre que acabamos de leer.
		return nombre;
	}

	/**
	 * Esta función se encarga de leer el precio de un articulo y devolver ese
	 * precio que acaba de leer.
	 * 
	 * @return El precio del articulo que acaba de leer.
	 */
	public static double pedirPrecio() {
		// Creamos la variable precio como double para almacenar el precio del articulo.
		double precio;

		// Le pedimos al usuario que introduzca el precio del articulo neuvo y lo
		// leemos.
		System.out.print("Introduce el precio del articulo: ");
		precio = sc.nextDouble();
		// Limpiamos el buffer
		sc.nextLine();

		// Devolvemos el precio que acabamos de leer.
		return precio;
	}

	/**
	 * Esta función se encarga de leer la cantidad de articulos que queremos vender
	 * o añadir al stock de un producto.
	 * 
	 * @return La cantidad de un mismo articulo que queremos vender o incrementar.
	 */
	public static int pedirStock() {
		// Creamos la variable stock como int para almacenar la cantidad de productos a
		// añadir o eliminar.
		int stock;

		// Le pedimos al usuario que introduzca la cantidad de productos que desea
		// incrementar o eliminar.
		System.out.print("Introduce la cantidad de articulos: ");
		stock = sc.nextInt();
		// Limpiamos buffer.
		sc.nextLine();

		// Devolvemos el stock que acabamos de leer.
		return stock;
	}
}
