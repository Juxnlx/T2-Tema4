package parte1.ejercicio1;

/**
 * Esta clase crea las cordenadas x e y del punto
 */
public class Punto {

	// Creamos el atributo x como int para almacenar la cordenada x de ese punto.
	private int x;

	// Creamos el atributo y como int para almacenar la cordenada y de ese punto.
	private int y;

	/**
	 * Constructor con parametros.
	 * 
	 * @param x Coordenada x del punto.
	 * @param y Coordenaeda y del punto.
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Devuelve el valor de la coordenada x del punto.
	 * 
	 * @return La coordenada x del punto.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Nos permite modificar la coordenada x del punto.
	 * 
	 * @param x Variable x como int para almacenar la coordenada x del punto.
	 */
	void setX(int x) {
		this.x = x;
	}

	/**
	 * Devuelve el valor de la coordenada y del punto.
	 * 
	 * @return La coordenada y del punto.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Nos permite modificar la coordenada y del punto.
	 * 
	 * @param y Variable y como int para almacenar la coordenada y del punto.
	 */
	public void setY(int y) {
		this.y = y;
	}

}
