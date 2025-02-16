package parte3.ejercicio2;

import java.util.Scanner;

public class PrincipalMedia {

	public static void main(String[] args) {

		// Creamos un objeto de tipo media.
		Media calcularMedia = new Media();

		// Creamos la variable num1 como int para almacenar el primer número introducido
		// por el usuario.
		int num1;

		// Creamos la variable num2 como int para almacenar el segundo número
		// introducido por el usuario.
		int num2;

		// Creamos la variable num3 como int para almacenar el tercer número introducido
		// por el usuario.
		int num3;

		// Creamos el Scanner para leer los números introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el primer número y lo leemos.
		System.out.print("Introduce el primer número: ");
		num1 = sc.nextInt();

		// Le pedimos al usuario que introduzca el segundo número y lo leemos.
		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextInt();

		// Le pedimos al usuario que introduzca el tercer número y lo leemos.
		System.out.print("Introduce el tercer número: ");
		num3 = sc.nextInt();

		// Mostramos las dos medias
		System.out.println("\nMEDIA DE NÚMEROS");
		// Media con los dos primeros números
		System.out.println("Media con dos números --> " + calcularMedia.media(num1, num2));
		// Media con todos los números.
		System.out.println("Media con tres números --> " + calcularMedia.media(num1, num2, num3));

		// Cierre de Scanner
		sc.close();
	}

}
