package parte2.ejercicio1;

import java.util.Scanner;

public class PrincipalCuentaC {

	// Creamos el Scanner a nivel de clase para poder leer en las funciones que se
	// necesite.
	static Scanner sc = new Scanner(System.in);

	private static CuentaCorriente cuenta1;
	private static CuentaCorriente cuenta2;
	private static CuentaCorriente cuenta3;

	public static void main(String[] args) {

		// Creamos varios objetos.
		cuenta1 = new CuentaCorriente("30790056W", "Juan", 5000, "ESPAÑOLA");
		cuenta2 = new CuentaCorriente("70756266H", "Ana", 13000.50, "ESPAÑOLA");
		cuenta3 = new CuentaCorriente("26597217V", "Pedro", 2980.35, "EXTRANJERA");

		// Creamos la variable opcion como int para almacenar la opción seleccionada por
		// el usuario para el menú.
		int opcion;

		// Creamos la variable dinero como int para almacenar la cantidad a retirar o
		// ingresar en un momento dado.
		int dinero;

		// Creamos un objeto temporal donde guardar una de las tres cuentas de forma
		// temporal.
		CuentaCorriente cuentaTemporal;

		do {
			// Mostramos el menú llamando a la función.
			menu();
			// Leemos la opción seleccionada por el usuario.
			opcion = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Asiganamos a nuestro objeto cuentaTemporal, la cuenta que nos devuelve la
			// función seleccionarCuenta.
			cuentaTemporal = seleccionarCuenta();

			// Segun la opción seleccionada del menú...
			switch (opcion) {
			// Mostramos el precio...
			case 1 -> {
				System.out.println("El saldo de su cuenta es --> " + cuentaTemporal.getSaldo());
			}
			// Pedimos la cantidad a ingresar y lo añadimos a la cuenta si es posible.
			case 2 -> {
				System.out.println("Introduce la cantidad a ingresar: ");
				dinero = sc.nextInt();

				if (cuentaTemporal.ingresarDinero(dinero)) {
					System.out.println("El ingreso de " + dinero + " ha sido ingresado con exito.");
				} else {
					System.out.println("¡Lo siento! El ingreso no se ha efectuado.");
				}
			}
			// Pedimos la cantidad a retirar y la retiramos si es posible.
			case 3 -> {
				System.out.println("Introduce la cantidad a retirar: ");
				dinero = sc.nextInt();

				if (cuentaTemporal.sacarDinero(dinero)) {
					System.out.println("El retiro de " + dinero + " se ha realizado con exito.");
				} else {
					System.out.println("¡Lo siento! El retiro no se ha efectuado.");
				}
			}
			// Mostramos todos los datos de una cuenta.
			case 4 -> {
				System.out.println(cuentaTemporal.toString());
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

			// Comprobamos si la opción es distinto de 5.
		} while (opcion != 5);

	}

	/**
	 * Esta función se encarga de mostrar el menú con las operaciones que se pueden
	 * hacer.
	 */
	public static void menu() {
		System.out.println("\n----- MENÚ CUENTA CORRIENTE -----");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Sacar dinero");
		System.out.println("4. Ver datos de una cuenta");
		System.out.println("5. Salir");
		System.out.print("Seleccione una opción: ");
	}

	/**
	 * Esta función se encarga de solicitar al usuario un numero y segun el número
	 * introducido corresponde a una cuenta u otra.
	 * 
	 * @return Devolvemos la cuenta seleccionada por el usuario.
	 */
	public static CuentaCorriente seleccionarCuenta() {

		// La opción que selecciona el usuario y que corresponde a la cuenta.
		int opcion;

		// Nos creamos un objeto temporal para almacenar la cuenta que devolver.
		CuentaCorriente cuentaTemporal = null;

		do {
			// Preguntamos una opción y la leemos.
			System.out.println("Que cuenta quieres? 1, 2 o 3?");
			opcion = sc.nextInt();

			// Comprobamos si la opción es 1, 2 o 3 y le asignamos las respectivas cuentas.
			switch (opcion) {
			case 1 -> {
				cuentaTemporal = cuenta1;
			}
			case 2 -> {
				cuentaTemporal = cuenta2;
			}
			case 3 -> {
				cuentaTemporal = cuenta3;
			}
			}
			// Comprobamos que no sea alguna otra opción en ese caso, volvemos a preguntar.
		} while (opcion != 1 && opcion != 2 && opcion != 3);

		// Devolvemos la cuenta seleccionada.
		return cuentaTemporal;
	}

}
