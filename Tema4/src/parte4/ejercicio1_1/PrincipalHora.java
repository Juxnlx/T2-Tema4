package parte4.ejercicio1_1;

public class PrincipalHora {

	public static void main(String[] args) {

		Hora hora1 = new Hora(23, 59, 59); 
		Hora hora2 = new Hora(23, 59, 58); 
		Hora hora3 = new Hora(23, 58, 59); 
		Hora hora4 = new Hora(22, 59, 59); 
		
		hora1.incrementarHora();
		hora2.incrementarHora();
		hora3.incrementarHora();
		hora4.incrementarHora();
		
		System.out.println(hora1);
		System.out.println(hora2);
		System.out.println(hora3);
		System.out.println(hora4);
	}

}
