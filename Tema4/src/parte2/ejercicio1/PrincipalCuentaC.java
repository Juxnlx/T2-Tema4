package parte2.ejercicio1;

import java.util.Scanner;

public class PrincipalCuentaC {

	// Creamos el Scanner a nivel de clase para poder leer en las funciones que se
	// necesite.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos la variable opcion como int para almacenar la opción seleccionada por
		// el usuario para el menú.
		int opcion;

		// Creamos la variable dni como String para almacenar el dni del titular de la
		// cuenta de forma temporal.
		String dni;

		// Creamos al variable nombre como String para almacenar el nombre del titular
		// de la cuenta de forma temporal.
		String nombre;

		// Creamos la variable dinero como double para almacenar el dinero a ingresar o
		// retirar de una cuenta de forma temporal.
		double dinero;

		// Creamos la variable opcModificar como int para almacenar la opción que se
		// corresponda a alguna de las dos opciones que se le piden.
		int opcModificar;

		// Creamos la variable nuevoNombre como String para almacenar el nuevo nombre de
		// una cuenta.
		String nuevoNombre = "";

		// Declaramos un objeto de tipo CuentaCorriente para almacenar de forma temporal
		// una cuenta corriente.
		CuentaCorriente cuentaC;

		do {
			// Mostramos el menú llamando a la función.
			menu();
			// Leemos la opción seleccionada por el usuario.
			opcion = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			// Segun la opción seleccionada del menú...
			switch (opcion) {

			// Añadir cuenta nueva.
			case 1 -> {
				// En el objeto cuentaC almacenamos la nueva cuenta que nos devuelve la función
				// crearCuenta.
				cuentaC = crearCuenta();

				// Comprobamos si al función añadirCuenta nos devuelve true, en ese caso...
				if (CuentaCRUD.añadirCuenta(cuentaC)) {
					// Mostramos un mensaje indicando que la cuenta se ha añadido al conjunto.
					System.out.println("La cuenta se ha añadido con exito.");
					// Si no...
				} else {
					// Mostramos un mensaje indicando que la cuenta no se ha podido añadir al
					// conjunto.
					System.out.println("La cuenta no se ha añadido");
				}
			}

			// Consultar saldo de una cuenta.
			case 2 -> {
				// Asignamos a la variable dni el dni que nos devuelve la función pedirDni.
				dni = pedirDNI();
				// Asignamos a la variable nombre el nombre que nos devuelve la función
				// pedirNombre.
				nombre = pedirNombre();
				// En el objeto cuentaC almacenamos la cuenta que nos devuelve la función
				// buscarCuenta.
				cuentaC = CuentaCRUD.buscarCuenta(dni, nombre);

				// Comprobamos si la cuenta que nos han devuelto es distinta de null, en ese
				// caso...
				if (cuentaC != null) {
					// Mostramos el sueldo de esa cuenta corriente.
					System.out.println("Saldo en cuenta de " + cuentaC.getNombre() + " con DNI " + cuentaC.getDni()
							+ ": " + cuentaC.getSaldo());
					// Si no...
				} else {
					// Mostramos un mensaje de que no hay registrada ninguna cuenta con esos datos.
					System.out.println("Los datos introducidos no se corresponden a ninguna cuenta.");
				}
			}

			// Ingresar dinero en una cuenta
			case 3 -> {
				// Asignamos a la variable dni el dni que nos devuelve la función pedirDni.
				dni = pedirDNI();
				// Asignamos a la variable nombre el nombre que nos devuelve la función
				// pedirNombre.
				nombre = pedirNombre();
				// En el objeto cuentaC almacenamos la cuenta que nos devuelve la función
				// buscarCuenta.
				cuentaC = CuentaCRUD.buscarCuenta(dni, nombre);

				// Comprobamos si la cuenta que nos han devuelto es distinta de null, en ese
				// caso...
				if (cuentaC != null) {
					// En la variable dinero almacenamos la cantidad que nos devuelve la función
					// pedirDinero.
					dinero = pedirDinero();
					// Comprobamos si la función ingresarDinero ha podido ingresar el dinero pasado
					// como parametro, si es así...
					if (cuentaC.ingresarDinero(dinero)) {
						// Mostramos un mensaje comunicando que el dinero se ha ingresado.
						System.out.println("La cantidad ha ingresar se ha efectuado.");
						// Si no...
					} else {
						// Mostramos un mensaje comunicando que el dinero no se ha ingresado.
						System.out.println("La cantidad a ingresar no se ha efectuado.");
					}
					// Si no...
				} else {
					// Mostramos un mensaje de que no hay registrada ninguna cuenta con esos datos.
					System.out.println("Los datos introducidos no se corresponden a ninguna cuenta.");
				}
			}

			// Retirar dinero de una cuenta
			case 4 -> {
				// Asignamos a la variable dni el dni que nos devuelve la función pedirDni.
				dni = pedirDNI();
				// Asignamos a la variable nombre el nombre que nos devuelve la función
				// pedirNombre.
				nombre = pedirNombre();
				// En el objeto cuentaC almacenamos la cuenta que nos devuelve la función
				// buscarCuenta.
				cuentaC = CuentaCRUD.buscarCuenta(dni, nombre);

				// Comprobamos si la cuenta que nos han devuelto es distinta de null, en ese
				// caso...
				if (cuentaC != null) {
					// En la variable dinero almacenamos la cantidad que nos devuelve la función
					// pedirDinero.
					dinero = pedirDinero();
					// Comprobamos si la función sacarDinero ha podido retirar el dinero pasado
					// como parametro, si es así...
					if (cuentaC.sacarDinero(dinero)) {
						// Mostramos un mensaje comunicando que el dinero se ha retirado.
						System.out.println("La cantidad ha retirar se ha retirado correctamente.");
						// Si no...
					} else {
						// Mostramos un mensaje comunicando que el dinero no se ha retirado.
						System.out.println("La cantidad a retirar no se ha retirado.");
					}
					// Si no...
				} else {
					// Mostramos un mensaje de que no hay registrada ninguna cuenta con esos datos.
					System.out.println("Los datos introducidos no se corresponden a ninguna cuenta.");
				}
			}

			// Mostrar los datos de una cuenta.
			case 5 -> {
				// Asignamos a la variable dni el dni que nos devuelve la función pedirDni.
				dni = pedirDNI();
				// Asignamos a la variable nombre el nombre que nos devuelve la función
				// pedirNombre.
				nombre = pedirNombre();
				// En el objeto cuentaC almacenamos la cuenta que nos devuelve la función
				// buscarCuenta.
				cuentaC = CuentaCRUD.buscarCuenta(dni, nombre);

				// Comprobamos si la cuenta que nos han devuelto es distinta de null, en ese
				// caso...
				if (cuentaC != null) {
					// Imprimimos todos los datos de esa cuenta.
					System.out.println(cuentaC);

					// Si no...
				} else {
					// Mostramos un mensaje de que no hay registrada ninguna cuenta con esos datos.
					System.out.println("Los datos introducidos no se corresponden a ninguna cuenta.");
				}
			}

			// Actualizar los datos de una cuenta
			case 6 -> {
				// Asignamos a la variable dni el dni que nos devuelve la función pedirDni.
				dni = pedirDNI();
				// Asignamos a la variable nombre el nombre que nos devuelve la función
				// pedirNombre.
				nombre = pedirNombre();

				do {
					// Mostramos el menú y solicitamos una opción.
					System.out.println("Selecciones una opción -->");
					System.out.println("1. Modificar el nombre.");
					System.out.println("2. Modificar la nacionalidad.");
					System.out.print("Introduce una opción: ");
					opcModificar = sc.nextInt();
					// Limpiamos buffer.
					sc.nextLine();

					// Si la opción es distinta de 1 y 2, volvemos a preguntar.
				} while (opcModificar != 1 && opcModificar != 2);

				// Si la opción es igual a 1 pedimos el nombre.
				if (opcModificar == 1) {
					System.out.println("Introduce el nuevo nombre: ");
					nuevoNombre = sc.nextLine();
				}

				// Comprobamos si la función modificarCuenta nos ha modificado algo, si es así
				// lo decimos.
				if (CuentaCRUD.modificarCuenta(dni, nombre, opcion, nuevoNombre)) {
					System.out.println("Cuenta modificada correctamente.");
					// Si no...
				} else {
					// Mostramos un mensaje de que la cuenta no se encontro.
					System.out.println("No se encontró la cuenta.");
				}

			}

			// Eliminar una cuenta
			case 7 -> {
				// Asignamos a la variable dni el dni que nos devuelve la función pedirDni.
				dni = pedirDNI();
				// Asignamos a la variable nombre el nombre que nos devuelve la función
				// pedirNombre.
				nombre = pedirNombre();
				// En el objeto cuentaC almacenamos la cuenta que nos devuelve la función
				// buscarCuenta.
				cuentaC = CuentaCRUD.buscarCuenta(dni, nombre);

				// Comprobamos si la función eliminar nos ha borrado una cuenta o no, si es así,
				// lo comunicamos.
				if (CuentaCRUD.eliminarCuenta(cuentaC)) {
					// Mostramos un mensaje comunicando que la cuenta se ha borrado.
					System.out.println("La cuenta se ha eliminado correctamente.");

					// Si no...
				} else {
					// Mostramos un mensaje comunicando que la cuenta no se ha borrado.
					System.out.println("La cuenta no se ha eliminado correctamente.");
				}
			}
			//Listar todas las cuentas existentes.
			case 8 -> {
				// Llamamos a la función listadoCuenta.
				CuentaCRUD.listadoCuenta();
			}
			// Salir...
			case 9 -> {
				System.out.println("Salir...");
			}

			// Indicamos que la opción introducida es incorrecta.
			default -> {
				System.out.println("Opción no válida, intenta de nuevo.");
			}
			}

			// Comprobamos si la opción es distinto de 9.
		} while (opcion != 9);

	}

	/**
	 * Esta función se encarga de mostrar el menú con las operaciones que se pueden
	 * hacer.
	 */
	public static void menu() {
		System.out.println("\n----- MENÚ CUENTA CORRIENTE -----");
		System.out.println("1. Crear una nueva cuenta");
		System.out.println("2. Consultar saldo de una cuenta");
		System.out.println("3. Ingresar dinero en una cuenta");
		System.out.println("4. Retirar dinero de una cuenta");
		System.out.println("5. Mostrar los datos de una cuenta");
		System.out.println("6. Actualizar los datos de una cuenta");
		System.out.println("7. Eliminar una cuenta");
		System.out.println("8. Listar todas las cuentas existentes");
		System.out.println("9. Salir");
		System.out.print("Seleccione una opción: ");
	}

	/**
	 * Esta función se encarga de crear una nueva cuenta corriente.
	 * 
	 * @return Un objeto de tipo CuentaCorriente con todos los datos de la nueva
	 *         cuenta.
	 */
	public static CuentaCorriente crearCuenta() {
		// Declaramos el objeto CuentaCorriente donde se almacenará la nueva cuenta tras
		// pedir todos los datos.
		CuentaCorriente nuevaCuenta;

		// Creamos la variable dni como String para almacenar el dni del titular de la
		// cuenta.
		String dni;

		// Creamos al variable nombre como String para almacenar el nombre del titular
		// de la cuenta.
		String nombre;

		// Creamos la variable saldo como double para almacenar el saldo del titular de
		// la cuenta.
		double saldo;

		// Creamos la variable nacionalidad como String para almacenar la nacionalidad
		// del titular de la cuenta.
		String nacionalidad;

		// Llamamos a la función pedirDNI para que nos devuelva el dni que le ha pedido
		// al usuario.
		dni = pedirDNI();

		// Llamamos a la función pedirNombre para que nos devuelva el nombre que le ha
		// pedido al usuario.
		nombre = pedirNombre();

		// Le pedimoa al usuario que introduzca el saldo de la cuenta y lo leemos.
		System.out.print("Introduce el saldo en cuenta del titular: ");
		saldo = sc.nextDouble();
		// Limpiamos buffer.
		sc.nextLine();

		// Le pedimos al usuario que introduzca la nacionalidad y lo leemos.
		System.out.println("Introduce la nacionalidad del titular: ");
		nacionalidad = sc.nextLine().toUpperCase();

		// Creamos con los datos solicitados la nueva cuenta.
		nuevaCuenta = new CuentaCorriente(dni, nombre, saldo, nacionalidad);

		// Devolvemos el objeto nuevaCuenta.
		return nuevaCuenta;
	}

	/**
	 * Esta función se encarga de solicitar al usuario un dni para una cuenta.
	 * 
	 * @return El dni introducido por el usuario.
	 */
	public static String pedirDNI() {
		// Creamos la variable dni como String para almacenar el dni del titular de la
		// cuenta.
		String dni;

		// Le pedimos al usuario que introduzca el dni y lo leemos.
		System.out.print("Introduce el dni del titular: ");
		dni = sc.nextLine();

		// Devolvemos el dni introducido por el usuario.
		return dni;
	}

	/**
	 * Esta función se encarga de solicitar al usuario el nombre del titular de una
	 * cuenta.
	 * 
	 * @return El nombre introducido por el usuario.
	 */
	public static String pedirNombre() {
		// Creamos al variable nombre como String para almacenar el nombre del titular
		// de la cuenta.
		String nombre;

		// Le pedimos al usuario que introduzca el nombre y lo leemos.
		System.out.print("Introduce el nombre del titular: ");
		nombre = sc.nextLine();

		// Devolvemos el nombre introducido por el usuario.
		return nombre;
	}

	/**
	 * Esta función se encarga de solicitar al usuario el dinero que se desea
	 * ingresar en una cuenta.
	 * 
	 * @return El dinero introducido por el usuario.
	 */
	public static double pedirDinero() {
		// Creamos la variable dinero como double para almacenar la cantidad de dinero
		// que se desea ingresar o retirar de una cuenta.
		double dinero;

		// Le pedimos al usuario que introduzca el dinero y lo leemos.
		System.out.print("Introduce la cantidad: ");
		dinero = sc.nextDouble();
		// Limpiamos buffer.
		sc.nextLine();

		// Devolvemos el dinero introducido por el usuario.
		return dinero;
	}
}
