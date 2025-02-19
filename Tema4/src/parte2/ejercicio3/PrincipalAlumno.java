package parte2.ejercicio3;

import java.util.Scanner;

public class PrincipalAlumno {

	// Creamos el Scanner a nivel de clase para poder leer en las funciones que se
	// necesite.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos la variable opcion como int para almacenar la opción seleccionada por
		// el usuario para el menú.
		int opcion;

		// Nos creamos un objeto de la clase AlumnoCRUD para recoger la lista.
		AlumnoCRUD listaAlum = new AlumnoCRUD();

		// Nos creamos un objeto de la clase Alumno para alamcenar el nuevo Alumno.
		Alumno alum;

		do {
			// Mostramos el menú llamando a la función.
			mostrarMenu();
			// Leemos la opción seleccionada por el usuario.
			opcion = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Segun la opción seleccionada del menú...
			switch (opcion) {

			case 1 -> {
				// Llamamos a la función imprimirListaAlum del crud para mostrar todos los
				// alumnos almacenados en la lista.
				listaAlum.imprimirListaAlum();
			}

			case 2 -> {
				alum = nuevoAlumno();
				listaAlum.añadirAlumno(alum);
			}

			case 3 -> {

			}

			case 4 -> {

			}

			// Salimos...
			case 5 -> {
				System.out.println("Saliendo del programa...");
			}
			// Indicamos que la opción introducida es incorrecta.
			default -> {
				System.out.println("Opción no válida, intenta de nuevo.");
			}
			}

			// Comprobamos si la opción es distinto de 4.
		} while (opcion != 5);
	}

	/**
	 * Esta función se encarga de mostrar las distintas operaciones que podemos
	 * hacer con los alumnos.
	 */
	public static void mostrarMenu() {
		System.out.println("\n--- ALUMNOS/AS ---");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.print("Elige una opción: ");
	}

	/**
	 * Esta función se encarga de crear un nuevo Alumno con los datos solicitados al
	 * usuario.
	 * 
	 * @return El nuevo alumno.
	 */
	public static Alumno nuevoAlumno() {
		// Declaramos el objeto Alumno donde crearemos un nuevo Alumno con los datos que
		// vamos a solicitar a continuación.
		Alumno alumno;

		// Creamos la variable nombre como String para almacenar el nombre del alumno.
		String nombre = "";

		// Creamos la variable nota como double para almacenar la nota del alumno.
		double nota;

		// Le pedimos al usuario que introduzca el nombre del alumno y lo leemos
		System.out.print("Introduce el nombre del nuevo alumno: ");
		nombre = sc.nextLine();

		// Le pedimos al usuario que introduzca la nota del alumno y la leemos.
		System.out.print("Introduce la nota del nuevo alumno: ");
		nota = sc.nextDouble();
		// Limpiamos el buffer
		sc.nextLine();

		// Creamos el nuevo alumno.
		alumno = new Alumno(nombre, nota);

		// Devolvemos el nuevo Alumno
		return alumno;

	}

	public static String pedirNombre() {
		// Creamos la variable nombre como String para almacenar el nombre del alumno.
		String nombre = "";

		// Le pedimos al usuario que introduzca el nombre del alumno y lo leemos
		System.out.print("Introduce el nombre del nuevo alumno: ");
		nombre = sc.nextLine();

		// Devolvemos el nombre del alumno que acabamos de leer.
		return nombre;
	}

	public static double pedirNota() {
		// Creamos la variable nota como double para almacenar la nota del alumno.
		double nota;

		// Le pedimos al usuario que introduzca la nota del alumno y la leemos.
		System.out.print("Introduce la nota del nuevo alumno: ");
		nota = sc.nextDouble();
		// Limpiamos el buffer
		sc.nextLine();

		// Devolvemos la nota del alumno que acabamos de leer.
		return nota;
	}

}