package parte2.ejercicio2;

import java.util.Scanner;

public class PrincipalLibro {

	// Creamos el Scanner a nivel de clase para poder leer en las funciones que se
	// necesite.
	static Scanner sc = new Scanner(System.in);

	// Creamos los distintos objetos para la clase Libro,
	private static Libro libro1 = new Libro("Harry potter y la piedra filosofal", "J.K. Rowling", 10, 0, "DRAMATICO");
	private static Libro libro2 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", 12, 0, "NARRATIVO");
	private static Libro libro3 = new Libro("Los siete maridos de Evelyn Hugo", "Taylor Jenkins Reid", 6, 0,
			"NARRATIVO");

	public static void main(String[] args) {
		// Creamos la variable opcion como int para almacenar la opción seleccionada por
		// el usuario para el menú.
		int opcion;

		// Creamos la variable cantLibros como int para almacenar la cantidad de libros
		// que vamos a devolver y ha prestar.
		int cantLibros;

		// Creamos un objeto temporal donde guardar uno de los tres libros de forma
		// temporal.
		Libro libroTemporal;

		do {
			// Mostramos el menú llamando a la función.
			mostrarMenu();
			// Leemos la opción seleccionada por el usuario.
			opcion = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Asiganamos a nuestro objeto libroTemporal, el libro que nos devuelve la
			// función seleccionarLibro.
			libroTemporal = seleccionarLibro();

			// Segun la opción seleccionada del menú...
			switch (opcion) {
			// Realizamos un prestamos...
			case 1 -> {
				System.out.println("¿Cuantos libros quieres?");
				cantLibros = sc.nextInt();

				if (libroTemporal.prestamo(cantLibros)) {
					System.out.println("El prestamo se ha realizado correctamente.");
				} else {
					System.out.println("El prestamo no se ha podido realizar. ");
				}
			}

			// Realizamos una devolución...
			case 2 -> {
				System.out.println("¿Cuantos libros quieres devolver?");
				cantLibros = sc.nextInt();

				if (libroTemporal.devolucion(cantLibros)) {
					System.out.println("La devolución se ha realizado correctamente.");
				} else {
					System.out.println("La devolución no se ha podido realizar. ");
				}
			}
			// Mostramos todos los datos de un libro.
			case 3 -> {
				System.out.println(libroTemporal.toString());
			}
			// Salimos...
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
	}

	/**
	 * Esta función se encarga de mostrar las distintas operaciones que podemos
	 * hacer con los libros.
	 */
	public static void mostrarMenu() {
		System.out.println("\n----- MENÚ LIBRERIA -----");
		System.out.println("1. Realizar prestamo");
		System.out.println("2. Realizar una devolución");
		System.out.println("3. Mostrar información");
		System.out.println("4. Salir");
		System.out.print("Seleccione una opción: ");
	}

	/**
	 * Esta función se encarga de mostrar los libros que tenemos y le pregunta al
	 * usuario cual quiere.
	 * 
	 * @return El libro seleccionado por el usuario.
	 */
	public static Libro seleccionarLibro() {

		// La opción que selecciona el usuario y que corresponde al libro.
		int opcion;

		// Nos creamos un objeto temporal para almacenar el libro.
		Libro libroTemporal = null;

		do {
			System.out.println("\n--- Seleccione un libro ---");
			System.out.println("1. " + libro1.getTitulo() + " - " + libro1.getAutor());
			System.out.println("2. " + libro2.getTitulo() + " - " + libro2.getAutor());
			System.out.println("3. " + libro3.getTitulo() + " - " + libro3.getAutor());

			// Preguntamos una opción y la leemos.
			System.out.println("Que libro quieres? 1, 2 o 3?");
			opcion = sc.nextInt();

			// Comprobamos si la opción es 1, 2 o 3 y le asignamos los respectivos libros.
			switch (opcion) {
			case 1 -> {
				libroTemporal = libro1;
			}
			case 2 -> {
				libroTemporal = libro2;
			}
			case 3 -> {
				libroTemporal = libro3;
			}
			}
			// Comprobamos que no sea alguna otra opción en ese caso, volvemos a preguntar.
		} while (opcion != 1 && opcion != 2 && opcion != 3);

		// Devolvemos el libro seleccionado.
		return libroTemporal;
	}

}
