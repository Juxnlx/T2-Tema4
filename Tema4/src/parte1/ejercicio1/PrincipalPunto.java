package parte1.ejercicio1;

/**
 * Creamos 3 objetos Puntos con unas coordenadas concretas.
 */
public class PrincipalPunto {

	public static void main(String[] args) {

		// Creamos 3 objetos Puntos con sus respectivas cordenadas.
		Punto punt1 = new Punto(5, 6);
		Punto punt2 = new Punto(10, 10);
		Punto punt3 = new Punto(-3, 7);

		// Creamos la variable distancia como double para almacenar la distancia entre
		// dos puntos.
		double distancia;

		// Creamos la variable coordenada como String para almacenar la coordenada de un
		// punto.
		String coordenada;

		// Imprimimos las cordenadas de los 3 puntos
		System.out.println("Coordenadas");
		System.out.println("Punto 1: (" + punt1.getX() + ", " + punt1.getY() + ")");
		System.out.println("Punto 2: (" + punt2.getX() + ", " + punt2.getY() + ")");
		System.out.println("Punto 3: (" + punt3.getX() + ", " + punt3.getY() + ")");

		// Modificamos las cordenadas del punt1.
		punt1.setX(punt1.getX() + 5);
		punt1.setY(punt1.getX() + 5);

		// Modificamos las cordenadas del punt2.
		punt2.setX(punt2.getX() - 1);
		punt2.setY(punt2.getY() / 2);

		// Modificamos las cordenadas del punt3.
		punt3.setX(punt3.getX() + 2);
		punt3.setX(punt3.getY() - 6);

		// Imprimimos las cordenadas de los 3 puntos tras ser modificados.
		System.out.println("\nCoordenadas modificadas");
		System.out.println("Punto 1: (" + punt1.getX() + ", " + punt1.getY() + ")");
		System.out.println("Punto 2: (" + punt2.getX() + ", " + punt2.getY() + ")");
		System.out.println("Punto 3: (" + punt3.getX() + ", " + punt3.getY() + ")");

		// Modificamos las coordenadas del punt1.
		punt1.setXY(6, 5);

		// Almacenamos en coordenada lo que nos devuelve el metodo toString del punt1.
		coordenada = punt1.toString();

		// Imprimimos el punt1
		System.out.print("\nPunto 1 modificado --> " + coordenada);

		// Desplazamos las coordenadas del punt1.
		punt1.desplaza(1, 1);

		// Almacenamos en coordenada lo que nos devuelve el metodo toString del punt1.
		coordenada = punt1.toString();

		// Imprimimos el punt1
		System.out.print("\nPunto 1 modificado --> " + coordenada);

		// Calculamos la distancia entre el punt1 y el punt2.
		distancia = punt1.distancia(punt2);

		System.out.println("\nDistancia entre punt1 y punt2 --> " + distancia);
	}

}
