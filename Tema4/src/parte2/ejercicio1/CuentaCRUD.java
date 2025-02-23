package parte2.ejercicio1;

import java.util.HashSet;

public class CuentaCRUD {

	// Creamos un conjunto HashSet para almacenar todas las cuenta.
	static HashSet<CuentaCorriente> conjuntoCuentaC = new HashSet<CuentaCorriente>();

	/**
	 * Esta función se encarga de añadir al conjunto conjuntoCuentaC el objeto
	 * cuenta pasado como parametro.
	 * 
	 * @param cuenta El objeto CuentaCorriente con todos los datos de una nueva
	 *               cuenta.
	 * @return True si la cuenta se ha añadido correctamente. False si no se ha
	 *         añadido.
	 */
	public static boolean añadirCuenta(CuentaCorriente cuenta) {
		// La función add nos devuelve un boolean indicandonos si la cuenta pasada como
		// parametro se ha añadido o no.
		return conjuntoCuentaC.add(cuenta);
	}

	/**
	 * Esta función se encarga de recorrer el conjunto y encontrar una cuenta con el
	 * mismo dni y nombre pasado como parametro.
	 * 
	 * @param dni    El dni del titular de la cuenta.
	 * @param nombre El nombre del titular de la cuenta.
	 * @return La cuenta si la encuentra. Null si no encuentra la cuenta.
	 */
	public static CuentaCorriente buscarCuenta(String dni, String nombre) {
		// Declaramos una cuenta a null.
		CuentaCorriente cuenta = null;

		// Recorremos el conjunto con un for-each.
		for (CuentaCorriente c : conjuntoCuentaC) {
			// Comprobamos si el dni y el nombre pasado como parametro coinciden con alguna
			// de las cuentas que se encuentran en el conjunto.
			if (dni.equals(c.getDni()) && nombre.equalsIgnoreCase(c.getNombre())) {
				cuenta = c;
			}
		}

		// Devolvemos el objeto cuenta
		return cuenta;
	}

	/**
	 * Esta función se encarga de modificar el nombre o la nacionalidad segun la opc
	 * pasada como parametro.
	 * 
	 * @param dni         El dni del titular de la cuenta.
	 * @param nombre      El nombre actual del titular de la cuenta
	 * @param opc         La opción que determinará que se modificará.
	 * @param nuevoNombre El neuvo nombre en caso de que se modifique el nombre.
	 * @return True si se ha modificado algo. False si no se ha modificado nada.
	 */
	public static boolean modificarCuenta(String dni, String nombre, int opc, String nuevoNombre) {
		// Creamos la variable modificado como boolean para almacenar si el nombre o
		// nacionalidad, se ha cambiado.
		boolean modificado = false;

		// Esta variable almacena la nacionalidad del objeto al que le vamos a cambiar
		// la nacionalidad.
		String nacionVieja;

		// En un objeto CuentaCorriente almacenamos el objeto que nos devuelve la
		// función
		CuentaCorriente c = buscarCuenta(dni, nombre);

		// Comprobamos si la cuenta con esos datos se ha encontrado o no.
		if (c != null) {
			// Comprobamos si al opc introducida por el usuario es 1, si es así...
			if (opc == 1) {
				// Modificamos el nombre por el nuevo.
				c.setNombre(nuevoNombre);

				// Si no...
			} else {
				// En la variable nacionVieja almacenamos la en forma de cadena la nacionalidad
				// de ese titular de la cuenta.
				nacionVieja = String.valueOf(c.getNacion());

				// Comprobamos si la nacion es igual a española, si es así lo cambiamos a
				// extranjera y si no al contrario.
				if (nacionVieja.equals("ESPAÑOLA")) {
					c.setNacion("EXTRANJERA");
				} else {
					c.setNacion("ESPAÑOLA");
				}
			}
			// Devolvemos true porque se ha modificado algo.
			modificado = true;
		}

		// Devolvemos la variable modificado.
		return modificado;
	}

	/**
	 * Esta función se encarga de eliminar una cuenta pasada como parametro del
	 * conjunto.
	 * 
	 * @param d El objeto CuentaCorriente pasado como parametro.
	 * @return true si se ha eliminado. False si no se ha eliminado.
	 */
	public static boolean eliminarCuenta(CuentaCorriente c) {
		// La función remove nos devuelve true si ha eliminado la cuenta, false en caso
		// contrario.
		return conjuntoCuentaC.remove(c);
	}

	/**
	 * Esta función se encarga de recorrer todo el conjunto e imprimir cada cuenta.
	 */
	public static void listadoCuenta() {
		// Creamos un bucle for-each para recorrer el conjunto de cuentas e ir mostrando
		// una a una .
		for (CuentaCorriente c : conjuntoCuentaC) {
			System.out.println(c);
			System.out.println("----------------------");
		}
	}

}
