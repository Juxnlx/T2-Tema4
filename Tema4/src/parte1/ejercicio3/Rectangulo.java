package parte1.ejercicio3;

/**
 * La clase Rectangulo se encarga de almacenar los atributos de los que consta
 * un rectangulo.
 */
public class Rectangulo {

	/**
	 * Creamos el atributo x1 para almacenar la primera cordenada del rectangulo.
	 */
	private int x1;

	/**
	 * Creamos el atributo y1 para almacenar la segunda cordenada del rectangulo.
	 */
	private int y1;

	/**
	 * Creamos el atributo x2 para almacenar la primera cordenada de otro plano del
	 * rectangulo.
	 */
	private int x2;

	/**
	 * Creamos el atributo y2 para almacenar la primera cordenada de otro plano del
	 * rectangulo.
	 */
	private int y2;

	/**
	 * Creamos este constructor con parametros.
	 * 
	 * @param x1 Coordenada x1 del primer punto.
	 * @param y1 Coordenada y1 del primer punto.
	 * @param x2 Coordenada x2 del segundo punto.
	 * @param y2 Coordenada y2 del segundo punto.
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {
		// Comprobamos si la coordenada x1 es menor que x2 y si la coordenada y1 es
		// menor que y2.
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

	}

	/**
	 * Devuelve la cordenada x1 del primer punto.
	 * 
	 * @return La coordenada x1 del primer punto.
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Modifica la coordenada x1 del primer punto.
	 * 
	 * @param x1 La coordenada x1 del primer punto. Comprobamos si la x1 es menor
	 *           que x2.
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * Devuelve la coordenada y1 del primer punto.
	 * 
	 * @return La coordenada y1 del primer punto.
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Devuelve la coordenada y1 del primer punto.
	 * 
	 * @param y1 La coordenada y1 del primer punto. Comprobamos si la y1 es menor
	 *           que y2.
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * Devuelve la cordenada x2 del segundo punto.
	 * 
	 * @return La coordenada x2 del segundo punto.
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Modifica la coordenada x2 del segundo punto.
	 * 
	 * @param x1 La coordenada x2 del segundo punto. Comprobamos si la x2 es mayor
	 *           que x1.
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * Devuelve la coordenada y2 del segundo punto.
	 * 
	 * @return La coordenada y2 del segundo punto.
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Devuelve la coordenada y2 del segundo punto.
	 * 
	 * @param y1 La coordenada y2 del segundo punto. Comprobamos si la y2 es mayor
	 *           que y1.
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}

}
