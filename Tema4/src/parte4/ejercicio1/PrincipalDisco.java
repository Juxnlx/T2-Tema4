package parte4.ejercicio1;

import java.util.Scanner;

public class PrincipalDisco {
	// Creamsos el Scanner como static para solicitar información al usuario en el
	// resto de la clase.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaramos el objeto disco para almacenar temporalmente un disco.
		Disco disco;

		// Creamos la variable codigo para almacenar temporamente el codigo de un
		// disco..
		int codigo;

		// Creamos la variable opcion como int para almacenar la opción seleccionada
		// por el usuario para el menú.
		int opcion;

		do {
			// Mostramos el menú llamando a la función.
			mostrarMenu();
			// Leemos la opción seleccionada por el usuario.
			opcion = sc.nextInt();

			// Segun la opción seleccionada del menú...
			switch (opcion) {

			// Listar disco...
			case 1 -> {
				// Llamamos a la función listadoDisco.
				DiscoCRUD.listadoDisco();
			}

			// Nuevo disco...
			case 2 -> {
				// Al objeto disco le asignamos el objeto que nos devuelve la función
				// crearDisco.
				disco = crearDisco();

				// Comprobamos si el disco se ha añadido correctamente, en ese caso mostramos un
				// mensaje indicandolo.
				if (DiscoCRUD.añadirDisco(disco)) {
					System.out.println("El disco se ha añadido correctamente");

					// Si no, mostramos un mensaje de que el disco no se ha añadido.
				} else {
					System.out.println("El disco no se ha añadido.");
				}
			}

			// Borrar disco...
			case 3 -> {
				// A la variable codigo le asignamos el codigo que nos devuelve la función
				// pedirCodigo.
				codigo = pedirCodigo();
				// Al objeto disco le asignamos el objeto que nos devuelve la función
				// buscarDisco.
				disco = DiscoCRUD.buscarDisco(codigo);

				// Comprobamos si la función eliminarDisco nos devuelve un true o false. En el
				// caso de ser true mostramos un mensaje de que el disco se ha eliminado
				// correctamente.
				if (DiscoCRUD.eliminarDisco(disco)) {
					System.out.println("El disco se ha eliminado correctamente.");
				} else {
					System.out.println("El disco no se ha eliminado correctamente.");
				}
			}

			// Salir...
			case 4 -> {
				System.out.println("Saliendo del programa...");
			}

			// Indicamos que la opción introducida es incorrecta.
			default -> {
				System.out.println("Opción no válida, intenta de nuevo.");
			}
			}

			// Comprobamos si la opción es distinto de 4.
		} while (opcion != 4);

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de imprimir el menú con todas las opciones posibles.
	 */
	public static void mostrarMenu() {
		System.out.println("\n--- COLECCIÓN DE DISCOS ---");
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Disco");
		System.out.println("3. Borrar");
		System.out.println("4. Salir");
		System.out.print("Introduce una opción --> ");
	}

	/**
	 * Esta función se encarga de solicitar todos los datos para crear un nuevo
	 * disco.
	 * 
	 * @return El objeto creado con los datos solicitados al usuario.
	 */
	public static Disco crearDisco() {
		// Declaramos un objeto disco.
		Disco d;

		// Creamos la variable codigo como int para almacenar el codigo de un disco..
		int codigo;

		// Creamos la variable autor como String para almacenar el autor del disco.
		String autor;

		// Creamos la variable titulo como String para almacenar el titulo de un disco.
		String titulo;

		// Creamos la variable duracion como double para almacenar la duración de un
		// disco.
		double duracion;

		// Creamos la variable genero como String para almacenar el genero de un disco.
		String genero;

		// Llamamos a la función pedirCodigo y seleccionamos el codigo que nos devuelva
		// a la variable codigo.
		codigo = pedirCodigo();

		// Le pedimos al usuario que introduzca el autor del disco y lo leemos.
		System.out.println("introduce el autor del disco: ");
		autor = sc.nextLine();

		// Le pedimos al usuario que introduzca el titulo del disco y lo leemos.
		System.out.println("Introduce el titulo del disco: ");
		titulo = sc.nextLine();

		// Le pedimos al usuario que introduzca la duración del disco y lo leemos.
		System.out.println("Introduce la duración del disco: ");
		duracion = sc.nextDouble();
		// Limpiamos el buffer
		sc.nextLine();

		// Le pedimos al usuario que introduzca el genero del disco y lo leemos.
		System.out.println("Introduce el genero del disco: ");
		genero = sc.nextLine().toUpperCase();

		// Creamos un nuevo disco con todos los datos solicitados al usuario.
		d = new Disco(codigo, autor, titulo, duracion, genero);

		// Devolvemos el objeto que acabamos de crear.
		return d;
	}

	/**
	 * Esta función se encarga de solicitar un codigo del disco y lo leemos.
	 * 
	 * @return El codigo que acabamos de leer.
	 */
	public static int pedirCodigo() {
		// Creamos la variable codigo como int para almacenar el codigo del disco.
		int codigo;

		// Le pedimos al usuario que introduzca el codigo del disco y lo leemos.
		System.out.println("Introduce el código del nuevo disco: ");
		codigo = sc.nextInt();
		// Limpiamos el buffer.
		sc.nextLine();

		// Devolvemos el codigo que acabamos de leer.
		return codigo;
	}

}
