package parte4.ejercicio1_1;

public class PrincipalHora {

	public static void main(String[] args) {

		Hora hora1 = null;
		
		try {
			hora1 = new Hora(5, 30, 30);
			
			hora1.setHora(-5);
			hora1.setMinuto(-30);
			hora1.setSegundo(-50);
			
		} catch (NegativeHourException e) {
			System.out.println(e.getMessage());
		} catch (NegativeMinuteException e) {
			System.out.println(e.getMessage());
		} catch (NegativeSecondException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(hora1);

	}

}
