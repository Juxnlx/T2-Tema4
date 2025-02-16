package parte3.ejercicio4;

import java.util.Scanner;

public class PrincipalBoolean {

	public static void main(String[] args) {

		// Creamos un objeto de tipo EjBoolean.
		EjBoolean esTrue = new EjBoolean();

		// Creamos la variable num como int para almacenar el número introducido por el
		// usuario.
		int num;

		// Creamos la variable cadena como String para almacenar la cadena introducida
		// por el usuario.
		String cadena;

		// Creamos el Scanner para leer el número y la cadena introducida por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		do {
			// Le pedimos al usuario que introduzca un número y lo leemos.
			System.out.print("Introduce un número (0 o 1): ");
			num = sc.nextInt();
			// Limpiamos buffer.
			sc.nextLine();
			// Comprobamos si el número es distinto de 0 y de 1, porque en el caso de que se
			// cumpla volvemos a preguntar una opción.
		} while (num != 0 && num != 1);

		// Mostramos el resultado que nos proporciona la función parseToBoolean pero con
		// un número pasado como parametro..
		System.out.println("Resultado: " + esTrue.parseToBoolean(num));

		do {
			// Le pedimos al usuario que introduzca una cadena y lo leemos.
			System.out.print("Introduce una cadena ('true' o 'false'): ");
			cadena = sc.nextLine();
		} while (!cadena.equalsIgnoreCase("true") && !cadena.equalsIgnoreCase("false"));

		// Mostramos el resultado que nos proporciona la función parseToBoolean pero con
		// una cadena pasada como parametro.
		System.out.println("Resultado: " + esTrue.parseToBoolean(cadena));

		// Cierre de Scanner
		sc.close();
	}

}
