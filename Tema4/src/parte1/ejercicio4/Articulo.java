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

	/**
	 * Esta función se encarga de calcular el PVP del articulo.
	 * 
	 * @return Devolvemos el PVP del articulo.
	 */
	public double getPVP() {
		// Creamos la variable precioFinal como double para almacenar el valor del
		// precio final.
		double precioFinal;

		// Calculamos el precio total (precio del producto + IVA).
		precioFinal = (((IVA * this.precio) / 100) + this.precio);

		// Devolvemos el precio mas IVA.
		return precioFinal;
	}

	/**
	 * Esta función se encarga de calcular el precio del articulo con el precio ya
	 * calculado.
	 * 
	 * @param descuento El porcentaje de descuento a aplicar al producto.
	 * @return precioDescuento. El precio con el descuento ya aplicado.
	 */
	public double getPVPDescuento(int descuento) {
		// Calculamos el precio con el descuento ya aplicado.
		this.precio = (this.precio - ((descuento * this.precio) / 100));

		// Devolvemos el precio con el descuento aplicado.
		return precio;
	}

	/**
	 * Esta función se encarga de calcular si es posible o no efectuar una compra de
	 * un producto, teniendo en cuenta la cantidad de articulos que quedan
	 * disponibles.
	 * 
	 * @param cantidad. La cantidad de productos que se quieren vender.
	 * @return ventaPosible. True si quedan articulos suficientes para vender, false
	 *         si no.
	 */
	public boolean vender(int cantidad) {
		// Creamos la variable ventaPosible como boolean para almacenar true o false si
		// se puede o no, dependiendo a la cantidad del producto.
		boolean ventaPosible = false;

		// Comprobamos si el stock del articulo es mayor o igual que 0, estonces
		// devolvemos true, porque entonces si se puede vender esa cantidad del
		// articulo.
		if ((this.cuantosQuedan - cantidad) >= 0) {
			ventaPosible = true;
			// Altualizamos la variable cuentosQuedan.
			this.cuantosQuedan -= cantidad;
		}

		// Devolvemos si se ha podido o no efectuar la comprar.
		return ventaPosible;
	}

	/**
	 * Esta función se encarga de actualizar el stock del articulo.
	 * 
	 * @param cantidad. La cantidad de articulos nuevos que hemos repuesto.
	 */
	public void almacenar(int cantidad) {
		// Comprobamos si la cantidad es mayor que 0.
		if (cantidad > 0) {
			// Añadimos al stock del articulo la cantidad de articulos nuevos a reponer.
			this.cuantosQuedan += cantidad;
		}
	}

	/**
	 * Esta función se encarga de imprimir todos los datos de un articulo.
	 * 
	 * @return Una cadena donde se almacenan todos los datos de un articulo.
	 */
	public String toString() {
		// Creamos la variable datosArticulo como String para almacenar todos los datos
		// del articulo.
		String datosArticulo;

		datosArticulo = "Nombre: " + this.nombre + "\n";
		datosArticulo += "Precio: " + getPVP() + "\n";
		datosArticulo += "Stock: " + this.cuantosQuedan;

		// Devolvemos la cadena datosArticulo, donde se almacena todos los datos de un
		// articulo.
		return datosArticulo;
	}

}
