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

	/**
	 * Esta función se encarga de modicar la coordenada x e y con los valores
	 * pasados por parametro.
	 * 
	 * @param x La coordenada x del punto.
	 * @param y La coordenada y del punto.
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Esta función se encarga de desplazar la coordenada x e y con las posiciones
	 * que se le indiquen por parametro.
	 * 
	 * @param dx Las posiciones que debemos de desplazar coordenada x del punto.
	 * @param dy Las posiciones que debemos de desplazar coordenada y del punto.
	 */
	public void desplaza(int dx, int dy) {
		this.x += x;
		this.y += y;
	}

	public double distancia(Punto p) {

		// Creamos la variable distancia como double para almacenar la distancia entre
		// puntos.
		double distancia;

		distancia = Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow((p.getY() - this.y), 2));

		return distancia;
	}
}
