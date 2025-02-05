package parte1.ejercicio4;

/**
 * Creamos la clase Articulo para alamcenar los atributos que debe de contener
 * un articulo.
 */
public class Articulo {

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del atributo.
	 */
	private String nombre;

	/**
	 * Creamos el atributo precio como double para almacenar el precio del articulo
	 * sin IVA.
	 */
	private double precio;

	/**
	 * Creamos la constante IVA como int para almacenar el porcentaje del IVA.
	 */
	public static final int IVA = 21;

	/**
	 * Creamos la variable cuantosQuedan como int para almacenar la cantidad de
	 * articulos que quedan.
	 */
	private int cuantosQuedan;

	/**
	 * Creamos un constructor con parametros
	 * 
	 * @param nombre        El nombre del articulo.
	 * @param precio        El precio del articulo.
	 * @param cuantosQuedan La cantidad de productos que quedan.
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		// Comprobamos si el nombre no esta a null ni vacio.
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		// Comprobamos si el precio es mayor que 0.
		if (precio > 0) {
			this.precio = precio;
		}

		// Comprobamos si el cuantosQuedan es mayor o igual a 0.
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	/**
	 * Devuelve el nombre del articulo.
	 * 
	 * @return El nombre del articulo.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el precio del articulo.
	 * 
	 * @return El precio del articulo.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Modificamos el precio del articulo.
	 * 
	 * @param precio El precio del articulo. Comprobamos que el precio sea mayor que
	 *               0.
	 */
	public void setPrecio(double precio) {
		// Comprobamos si el precio es mayor que 0.
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Devuelve la cantidad de articulos disponibles.
	 * 
	 * @return Articulos disponibles.
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Modificamos la cantidad de articulos restantes.
	 * 
	 * @param cuantosQuedan Articulos disponibles. Comprobamos si son mayor o igual
	 *                      a 0.
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		// Comprobamos si el cuantosQuedan es mayor o igual a 0.
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

}
