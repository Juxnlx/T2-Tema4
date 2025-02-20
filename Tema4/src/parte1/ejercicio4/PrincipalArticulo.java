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

		// Creamos la variable opcion como int para almacenar la opción seleccionada por
		// el usuario para el menú.
		int opcion;

		// Creamos la variable nombreArticulo como String para almacenar el nombre
		// introducido por el usuario de forma temporal, en las funciones que se
		// requiera.
		String nombreArticulo = "";

		// Creamos la variable precioArticulo como double para almacenar el precio
		// introducido por el usurio.
		double precioArticulo;

		do {
			// Mostramos el menú llamando a la función.
			mostrarMenu();
			// Leemos la opción seleccionada por el usuario.
			opcion = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Segun la opción seleccionada del menú...
			switch (opcion) {

			// Listar articulos...
			case 1 -> {
				// Llamamos a la función listarArticulos para imprimir todos los articulos
				// disponibles hasta el momento.
				listaArtic.listarArticulos();
			}

			// Crear nuevo articulo... /*NO FUNCIONA*/
			case 2 -> {
				// Almacenamos en el objeto articulo el objeto que nos devuelve la función
				// altaArticulo.
				articulo = altaArticulo();

				if (listaArtic.alta(articulo)) {
					System.out.println("¡ENHORABUENA! El articulo se ha añadido correctamente.");
				} else {
					System.out.println("¡LO SIENTO! El articulo no se ha añadido.");
				}
			}

			// Eliminar nuevo articulo...
			case 3 -> {
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
			case 4 -> {
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
			case 5 -> {

			}

			// Decrementar el stock...
			case 6 -> {

			}

			// Salimos...
			case 7 -> {
				System.out.println("Saliendo del programa...");
			}

			// Indicamos que la opción introducida es incorrecta.
			default -> {
				System.out.println("Opción no válida, intenta de nuevo.");
			}
			}

			// Comprobamos si la opción es distinto de 7.
		} while (opcion != 7);

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de mostrar las distintas operaciones que podemos
	 * hacer con los articulos.
	 */
	public static void mostrarMenu() {
		System.out.println("\n--- ARTICULOS ---");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");
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

		// Le pedimos al usuario que introduzca el nombre del nuevo articulo y lo
		// leemos.
		System.out.print("Introduce el nombre del articulo: ");
		nombre = sc.nextLine();

		// Le pedimos al usuario que introduzca el precio del articulo neuvo y lo
		// leemos.
		System.out.print("Introduce el precio del articulo: ");
		precio = sc.nextDouble();
		// Limpiamos el buffer
		sc.nextLine();

		// Le pedimos al usuario que introduzca el stock del nuevo articulo y lo leemos.
		System.out.print("Introduce el stock del articulo: ");
		stock = sc.nextInt();
		// Limpiamos el buffer
		sc.nextLine();

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
}
