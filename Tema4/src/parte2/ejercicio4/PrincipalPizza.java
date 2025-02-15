package parte2.ejercicio4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PrincipalPizza {

	// Creamsos el Scanner como static para solicitar información al usuario en el
	// resto de la clase.
	static Scanner sc = new Scanner(System.in);

	// Creamso el Random como static para generar un codigo random para agregar una
	// pizza.
	static Random rand = new Random();

	// Creamos una lista de pizzas como static para almacenar todos los objetos
	// pizzas.
	static ArrayList<Pizza> pedidos = new ArrayList<Pizza>();

	public static void main(String[] args) {

		// Creamos la variable opc como int para alamcenar la opción seleccionada por el
		// usuario del menú.
		int opc;

		do {
			// Llamamos a la función mostrarMenu para imprimir todos las opciones del menú
			mostrarMenu();
			// Leemos la opción introducida por el usuario.
			opc = sc.nextInt();
			// Limpiamos el buffer
			sc.nextLine();

			// Controlamos la opción seleccionada por el usuario.
			switch (opc) {
			// En el caso 1 llamamos a la función agregrarPizza para agregar una pizza a
			// nuestra lista.
			case 1 -> agregarPizza();

			// En el caso 2 llamamos a la función servirPizza para marcar una pizza como
			// servida.
			case 2 -> servirPizza();

			// En el caso 3 llamamos a la función mostrarPizzas, para imprimir todas las
			// pizzas.
			case 3 -> mostrarPizzas();

			// Saliendo...
			case 4 -> System.out.println("Saliendo del programa...");
			// La opción introducida por el usuario no corresponde a ningun caso anterior.
			default -> System.out.println("Opción no válida, intenta de nuevo.");
			}

			// Comprobamos si la opción en distinta de 4, si es así volvemos a ejecutar el
			// bucle.
		} while (opc != 4);

	}

	/**
	 * Esta función se encarga de imprimir el menú con todas las opciones posibles.
	 */
	public static void mostrarMenu() {
		System.out.println("\n--- MENÚ ---");
		System.out.println("1. Agregar nueva pizza");
		System.out.println("2. Marcar pizza como servida");
		System.out.println("3. Mostrar pedidos");
		System.out.println("4. Salir\n");
		System.out.print("Introduce una opción --> ");
	}

	/**
	 * Esta función se encarga de solicitar al usuario un codigo, un tamaño y un
	 * tipo para la pizza y añadir ese pedido a una lista de pedidos.
	 */
	public static void agregarPizza() {
		// Creamos la variable codigo como int para almacenar el codigo de
		// identificación de la pizza.
		int cod;
		// Creamos la variable size como String para almacenar el tamaño de la pizza.
		String size;
		// Creamos al variable tipo como String para almacenar el tipo de la pizza.
		String tipo;

		// Declaremos el objeto Pizza.
		Pizza p;

		do {
			// Le pedimos al usuario que introduzca un codigo para la pizza y lo leemos.
			System.out.println("Introduce un valor entero con el que identificar la pizza: ");
			cod = sc.nextInt();
			sc.nextLine();
			// Le pedimos al usuario que introduzca el tamaño de la pizza y lo leemos.
			System.out.println("Introduce el tamaño (MEDIANA/FAMILIAR): ");
			size = sc.nextLine();
			// Le pedimos al usuario que introduzca el tipo de la pizza seleccioanda y lo
			// leemos.
			System.out.println("Introduce el tipo (MARGARITA/CUATROQUESOS/FUNGHI): ");
			tipo = sc.nextLine();

			// Creamos una pizza con los datos introducidos por el usuario.
			p = new Pizza(cod, size, tipo);
			// Comprobamos si la pizza creada ya existe, si es así volvemos a preguntar de
			// nuevo.
		} while (pedidos.contains(p));

		// Añadimos al pizza a nuestra lista de pedidos.
		pedidos.add(p);

		// Imprimimos un mensaje comunicando que la pizza ha sido añadida con exito.
		System.out.println("Pizza agregada con éxito: " + p);
	}

	/**
	 * Esta función se encarga de solicitar un codigo de pizza al usuario y marcar
	 * esa pizza como servida, si es que no lo esta.
	 */
	public static void servirPizza() {
		// Creamos la variable codigo como int para almacenar el codigo de
		// identificación de la pizza.
		int cod;

		// Le pedimos al usuario que introduzca un codigo para la pizza y lo leemos.
		System.out.println("Introduce un valor entero con el que identificar la pizza: ");
		cod = sc.nextInt();

		// Recorremos toda la lista de pedidos.
		for (Pizza pizza : pedidos) {
			// Comprobamos si el codigo de la pizza que estamos recorriendo es el mismo que
			// el introducido por el usuario.
			if (pizza.getCodigo() == cod) {
				// Comprobamos si el estado de la pizza que estamos recorriendo esta marcada
				// como servida, si es así lo decimos.
				if (pizza.getEstado() == Pizza.Estado.SERVIDA) {
					System.out.println("Esta pizza ya ha sido servida.");
					// Si no...
				} else {
					// Cambiamos el estado de la pizza a servida gracias al metodo setEstado y
					// imprimimos un menaje de que se ha hecho con exito.
					pizza.setEstado(Pizza.Estado.SERVIDA);
					System.out.println("Pizza servida con éxito.");
				}
				// Si no existe el código...
			} else {
				// Imprimimos un mensaje de que la pizza no se encontro en la lista.
				System.out.println("No se encontró una pizza con ese código.");
			}
		}
	}

	/**
	 * Esta función se encarga de mostrar todas las pizzas introducidas.
	 */
	public static void mostrarPizzas() {
		// Comprobamos si la lista esta vacia, si es así lo indicamos.
		if (pedidos.isEmpty()) {
			System.out.println("No hay pedidos registrados.");

			// Si no...
		} else {
			// Imprimos todas las pizzas recorriendo la lista con un for-each.
			System.out.println("\n--- PEDIDOS ACTUALES ---");
			for (Pizza pizza : pedidos) {
				System.out.println(pizza.toString());
			}
		}
	}
}
