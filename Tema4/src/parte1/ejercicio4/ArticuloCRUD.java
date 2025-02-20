package parte1.ejercicio4;

import java.util.TreeSet;

public class ArticuloCRUD {

	// Creamos un conjunto TreeSet para almacenar articulos de forma ordenada.
	private TreeSet<Articulo> listaArticulos = new TreeSet<Articulo>();

	/**
	 * Esta función se encarga de recorrer nuestro conjunto con todos los articulos
	 * y mostrarlos por consola.
	 */
	public void listarArticulos() {
		// Recorremos nuestro conjunto con todos los alumnos e imprimimos cada objeto
		// alumno que exista en ese conjunto.
		for (Articulo articulo : listaArticulos) {
			System.out.println(articulo);
			System.out.println();
		}
	}

	/**
	 * Esta función se encarga de añadir un nuevo articulo al conjunto.
	 * 
	 * @return true, si se ha añadido. False si no lo ha hecho.
	 */
	public boolean alta(Articulo art) {

		// La función add nos devuelve true si lo ha añadido o false en caso contrario.
		return listaArticulos.add(art);
	}

	/**
	 * Esta función se encarga de recorrer el conjunto y comprobar si hay algun
	 * articulo con el nombre pasado como parametro. Si es así nos devuelve el
	 * objeto que se corresponda a ese nombre, si no nos devuelve el objeto a null.
	 * 
	 * @param nombre El nombre del articulo que queremos buscar.
	 * @return El obejeto articulo si lo encuentra, null si no.
	 */
	public Articulo buscarArticulo(String nombre) {
		// Nos cremos un objeto Articulo donde vamos a almacenar el objeto si es que lo
		// encontramos en el conjunto.
		Articulo ArticuloEncontrado = null;

		// Recorremos el conjunto con todos los articulos.
		for (Articulo artc : listaArticulos) {
			// Comprobamos si el nombre del objeto articulo que estamos recorriendo es igual
			// al nombre pasado como parametro. Si es así, al objeto que hemos creado y
			// vamos a devolver le igualamos ese objeto.
			if (artc.getNombre().equals(nombre)) {
				ArticuloEncontrado = artc;
			}
		}

		// Devolvemos el ArticuloEncontrado.
		return ArticuloEncontrado;
	}

	/**
	 * Esta función se encarga de eliminar el objeto Articulo que le pasamos como
	 * parametro del conjunto listaArticulos.
	 * 
	 * @param art EL objeto articulo pasado como parametro.
	 * @return true si el articulo se ha eliminado correctamente. False si no se ha
	 *         eliminado.
	 */
	public boolean baja(Articulo art) {
		// Devolvemos la función directamente porque el remove nos devuelve un booleano
		// indicandonos si se ha eliminado o no el objeto.
		return listaArticulos.remove(art);
	}

}
