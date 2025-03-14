package examen;

import java.util.Scanner;

public class PrincipalEmpleado {

	// Creamos el Scanner como static para acceder a el desde cualquier función que
	// se necesite.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos la variable opc como int para alamcenar la opción del usuario
		// seleccioanda del menú.
		int opc;

		// Creamos la variable dni como String para almacenar el dni que nos devuelve la
		// función pedirDNI.
		String dni;

		// Creamos la varible horasExtra como int para almacenar las horas extras que
		// nos devuelve la función pedirHorasExtra.
		int horasExtra;

		//Creamos la variable valorHora como double para almacenar el nuevo valor de una hora extra.
		double valorHora;
		
		// Creamos un objeto auxiliar para almacenar un objeto de tipo Empelado de forma
		// temporal.
		Empleado empleado;

		do {

			// Llamamos a la función menu para que nos muestre todas las opciones del menú.
			menu();
			// Leemos la opc seleccionada
			opc = sc.nextInt();
			// Limpiamos el buffer.
			sc.nextLine();

			switch (opc) {
			// Añadimos un empleado a nuestro conjunto.
			case 1 -> {
				// Almacenamos en el obejeto temporal el nuevo empleado que nos devuelve la
				// función crearEmpleado.
				empleado = crearEmpleado();

				// Comprobamos si la función añadirEmpleado nos ha añadido al empleado a la
				// lista o no.
				if (ListadoEmpleados.añadirEmpleado(empleado)) {
					// Si se ha añadido, imprimimos que el nuevo empleado se encuentra en nuestra
					// lista.
					System.out.println("El empleado ha sido añadido a la lista.");

					// Si no se ha podido añadir, mostramos un mensaje indicando que no se encuentra
					// en la lista.
				} else {
					System.out.println("El empleado no se ha podido añadir a la lista.");
				}
			}

			// Listar empleados.
			case 2 -> {
				// Llamamos a la función listarEmpleados de la clase ListadoEmpleados para
				// mostrar todos los empleados del conjunto.
				ListadoEmpleados.listarEmpleados();
			}

			// Modificar horas extra.
			case 3 -> {
				// Almacenamos en la variable dni el dni que nos devuelve la función pedirDNI.
				dni = pedirDNI();
				// Creamos un objeto empleado con solo el dni que le acabamos de pedir al
				// usuario.
				empleado = new Empleado(dni);
				// Almacenamos en la variable horasExtra las horas extra que nos devuelve la
				// función pedirHorasExtra
				horasExtra = pedirHorasExtra();

				// Comprobamos si hemos podido modificar las horas, si es así mostramos un
				// mensaje indicandolo.
				if (ListadoEmpleados.modificarHoraExtra(empleado, horasExtra)) {
					System.out.println("Las horas extra se han modificado correctamente.");
					//Si no, se han modificada mostramos otro mensaje indicandolo.
				} else {
					System.out.println("Las horas extra no se han modificado. ");
				}
				
			}
			//Modificar importe horas extra.
			case 4 -> {
				//Le pedimos al usuario que introduzca el valor de una hora extra y lo leemos por teclado.
				System.out.println("Introduce el nuevo valor de una hora extra: ");
				valorHora = sc.nextDouble();
				
				//Comprobamos si el valor introducido por el usuario es mayor que 0.
				if (valorHora > 0) {
					//Llamamos a la función setValorHExtra y le pasamos por parametro la nueva hora.
					Empleado.setValorHExtra(valorHora);
					//Mostramos un mensaje de que se ha modificado correctamente.
					System.out.println("El valor de las horas extra se ha cambiado correctamente.");
					
					//Si no es mayor que 0.
				} else {
					System.out.println("El valor de las horas extra no se ha podido cambiar.");
				}
				
			}
			//Eliminar empleado.
			case 5 -> {
				// Almacenamos en la variable dni el dni que nos devuelve la función pedirDNI.
				dni = pedirDNI();
				// Creamos un objeto empleado con solo el dni que le acabamos de pedir al
				// usuario.
				empleado = new Empleado(dni);
				
				//Comprobamos si la función eliminarEmpleado nos ha eliminado al empleado, si es así...
				if (ListadoEmpleados.eliminarEmpleado(empleado)) {
					//Mostramos un mesaje de que el empleado se ha eliminado correctamente.
					System.out.println("El empleado se ha eliminado correctamente.");
					
					//Si no se ha eliminado mostramos un mesaje de que el empleado no se ha eliminado.
				} else {
					System.out.println("El empleado no se ha eliminado");
				}
			}
			// Salir del programa.
			case 0 -> {
				// Mostramos un mensaje de salida.
				System.out.println("Saliendo del sistema...");
			}
			// Opción introducida incorrecta.
			default -> {
				// Mostramos un mensaje de que la opción introducida es incorrecta.
				System.out.println("La opción introducida no se encuentra en el menú.");
			}
			}

			// Comprobamos si la opción es distinto de 0, en ese caso seguiremos ejecuentado
			// el bucle.
		} while (opc != 0);

		// Cierre de Scanner.
		sc.close();
	}

	/**
	 * Esta función se encarga de imprimir todas las opciones del menú.
	 */
	public static void menu() {
		System.out.println("1. Añadir empleado.");
		System.out.println("2. Listar empleados.");
		System.out.println("3. Modificar horas extra.");
		System.out.println("4. Modificar importe horas extra.");
		System.out.println("5. Eliminar empleado.");
		System.out.println("0. Salir");
		System.out.print("Introduce la opc seleccionada: ");
	}

	/**
	 * Esta función se encarga de solicitar todos los datos para crear a un nuevo
	 * empelado.
	 * 
	 * @return El nuevo objeto de empleado ya creado.
	 */
	public static Empleado crearEmpleado() {
		// Declaramos un objeto de tipo Empleado que sera el que devolvamos.
		Empleado empl;

		// Creamos la variable dni como String para almacenar el dni de un empleado.
		String dni;

		// Creamos la variable nombre como String para almacenar el nombre de un
		// empleado.
		String nombre;

		// Creamos la variable sueldoBase como double para almacenar el sueldo base de
		// un empleado.
		double sueldoBase;

		// Creamos la variable horasExtra como int para almacenar las horas extra que ha
		// trabajado un empleado.
		int horasExtra;

		// Le asignamos a la variable dni el dni que nos devuelve la función pedirDNI.
		dni = pedirDNI();

		// Le pedimos al usuario que introduzca el nombre de un empleado y lo leemos.
		System.out.println("Introduce el nombre del empleado: ");
		nombre = sc.nextLine();

		// Le pedimos al usuario que introduzca el sueldo base de un empelado y lo
		// leemos.
		System.out.println("Introduce el sueldo base del empleado: ");
		sueldoBase = sc.nextDouble();
		// Limpiamos buffer.
		sc.nextLine();

		// Le asignamos a la variable horasExtra las horas extra que nos devuelve la
		// función pedirHorasExtra.
		horasExtra = pedirHorasExtra();

		// Creamos el empleado con todos los datos solicitados al usuario.
		empl = new Empleado(dni, nombre, sueldoBase, horasExtra);

		// Devolvemos el empleado que acabamos de crear.
		return empl;
	}

	/**
	 * Esta función se encarga de solicitar al usuario las horas extras de un
	 * empelado.
	 * 
	 * @return Las horas extras de un empleado.
	 */
	public static int pedirHorasExtra() {
		// Creamos la variable horasExtra como int para almacenar las horas extra que ha
		// trabajado un empleado.
		int horasExtra;

		// Le pedimos al usuario que introduzca la cantidad de horas extra trabajadas y
		// lo leemos.
		System.out.println("Introduce la cantidad de horas extras trabajadas por el empleado: ");
		horasExtra = sc.nextInt();
		//Limpiamos buffer
		sc.nextLine();

		// Devolvemos las horas extras de un empleado.
		return horasExtra;
	}

	/**
	 * Esta función se encarga de solictar al usuario el dni de un empleado.
	 * 
	 * @return El dni de un empleado.
	 */
	public static String pedirDNI() {
		// Creamos la variable dni como String para almacenar el dni de un empleado.
		String dni;

		// Le pedimos al usuario que introduzca el dni de un empleado y lo leemos.
		System.out.println("Introduce el dni del empleado: ");
		dni = sc.nextLine();

		// Devolvemos el dni solicitado al usuario.
		return dni;
	}

}
