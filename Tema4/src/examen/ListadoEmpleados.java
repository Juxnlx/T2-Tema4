package examen;

import java.util.HashSet;

public class ListadoEmpleados {

	// Creamos un conjunto para almacenar todos los Empelados que vayamos creando.
	// Utilizamos un HasSet porque no nos permite añadir empleados que ya existe (no
	// hay repetidos).
	static HashSet<Empleado> listadoEmpl = new HashSet<Empleado>();

	/**
	 * Esta función se encarga de añadir un empleado a nuestro conjunto listadoEmpl.
	 * 
	 * @param empl El nuevo empleado pasado como parametro.
	 * @return true si el empleado se ha añadido a la lista, false si no lo ha
	 *         hecho.
	 */
	public static boolean añadirEmpleado(Empleado empl) {
		// Devolvemos el boolean que nos devuelve la función add que nos indicara si se
		// ha añadido o no el nuevo empleado.
		return listadoEmpl.add(empl);
	}

	/**
	 * Esta función se encarga de recorrer el conjunto de empleados e ir mostrando
	 * uno por uno.
	 */
	public static void listarEmpleados() {
		// Recorremos el conjunto listadoEmpl con un for-each, para ir imprimiendo
		// empleado por empledado.
		for (Empleado empl : listadoEmpl) {
			System.out.println(empl);
			System.out.println("--------------------------------------------");
		}
	}

	/**
	 * Esta función se encarga de buscar un empleado en el conjunto.
	 * 
	 * @param empl El empleado qeu estamos buscando.
	 * @return null si no lo ha encontrado y si lo ha encontrado devuelve al
	 *         empelado.
	 */
	public static Empleado buscaEmpleado(Empleado empl) {
		// Declaramos un objeto de tipo Empleado como null, sera el objeto que
		// devolveremos en el case de encrontremos al empleamos que buscamos.
		Empleado empleado = null;

		// Recorremos el conjunto de empleado.
		for (Empleado emp : listadoEmpl) {
			// Comprobamos si el obejeto que recorremos y el pasado como parametro son
			// iguales.
			if (empl.equals(emp)) {
				// Asignamos al objeto Empleado que se encuentra a null el objeto que acabamos
				// de encontrar.
				empleado = emp;
			}
		}

		// Devolvemos el obejeto empleado o null si no se ha encontrado.
		return empleado;
	}

	/**
	 * Esta función se encarga de modificar las horas extra de un empleado.
	 * 
	 * @param empl  El empleado al que hay que modificarle las horas.
	 * @param horas Las horas extras nuevas (las que hay que modificar).
	 * @return true si se han modificado, false si no lo han hecho.
	 */
	public static boolean modificarHoraExtra(Empleado empl, int horas) {
		// Creamos la variable boolean modificar como boolean para indicar mediante un
		// boolean si se ha modiicado o no las horas del empelado.
		boolean modificar = false;

		// Creamos un objeto de tipo empleado para almacenar el empleado que nos ha
		// devuelto la función buscarEmpleado.
		Empleado empleado = buscaEmpleado(empl);

		// Comprobamos si es distinto de null para comprobar que existe.
		if (empleado != null) {
			// Llamamos a la función setHorasExtra y le pasamos por parametro las nuevas
			// horas.
			empleado.setHorasExtra(horas);
			// Cambiamos la variable boleana modicar a true.
			modificar = true;
		}

		// Devolvemos la variable modificar que nos devuelve true o false indicandonos
		// si se ha devuelto o no.
		return modificar;
	}

	/**
	 * Esta función se encarga de eliminar el empleado pasado como parametro.
	 * 
	 * @param empl El empleado que se tiene que eliminar.
	 * @return true si se ha eliminado, false si no lo ha hecho.
	 */
	public static boolean eliminarEmpleado(Empleado empl) {
		// Devolvemos el valor que nos devuelve la función remove, la utilizamos para
		// eliminar un empleado del conjunto.
		return listadoEmpl.remove(empl);
	}

}