package parte1.ejercicio3;

/**
 * La clase Rectangulo se encarga de almacenar los atributos de los que consta
 * un rectangulo.
 */
public class Rectangulo {

	/**
	 * Creamos el atributo x1 para almacenar la primera cordenada del rectangulo.
	 */
	int x1;

	/**
	 * Creamos el atributo y1 para almacenar la segunda cordenada del rectangulo.
	 */
	int y1;

	/**
	 * Creamos el atributo x2 para almacenar la primera cordenada de otro plano del
	 * rectangulo.
	 */
	int x2;

	/**
	 * Creamos el atributo y2 para almacenar la primera cordenada de otro plano del
	 * rectangulo.
	 */
	int y2;

	/**
	 * Creamos este constructor con parametros.
	 * 
	 * @param x1 Coordenada x1 del primer punto.
	 * @param y1 Coordenada y1 del primer punto.
	 * @param x2 Coordenada x2 del segundo punto.
	 * @param y2 Coordenada y2 del segundo punto.
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {
		//Comprobamos si la coordenada x1 es menor que x2 y si la coordenada y1 es menor que y2.
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		
	}
	
	
}
