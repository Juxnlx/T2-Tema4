package parte3.ejercicio5;

import java.util.Scanner;

public class PrincipalRandom {

	public static void main(String[] args) {
		// Creamos un objeto de tipo Aleatoriedad
		Aleatoriedad numerosRandom = new Aleatoriedad();

		// Creamos la variable cantNum como int para almacenar la cantidad de
		// números que queremos generar.
		int cantNum;

		// Creamos la variable valorMin como int para almacenar el valor de número
		// aleatorio minimo a generar.
		int valorMin;

		// Creamos la variable valorMax como int para almacenar el valor de número
		// aleatorio maximo a generar.
		int valorMax;

		// Creamos el Scanner para leer la cantidad de números a generar y el valor
		// maximo y minimo a generar.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la cantidad de números que quiere
		// generar y los leemos.
		System.out.print("Introduce la cantidad de números a generar --> ");
		cantNum = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor minimo de número aleatorio a
		// generar y lo leemos.
		System.out.print("Introduce el valor mínimo de aleatorio --> ");
		valorMin = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor maximo de número aleatorio a
		// generar y lo leemos.
		System.out.print("Introduce el valor máximo de aleatorio --> ");
		valorMax = sc.nextInt();

		System.out.println("\n-----RESULTADOS-----");
		System.out.print("Secuencia de " + cantNum + " numeros entre (0 y 1) --> " );
		numerosRandom.numerosAleatorios(cantNum);
		
		System.out.print("\nSecuencia de " + cantNum + " numeros entre (0 y " + valorMax + ") --> ");
		numerosRandom.numerosAleatorios(cantNum, valorMax);
		
		System.out.print("\nSecuencia de " + cantNum + " numeros entre (" + valorMin + " y " + valorMax + ") --> ");
		numerosRandom.numerosAleatorios(cantNum, valorMin, valorMax);
		
		//Cierre de Scanner
		sc.close();
	}

}
