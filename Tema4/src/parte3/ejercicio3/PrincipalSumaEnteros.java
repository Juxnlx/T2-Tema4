package parte3.ejercicio3;

import java.util.Scanner;

public class PrincipalSumaEnteros {

	public static void main(String[] args) {
		// Creamos un objeto de tipo media.
		SumaEnteros suma = new SumaEnteros();

		// Creamos la variable num1 como int para almacenar el primer número introducido
		// por el usuario.
		int num1;

		// Creamos la variable num2 como int para almacenar el segundo número
		// introducido por el usuario.
		int num2;

		// Creamos el Scanner para leer los números introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el primer número y lo leemos.
		System.out.print("Introduce el primer número: ");
		num1 = sc.nextInt();

		// Le pedimos al usuario que introduzca el segundo número y lo leemos.
		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextInt();

		// Mostramos las sumas.
		System.out.println("\nSUMA DE NÚMEROS");
		// Suma de números entre 1 y el introducido por el usuario.
		System.out.println("Suma entre 1 y " + num1 + " --> " + suma.sumaEnteros(num1));
		// Suma de números entre num1 y num2.
		System.out.println("Suma entre " + num1 + " y " + num2 + " --> " + suma.sumaEnteros(num1, num2));

		// Cierre de Scanner
		sc.close();
	}

}
