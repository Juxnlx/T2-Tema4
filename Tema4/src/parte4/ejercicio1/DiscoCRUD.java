package parte4.ejercicio1;

import java.util.HashSet;

public class DiscoCRUD {
	// Creamos el conjunto conjuntoDisco para almacenar todos los discos.
	static HashSet<Disco> conjuntoDisco = new HashSet<Disco>();

	/**
	 * Esta función se encarga de recorrer todo el conjunto e imprimir cada disco.
	 */
	public static void listadoDisco() {
		// Creamos un bucle for-each para recorrer el conjunto dsicos e ir mostrando uno
		// a uno.
		for (Disco disco : conjuntoDisco) {
			System.out.println(disco);
			System.out.println("--------------------------------------------------------");
		}
	}

	/**
	 * Esta función se encarga de añadir un objeto dsico al conjunto pedidosDisco.
	 * 
	 * @param dsico El objeto disco añadido como parametro.
	 * @return true si se ha añadido correctamente, false si no lo ha hecho.
	 */
	public static boolean añadirDisco(Disco disco) {
		// Devolvemos un boleano indicandonos si el disco se ha añadido al conjunto.
		return conjuntoDisco.add(disco);
	}

	/**
	 * Esta función se encarga de eliminar un disco pasado como parametro del
	 * conjunto eliminarDisco.
	 * 
	 * @param d El objeto Disco pasado como parametro.
	 * @return true si se ha eliminado. False si no se ha eliminado.
	 */
	public static boolean eliminarDisco(Disco d) {
		return conjuntoDisco.remove(d);
	}

}