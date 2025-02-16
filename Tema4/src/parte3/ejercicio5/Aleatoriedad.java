package parte3.ejercicio5;

import java.util.Random;

public class Aleatoriedad {

	public void numerosAleatorios(int cantNumRandom) {
		// Creamos la variable numAleatorio como int para almacenar el número aleatorio.
		int numAleatorio;

		// Creamos el objeto Random para generar números aleatorios comprendidos entre 0
		// y 1.
		Random rand = new Random();

		// Creamos este bucle for para recorrer el bucle y generar un número aleatorio
		// tantas veces como indiquemos por parametro.
		for (int i = 0; i < cantNumRandom; i++) {
			// Asigamos a la variable numAleatorio un número aleatorio entre 0 y 1.
			numAleatorio = rand.nextInt(0, 2);
			// Imprimimos el número aleatorio generado.
			System.out.print(numAleatorio + ", ");
		}
	}

	public void numerosAleatorios(int cantNumRandom, int valorMax) {
		// Creamos la variable numAleatorio como int para almacenar el número aleatorio.
		int numAleatorio;

		// Creamos el objeto Random para generar números aleatorios comprendidos entre 0
		// y el valorMax.
		Random rand = new Random();

		// Creamos este bucle for para generar números entre 0 y el valorMax tantas
		// veces como indiquemos por parametro.
		for (int i = 0; i < cantNumRandom; i++) {
			// Asigamos a la variable numAleatorio un número aleatorio entre 0 y valorMax.
			numAleatorio = rand.nextInt(0, valorMax + 1);
			// Imprimimos el número aleatorio generado.
			System.out.print(numAleatorio + ", ");
		}
	}

	public void numerosAleatorios(int cantNumRandom, int valorMin, int valorMax) {
		// Creamos la variable numAleatorio como int para almacenar el número aleatorio.
		int numAleatorio;

		// Creamos el objeto Random para generar números aleatorios comprendidos entre
		// valorMin y el valorMax.
		Random rand = new Random();

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
