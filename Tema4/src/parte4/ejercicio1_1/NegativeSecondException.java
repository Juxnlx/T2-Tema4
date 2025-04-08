package parte4.ejercicio1_1;

public class NegativeSecondException extends Exception {
	
	@Override
	public String toString() {
		return "Los segundos son negativos.";
	}
	
	@Override
	public String getMessage() {
		return "Los segundos son negativos.";
	}
}
