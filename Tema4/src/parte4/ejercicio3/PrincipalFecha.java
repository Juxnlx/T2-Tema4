package parte4.ejercicio3;

import java.util.Scanner;

public class PrincipalFecha {

	public static void main(String[] args) {

		//Creamos la variable dia para almacenar el dia de un mes.
		int dia;
		
		//Creamos la variable mes para almacenar el mes de un año.
		int mes;
		
		//Creamos la variable año para lamacenar el año de una fecha.
		int año;
	
		//Creamos el Scanner para leer los datos de una fecha.
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario el dia mes y año.
		System.out.print("Introduce el dia de un mes --> ");
		dia = sc.nextInt();
		
		System.out.print("Introduce el mes de un año --> ");
		mes = sc.nextInt();
		
		System.out.print("Introduce un año --> ");
		año = sc.nextInt();
		
		Fecha f = new Fecha(dia, mes, año);
		
		if (f.fechaCorrecta()) {
			f.diaSiguiente();
			System.out.println(f);
		} else {
			System.out.println("La fecha introducida es incorrecta");
		}
		
		//Cierre de Scanner
		sc.close();
	}

}
