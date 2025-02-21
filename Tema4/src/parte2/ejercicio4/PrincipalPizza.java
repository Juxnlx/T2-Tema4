package parte2.ejercicio4;

import java.util.Scanner;

public class PrincipalPizza {

	// Creamsos el Scanner como static para solicitar información al usuario en el
	// resto de la clase.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos el objeto pedidos para hacer referencia al conjunto de pizzas.
		PizzaCRUD pedidos = new PizzaCRUD();

		// Declaramos el objeto pizza para almacenar temporalmente una pizza.
		Pizza pizza;

		// Creamos la variable codigo para almacenar temporamente el codigo de pedido de
		// alguna pizza.
		int codigo;

		// Creamos la variable opcion como char para almacenar la opción seleccionada
		// por el usuario para el menú.
		char opcion;

		do {
			// Mostramos el menú llamando a la función.
			mostrarMenu();
			// Leemos la opción seleccionada por el usuario.
			opcion = sc.nextLine().toLowerCase().charAt(0);

			// Segun la opción seleccionada del menú...
			switch (opcion) {

			// Listar pizza...
			case 'a' -> {
				// Llamamos a la función listadoPizza mediante el objeto pedidos.
				pedidos.listadoPizza();
			}

			// Nuevo pedido...
			case 'b' -> {
				// Al objeto pizza le asignamos el objeto que nos devuelve la función
				// crearPizza.
				pizza = crearPizza();

				// Comprobamos si la pizza se ha añadido correctamente, en ese caso mostramos un
				// mensaje indicandolo.
				if (pedidos.añadirPizza(pizza)) {
					System.out.println("La pizza se ha añadido correctamente");

					// Si no, mostramos un mensaje de que la pizza no se ha añadido.
				} else {
					System.out.println("La pizza no se ha añadido.");
				}

			}

			// Pizza servida...
			case 'c' -> {
				// Almacenamos en la variable codigo el codigo que nos devuelve la función
				// pedirCodigo.
				codigo = pedirCodigo();

				// Comprobamos si el objeto devuelto es distinto de null, en ese caso
				// modificamos mediante el set el estado de la pizza a 'servida'
				if (pedidos.modificarEstado(codigo)) {
					System.out.println("La pizza se ha marcado a servida.");
					// Si no, imprimimos un mensaje informando que la pizza no existe.
				} else {
					System.out.println("La pizza no existe");
				}
			}

			// Salir...
			case 'd' -> {
				System.out.println("Saliendo del programa...");
			}

			// Indicamos que la opción introducida es incorrecta.
			default -> {
				System.out.println("Opción no válida, intenta de nuevo.");
			}
			}

			// Comprobamos si la opción es distinto de 'd'.
		} while (opcion != 'd');

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de imprimir el menú con todas las opciones posibles.
	 */
	public static void mostrarMenu() {
		System.out.println("\n--- MENÚ ---");
		System.out.println("a. Listado de pizzas");
		System.out.println("b. Nuevo pedido");
		System.out.println("c. Pizza servida");
		System.out.println("d. Salir");
		System.out.print("Introduce una opción --> ");
	}

	/**
	 * Esta función se encarga de solicitar todos los datos para crear un nuevo
	 * pedido de una pizza.
	 * 
	 * @return El objeto creado con los datos solicitados al usuario.
	 */
	public static Pizza crearPizza() {
		// Declaramos un objeto pizza.
		Pizza pizza;

		// Creamos la variable codigo como int para almacenar el codigo de pedido de una
		// pizza.
		int codigo;

		// Creamos la variable size como String para almacenar el tamaño de la pizza.
		String size = "";

		// Creamos la variable tipo como String para almacenar el tipo de la pizza.
		String tipo = "";

		// Llamamos a la función pedirCodigo y seleccionamos el codigo que nos devuelva
		// a la variable codigo.
		codigo = pedirCodigo();

		// Le pedimos al usuario que introduzca el tamaño de una pizza y lo leemos.
		System.out.println("Introduce el tamaño de la pizza 'MEDIANA' o 'FAMILIAR': ");
		size = sc.nextLine();

		// Le pedimos al usuario que introduzca el tipo de de pizza y lo leemos.
		System.out.println("Introduce el tipo de pizza 'MARGARITA', 'CUATROQUESOS' o 'FUNGHI': ");
		tipo = sc.nextLine();

		// Creamos un objeto pizza con los datos solicitados al usuario.
		pizza = new Pizza(codigo, size, tipo);

		// Devolvemos el objeto que acabamos de crear.
		return pizza;
	}

	/**
	 * Esta función se encarga de solicitar un codigo de pedido de una pizza y lo
	 * leemos.
	 * 
	 * @return El codigo que acabamos de leer.
	 */
	public static int pedirCodigo() {
		// Creamos la variable codigo como int para almacenar el codigo de pedido de una
		// pizza.
		int codigo;

		// Le pedimos al usuario que introduzca el codigo de pedido de la pizza y lo
		// leemos.
		System.out.println("Introduce el código de pedido de la pizza: ");
		codigo = sc.nextInt();
		// Limpiamos el buffer.
		sc.nextLine();

		// Devolvemos el codigo que acabamos de leer.
		return codigo;
	}

}
