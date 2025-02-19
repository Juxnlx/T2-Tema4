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
	 * @param nombre
	 * @return
	 */
	public Alumno buscarAlumno(String nombre) {
		// Nos cremos un objeto alumno donde vamos a almacenar el objeto si es que lo
		// encontramos en la lista.
		Alumno AlumnoEncontrado = null;

		for (Alumno alum : listaAlumno) {
			if (alum.getNombre().equals(nombre)) {
				AlumnoEncontrado = alum;
			}
		}

		// Devolvemos el alumnoEncontrado.
		return AlumnoEncontrado;
	}

}
