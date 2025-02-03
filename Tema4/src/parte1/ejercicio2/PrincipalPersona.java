package parte1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		// Creamos dos personas.
		Persona pers1 = new Persona();
		Persona pers2 = new Persona();

		// Creamos el Scanner para leer cada dato de las dos personas.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el dni de la persona 1 y lo leemos.
		System.out.print("Introduce el dni de la 1º persona: ");
		pers1.dni = sc.nextLine();

		// Le pedimos al usuario que introduzca el nombre de la persona 1 y lo leemos.
		System.out.print("Introduce el nombre de la 1º persona: ");
		pers1.nombre = sc.nextLine();

		// Le pedimos al usuario que introduzca el apellido de la persona 1 y lo leemos.
		System.out.print("Introduce el apellido de la 1º persona: ");
		pers1.apellido = sc.nextLine();

		// Le pedimos al usuario que introduzca la edad de la persona 1 y lo leemos.
		System.out.print("Introduce la edad de la 1º persona: ");
		pers1.edad = sc.nextInt();

		/*
		 * DATOS DE LA 2º PERSONA.
		 */

		// Le pedimos al usuario que introduzca el dni de la persona 2 y lo leemos.
		System.out.print("Introduce el dni de la 2º persona: ");
		pers2.dni = sc.nextLine();

		// Le pedimos al usuario que introduzca el nombre de la persona 2 y lo leemos.
		System.out.print("Introduce el nombre de la 2º persona: ");
		pers2.nombre = sc.nextLine();

		// Le pedimos al usuario que introduzca el apellido de la persona 2 y lo leemos.
		System.out.print("Introduce el apellido de la 2º persona: ");
		pers2.apellido = sc.nextLine();

		// Le pedimos al usuario que introduzca la edad de la persona 2 y lo leemos.
		System.out.print("Introduce la edad de la 2º persona: ");
		pers2.edad = sc.nextInt();

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
