package parte3.ejercicio6;

import java.util.Scanner;

public class PrincipalFMate {

	public static void main(String[] args) {

		// Creamos la variable numEntero como int para almacenar el valor introducido
		// por el usuario.
		int numEntero;

		// Creamos la variable numDouble como double para almacenar el valor introducido
		// por el usario.
		double numDouble;

		// Creamos la variable elevado como int para almacenar el valor al que vamos a
		// elevar el número.
		int elevado;

		// Creamos el Scanner para leer los números introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario hasta que número desea que sumemos y lo leemos.
		System.out.print("Introduce hasta que número quieres sumar: ");
		numEntero = sc.nextInt();
		// Imprimimos el resultado haciendo una llamada a la función sumatorio.
		System.out.println("Sumatoria de números entre 1 y " + numEntero + ": "
				+ FuncionesMatematicas.sumatorio(numEntero) + "\n");

		// Le pedimos al usuario que introduzca un número y a que otro número desea
		// exponerlo y lo leemos.
		System.out.print("Introduce un número para luego elevarlo: ");
		numDouble = sc.nextDouble();
		System.out.print("Introduce el exponente al que elevar dicho número: ");
		elevado = sc.nextInt();
		// Imprimimos el resultado haciendo una llamada a la función potencia, para
		// saber el resultado de dicha ecuación.
		System.out.println("Potencia de " + numDouble + " elevado a " + elevado + ": "
				+ FuncionesMatematicas.potencia(numDouble, elevado) + "\n");

		// Le pedimos al usuario que introduzca la posición del valor que desea saber
		// que correponda a fibonacci.
		System.out.print("Fibonacci - Introduce la posición: ");
		numEntero = sc.nextInt();
		// Imprimimos el resultado haciendo una llamada a la función serieFibonacci para
		// saber el número que corresponde a dicha posición.
		System.out.println("La posición " + numEntero + " corresponde en la secuencia de fibonacci a: "
				+ FuncionesMatematicas.serieFibonacci(numEntero));

		// Cierre de Scanner
		sc.close();
	}

}
