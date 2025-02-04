package parte1.ejercicio3;

/**
 * Esta clase crea dos objetos Rectangulos con unas coordenadas concretas y
 * calcula su area y perimetro y luego vuelve a mostrar lo mismo de cada
 * rectangulo pero con sus coordenadas modificadas.
 */
public class PrincipalRectangulo {

	public static void main(String[] args) {

		// Creamos dos objetos Rectangulos para almacenar dos rectangulos distintos.
		Rectangulo rect1 = new Rectangulo(0, 0, 5, 5);
		Rectangulo rect2 = new Rectangulo(7, 9, 2, 3);

		// Creamos la variable perimetro como double para almacenar el perimero de cada
		// rectangulo.
		double perimetro;

		// Creamos la variable area como double para almacenar el area de cada
		// rectangulo.
		double area;

		/*
		 * PRIMER RECTANGULO
		 */

		// Perimetro del primer rectangulo
		perimetro = ((rect1.x2 - rect1.x1) * 2) + ((rect1.y2 - rect1.y1) * 2);
		// Area del primer rectangulo.
		area = (rect1.x1 - rect1.x2) * (rect1.y1 - rect1.y2);

		// Imprimimos las caracteristicas del primer rectangulo
		System.out.println("1º Rectangulo -->");
		System.out.println("Coordenadas: (" + rect1.x1 + ", " + rect1.y1 + ")(" + rect1.x2 + ", " + rect1.y2 + ")");
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);

		/*
		 * SEGUNDO RECTANGULO
		 */

		// Perimetro del segundo rectangulo
		perimetro = ((rect2.x1 - rect2.x2) * 2) + ((rect2.y1 - rect2.y2) * 2);
		// Area del segundo rectangulo.
		area = (rect2.x1 - rect2.x2) * (rect2.y1 - rect2.y2);

		// Imprimimos las caracteristicas del segundo rectangulo
		System.out.println("\n2º Rectangulo -->");
		System.out.println("Coordenadas: (" + rect2.x1 + ", " + rect2.y1 + ")(" + rect2.x2 + ", " + rect2.y2 + ")");
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);

		/*
		 * PRIMER RECTANGULO MODIFICADO
		 */

		// Guardamos las coordenadas del primer rectangulo modificadas.
		rect1.x1 += 5;
		rect1.y1 += 8;
		rect1.x2 -= 5;
		rect1.y2 -= 3;

		// Perimetro del primer rectangulo
		perimetro = ((rect1.x1 - rect1.x2) * 2) + ((rect1.y1 - rect1.y2) * 2);
		// Area del primer rectangulo.
		area = (rect1.x1 - rect1.x2) * (rect1.y1 - rect1.y2);

		// Imprimimos las caracteristicas del primer rectangulo
		System.out.println("\n1º Rectangulo modificado -->");
		System.out.println("Coordenadas: (" + rect1.x1 + ", " + rect1.y1 + ")(" + rect1.x2 + ", " + rect1.y2 + ")");
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);

		/*
		 * SEGUNDO RECTANGULO MODIFICADO
		 */

		// Guardamos las respectivas coordenadas del segundo rectangulo.
		rect2.x1 -= 1;
		rect2.y1 /= 3;
		rect2.x2 *= 5;
		rect2.y2 += 5;

		// Perimetro del segundo rectangulo
		perimetro = ((rect2.x2 - rect2.x1) * 2) + ((rect2.y2 - rect2.y1) * 2);
		// Area del segundo rectangulo.
		area = (rect2.x1 - rect2.x2) * (rect2.y1 - rect2.y2);

		// Imprimimos las caracteristicas del segundo rectangulo
		System.out.println("\n2º Rectangulo modificado-->");
		System.out.println("Coordenadas: (" + rect2.x1 + ", " + rect2.y1 + ")(" + rect2.x2 + ", " + rect2.y2 + ")");
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
	}

}
