package parte1.ejercicio1;

public class PrincipalPunto {

	public static void main(String[] args) {

		// Creamos 3 objetos Puntos con sus respectivas cordenadas.
		Punto punt1 = new Punto();
		Punto punt2 = new Punto();
		Punto punt3 = new Punto();

		// Añadimos las cordenadas para el punt1.
		punt1.x = 5;
		punt1.y = 0;

		// Añadimos las cordenadas para el punt2.
		punt2.x = 10;
		punt2.y = 10;

		// Añadimos las cordenadas para el punt3.
		punt3.x = -3;
		punt3.y = 7;

		// Imprimimos las cordenadas de los 3 puntos
		System.out.println("Coordenadas");
		System.out.println("Punto 1: (" + punt1.x + ", " + punt1.y + ")");
		System.out.println("Punto 2: (" + punt2.x + ", " + punt2.y + ")");
		System.out.println("Punto 3: (" + punt3.x + ", " + punt3.y + ")");

		// Modificamos las cordenadas del punt1.
		punt1.x *= 2;
		punt1.y += 5;

		// Modificamos las cordenadas del punt2.
		punt2.x -= 1;
		punt2.y /= 2;

		// Modificamos las cordenadas del punt3.
		punt3.x += 2;
		punt3.y %= 7;

		// Imprimimos las cordenadas de los 3 puntos tras ser modificados.
		System.out.println("\nCoordenadas modificadas");
		System.out.println("Punto 1: (" + punt1.x + ", " + punt1.y + ")");
		System.out.println("Punto 2: (" + punt2.x + ", " + punt2.y + ")");
		System.out.println("Punto 3: (" + punt3.x + ", " + punt3.y + ")");
	}

}
