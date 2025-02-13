package parte2.ejercicio3;

import java.util.Scanner;

public class PrincipalAlumno {

	// Creamos el Scanner a nivel de clase para poder leer en las funciones que se
	// necesite.
	static Scanner sc = new Scanner(System.in);

	// Creamos los distintos objetos para la clase Libro,
	private static Alumno alum1 = new Alumno("Juan Luis Barrionuevo Risquez", 7.32);
	private static Alumno alum2 = new Alumno("Maria Rodriguez Rodriguez", 8.75);
	private static Alumno alum3 = new Alumno("Pedro Barrionuevo Risquez", 6.50);

	public static void main(String[] args) {

		// Creamos la variable opcion como int para almacenar la opción seleccionada por
		// el usuario para el menú.
		int opcion;

		// Creamos la variable nota como double para alamcenar la nota media de un
		// alumno.
		double nota;

		// Creamos la variable nombre como String para almacenar el nombre del alumno.
		String nombre;

		// Creamos un objeto temporal donde guardar uno de los tres alumnos de forma
		// temporal.
		Alumno alumTemporal;

		do {
			// Mostramos el menú llamando a la función.
			mostrarMenu();
			// Leemos la opción seleccionada por el usuario.
			opcion = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Asiganamos a nuestro objeto alumTemporal, el alumno que nos devuelve la
			// función seleccionarAlum.
			alumTemporal = seleccionarAlum();

			// Segun la opción seleccionada del menú...
			switch (opcion) {
			// Modificamos el nombre del alumno.
			case 1 -> {
				// Le pedimos al usuario que introduzca el nuevo nombre del alumno y lo leemos.
				System.out.println("¿Cual es el nuevo nombre del alumno?");
				nombre = sc.nextLine();

				// Con el metodo set del nombre modificamos el nombre del alumno con el del
				// solicitado al usuario.
				alumTemporal.setNombre(nombre);
			}

			// Modificamos la nota media del alumno.
			case 2 -> {
				System.out.println("¿Cual es la nueva nota del alumno?");
				nota = sc.nextDouble();
				sc.nextLine();

				// Con el metodo set de la nota modificamos la nota media del alumno con del
				// solicitado al usuario.
				alumTemporal.setNotaMedia(nota);
			}

			// Mostramos todos los datos del alumno.
			case 3 -> {
				System.out.println(alumTemporal.toString());
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
	 * hacer con los alumnos.
	 */
	public static void mostrarMenu() {
		System.out.println("\n--- MENÚ ---");
		System.out.println("1. Modificar nombre");
		System.out.println("2. Modificar nota media");
		System.out.println("3. Imprimir datos del alumno");
		System.out.println("4. Salir");
		System.out.print("Elige una opción: ");
	}

	/**
	 * Esta función se encarga de mostrar los alumnos que tenemos y le pregunta al
	 * usuario cual quiere.
	 * 
	 * @return El alumno seleccionado por el usuario.
	 */
	public static Alumno seleccionarAlum() {

		// La opción que selecciona el usuario y que corresponde al alumno.
		int opcion;

		// Nos creamos un objeto temporal para almacenar el alumno.
		Alumno alumTemporal = null;

		do {
			System.out.println("\n--- Seleccione un alumno ---");
			System.out.println("1. " + alum1.getNombre() + " - " + alum1.getNotaMedia());
			System.out.println("2. " + alum2.getNombre() + " - " + alum2.getNotaMedia());
			System.out.println("3. " + alum3.getNombre() + " - " + alum3.getNotaMedia());

			// Preguntamos una opción y la leemos.
			System.out.println("Que alumno eliges? 1, 2 o 3?");
			opcion = sc.nextInt();
			sc.nextLine();

			// Comprobamos si la opción es 1, 2 o 3 y le asignamos los respectivos alumnos.
			switch (opcion) {
			case 1 -> {
				alumTemporal = alum1;
			}
			case 2 -> {
				alumTemporal = alum2;
			}
			case 3 -> {
				alumTemporal = alum3;
			}
			}
			// Comprobamos que no sea alguna otra opción en ese caso, volvemos a preguntar.
		} while (opcion != 1 && opcion != 2 && opcion != 3);

		// Devolvemos el alumno seleccionado.
		return alumTemporal;
	}

}