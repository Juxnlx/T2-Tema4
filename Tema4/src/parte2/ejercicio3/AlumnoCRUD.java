package parte2.ejercicio3;

import java.util.ArrayList;

public class AlumnoCRUD {

	// Creamos un lista para almacenar los alumnos.
	private ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();

	/**
	 * Esta función se encarga de recorrer nuestra lista he imprimirnos cada alumno
	 * que se encuentra en ella.
	 */
	public void imprimirListaAlum() {
		for (Alumno alum : listaAlumno) {
			System.out.println(alum);
			System.out.println("--------------------------");
		}
	}

	/**
	 * Esta función se encarga de comprobrar si el objeto en la lista existe y si no
	 * es el caso lo añade.
	 * 
	 * @param alum El alumno que queremos añadir a la lista.
	 * @return true si el alumno se ha añadido. False si no lo ha hecho.
	 */
	public boolean añadirAlumno(Alumno alum) {
		// Creamos la función existe como boolean para comprobar si el objeto existe o
		// no en la lista.
		boolean existe = false;

		// Comprobamos si no existe ese objeto en la lista, el el cado de ser así
		// añadimos el objeto a la lista y devolvemos true;
		if (!listaAlumno.contains(alum)) {
			listaAlumno.add(alum);
			existe = true;
		}

		return existe;
	}

	/**
	 * Esta función se encarga de recorrer la lista de alumno y devolvernos aquel
	 * alumno con el mismo nombre que hemos pasado como parametro.
	 * 
	 * @param nombre El nombre del alumno
	 * @return El objeto alumno con ese nombre o null si no encuentra ningun alumno
	 *         con ese nombre
	 */
	public Alumno buscarAlumno(String nombre) {
		// Nos cremos un objeto alumno donde vamos a almacenar el objeto si es que lo
		// encontramos en la lista.
		Alumno AlumnoEncontrado = null;

		// Recorremos la lista de todos los alumnos.
		for (Alumno alum : listaAlumno) {
			// Comprobamos si el nombre del objeto alumno que estamos recorriendo es igual
			// al nombre pasada como parametro. Si es así, al objeto que hemos creado y
			// vamos a devolver le igualamos ese objeto.
			if (alum.getNombre().equals(nombre)) {
				AlumnoEncontrado = alum;
			}
		}

		// Devolvemos el alumnoEncontrado.
		return AlumnoEncontrado;
	}

	/**
	 * Esta función se encarga de eliminar de la lista un objeto.
	 * 
	 * @param alum El objeto alumno que queremos eliminar.
	 * @return true, si se ha eliminado. False, si no se ha eliminado.
	 */
	public boolean eliminarAlumno(Alumno alum) {
		return listaAlumno.remove(alum);
	}
}
