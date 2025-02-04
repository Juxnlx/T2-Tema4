package parte1.ejercicio2;

import java.util.Scanner;

/**
 * Creamos dos objetos personas y pedimos la información al usuario por teclado
 * para rellenarlos.
 */
public class PrincipalPersona {

	public static void main(String[] args) {

		// Creamos dos personas.
		Persona pers1;
		Persona pers2;

		// Creamos la varible dni como String para almacenar el dni de la persona.
		String dni;

		// Creamos la variable nombre como String para almacenar el nombre de la
		// persona.
		String nombre;

		// Creamos la variable apellidos como String para almacenar el apellido de la
		// persona.
		String apellido;

		// Creamos la variable edad como int para almacenar la edad de la persona.
		int edad;

		// Creamos el Scanner para leer cada dato de las dos personas.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el dni de la persona 1 y lo leemos.
		System.out.print("Introduce el dni de la 1º persona: ");
		dni = sc.nextLine();

		// Le pedimos al usuario que introduzca el nombre de la persona 1 y lo leemos.
		System.out.print("Introduce el nombre de la 1º persona: ");
		nombre = sc.nextLine();

		// Le pedimos al usuario que introduzca el apellido de la persona 1 y lo leemos.
		System.out.print("Introduce el apellido de la 1º persona: ");
		apellido = sc.nextLine();

		// Le pedimos al usuario que introduzca la edad de la persona 1 y lo leemos.
		System.out.print("Introduce la edad de la 1º persona: ");
		edad = sc.nextInt();
		// Limpiamos el buffer.
		sc.nextLine();
		
		// Creamos la pers1 con los datos solicitados al usuario.
		pers1 = new Persona(dni, nombre, apellido, edad);

		/*
		 * DATOS DE LA 2º PERSONA.
		 */

		// Le pedimos al usuario que introduzca el dni de la persona 2 y lo leemos.
		System.out.print("Introduce el dni de la 2º persona: ");
		dni = sc.nextLine();

		// Le pedimos al usuario que introduzca el nombre de la persona 2 y lo leemos.
		System.out.print("Introduce el nombre de la 2º persona: ");
		nombre = sc.nextLine();

		// Le pedimos al usuario que introduzca el apellido de la persona 2 y lo leemos.
		System.out.print("Introduce el apellido de la 2º persona: ");
		apellido = sc.nextLine();

		// Le pedimos al usuario que introduzca la edad de la persona 2 y lo leemos.
		System.out.print("Introduce la edad de la 2º persona: ");
		edad = sc.nextInt();

		// Creamos la pers2 con los datos solicitados al usuario.
		pers2 = new Persona(dni, nombre, apellido, edad);

		System.out.println("\nPersonas introducidas por el usuario");

		// Imprimimos la primera persona
		System.out.println("Persona 1: " + pers1.nombre + " " + pers1.apellido + " con dni " + pers1.dni
				+ (pers1.edad < 18 ? " no es" : " es") + " mayor de edad.");

		// Imprimimos la segunda persona
		System.out.println("Persona 2: " + pers2.nombre + " " + pers2.apellido + " con dni " + pers2.dni
				+ (pers2.edad < 18 ? " no es" : " es") + " mayor de edad.");

		// Cierre de Scanner
		sc.close();
	}

}
