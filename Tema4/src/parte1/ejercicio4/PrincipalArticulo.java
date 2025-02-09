package parte1.ejercicio4;

import java.util.Scanner;

/**
 * Esta clase crea dos objetos Articulo con distintos datos cada uno e
 * imprimimos su precio final y luego lo volvemos a mostrar pero con el precio
 * cambiado, eso de cada articulo.
 */
public class PrincipalArticulo {

	public static void main(String[] args) {

		// Creamos un articulo.
		Articulo art1 = new Articulo("Cascos", 86, 4);
		Articulo art2 = new Articulo("Sudadera", 25, -1);
		Articulo art3 = new Articulo("Zapatillas", 72, 10);

		// Creamos la variable cantidad para almacenar la cantidad que decontar o sumar
		// al stock del articulo.
		int cantidad;

		// Creamos el Scanner para solicitar la cantidad de articulos que quiere el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Imprimimos la información el articulo.
		System.out.println("1º Articulo");
		System.out.println(art1);

		// Modificamos el precio del articulo.
		art1.setPrecio(art1.getPrecio() - 12);

		// Volvemos a imprimir el articulo
		System.out.println("Articulo con precio modificado -->");
		System.out.println(art1);

		// Imprimimos la información el articulo.
		System.out.println("\n2º Articulo");
		System.out.println(art2);

		// Modificamos el precio del articulo.
		art2.setPrecio(art2.getPrecio() - 10);

		// Volvemos a imprimir el articulo
		System.out.println("Articulo con precio modificado -->");
		System.out.println(art2);

		System.out.println("\n3º Articulo");
		System.out.println("Le pedimos al usuario que introduzca la cantidad de zapatillas que quiere: ");
		cantidad = sc.nextInt();

		if (art3.vender(cantidad)) {
			System.out.println("Enhorabuena la venta ha sido posible.");
		} else {
			System.out.println("Lo siento, no hay suficientes productos es stock.");
		}

		System.out.println(art3);

		// Cierre de Scanner
		sc.close();
		
	}

}
