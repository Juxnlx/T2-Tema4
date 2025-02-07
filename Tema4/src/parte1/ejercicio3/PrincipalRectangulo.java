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
		perimetro = ((rect1.getX2() - rect1.getX1()) * 2) + ((rect1.getY2() - rect1.getY1()) * 2);
		// Area del primer rectangulo.
		area = (rect1.getX1() - rect1.getX2()) * (rect1.getY1() - rect1.getY2());

		// Imprimimos las caracteristicas del primer rectangulo
		System.out.println("1º Rectangulo -->");
		System.out.println("Coordenadas: (" + rect1.getX1() + ", " + rect1.getY1() + ")(" + rect1.getX2() + ", " + rect1.getY2() + ")");
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);

		/*
		 * SEGUNDO RECTANGULO
		 */

		// Perimetro del segundo rectangulo
		perimetro = ((rect2.getX1() - rect2.getX2()) * 2) + ((rect2.getY1() - rect2.getY2()) * 2);
		// Area del segundo rectangulo.
		area = (rect2.getX1() - rect2.getX2()) * (rect2.getY1() - rect2.getY2());

		// Imprimimos las caracteristicas del segundo rectangulo
		System.out.println("\n2º Rectangulo -->");
		System.out.println("Coordenadas: (" + rect2.getX1() + ", " + rect2.getY1() + ")(" + rect2.getX2() + ", " + rect2.getY2() + ")");
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area + "\n");

		/*
		 * PRIMER RECTANGULO MODIFICADO
		 */

		// Modificamos todas las coordenadas del rectangulo 1.
		rect1.setAll(3, 2, 5, 8);

		// Perimetro del primer rectangulo
		rect1.getPerimetro();
		// Area del primer rectangulo.
		rect1.getArea();

		// Imprimimos las caracteristicas del primer rectangulo
		System.out.println("1º Rectangulo -->");
		System.out.println(rect1);

		/*
		 * SEGUNDO RECTANGULO MODIFICADO
		 */

		// Guardamos las respectivas coordenadas del segundo rectangulo.
		rect2.setX1(rect2.getX1()-1);
		rect2.setY1(rect2.getY1()/3);
		rect2.setX2(rect2.getX2()*5);
		rect2.setY2(rect2.getY2()+5);

		// Perimetro del segundo rectangulo
		perimetro = ((rect2.getX2() - rect2.getX1()) * 2) + ((rect2.getY2() - rect2.getY1()) * 2);
		// Area del segundo rectangulo.
		area = (rect2.getX1() - rect2.getX2()) * (rect2.getY1() - rect2.getY2());

		// Imprimimos las caracteristicas del segundo rectangulo
		System.out.println("\n2º Rectangulo modificado-->");
		System.out.println("Coordenadas: (" + rect2.getX1() + ", " + rect2.getY1() + ")(" + rect2.getX2() + ", " + rect2.getY2() + ")");
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
	}

}
