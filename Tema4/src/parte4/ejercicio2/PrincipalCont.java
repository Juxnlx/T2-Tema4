package parte4.ejercicio2;

public class PrincipalCont {

	public static void main(String[] args) {

		Contador cont1 = new Contador(-1);
		Contador cont2 = new Contador(0);
		Contador cont3 = new Contador(1);

		cont1.incrementar();
		cont2.incrementar();
		cont3.incrementar();
		
		//CONTADORES INCREMENTADOS
		System.out.println("Contadores incrementados -->");
		System.out.println(cont1);
		System.out.println(cont2);
		System.out.println(cont3 + "\n");
		
		cont1.decrementar();
		cont2.decrementar();
		cont3.decrementar();
		
		//CONTADORES DECREMENTADOS
		System.out.println("Contadores decrementados -->");
		System.out.println(cont1);
		System.out.println(cont2);
		System.out.println(cont3);
		
	}

}
