package parte3.ejercicio5;

import java.util.Random;

public class Aleatoriedad {

	// Declaramos el Random como static para usarlo en las demas funciones.
	static Random rand = new Random();

	/**
	 * Esta función se encarga de imprimir 0 y 1 de forma aleatoria las veces que se
	 * le pase por parametro.
	 * 
	 * @param cantNumRandom Las veces que va a generar un número.
	 */
	public void numerosAleatorios(int cantNumRandom) {
		// Creamos la variable numAleatorio como int para almacenar el número aleatorio.
		int numAleatorio;

		// Creamos este bucle for para recorrer el bucle y generar un número aleatorio
		// tantas veces como indiquemos por parametro.
		for (int i = 0; i < cantNumRandom; i++) {
			// Asigamos a la variable numAleatorio un número aleatorio entre 0 y 1.
			numAleatorio = rand.nextInt(0, 2);
			// Imprimimos el número aleatorio generado.
			System.out.print(numAleatorio + ", ");
		}
	}

	/**
	 * Esta función se encarga de imprimir números entre 0 y el valor maximo
	 * introducido por parametro. Tantas veces como se pase por parametro.
	 * 
	 * @param cantNumRandom Las veces que se va a generar un número.
	 * @param valorMax      El valor máximo que se puede generar aleatoriamente.
	 */
	public void numerosAleatorios(int cantNumRandom, int valorMax) {
		// Creamos la variable numAleatorio como int para almacenar el número aleatorio.
		int numAleatorio;

		// Creamos este bucle for para generar números entre 0 y el valorMax tantas
		// veces como indiquemos por parametro.
		for (int i = 0; i < cantNumRandom; i++) {
			// Asigamos a la variable numAleatorio un número aleatorio entre 0 y valorMax.
			numAleatorio = rand.nextInt(0, valorMax + 1);
			// Imprimimos el número aleatorio generado.
			System.out.print(numAleatorio + ", ");
		}
	}

	/**
	 * 
	 * @param cantNumRandom Las veces que se va a generar un número.
	 * @param valorMax      El valor máximo que se puede generar aleatoriamente.
	 * @param valorMax      El valor mínimo que se puede generar aleatoriamente.
	 */
	public void numerosAleatorios(int cantNumRandom, int valorMin, int valorMax) {
		// Creamos la variable numAleatorio como int para almacenar el número aleatorio.
		int numAleatorio;

		// Creamos este bucle for para generar números entre valorMin y el valorMax
		// tantas veces como indiquemos por parametro.
		for (int i = 0; i < cantNumRandom; i++) {
			// Asigamos a la variable numAleatorio un número aleatorio entre valorMin y
			// valorMax.
			numAleatorio = rand.nextInt(valorMin, valorMax + 1);
			// Imprimimos el número aleatorio generado.
			System.out.print(numAleatorio + ", ");
		}
	}
}
