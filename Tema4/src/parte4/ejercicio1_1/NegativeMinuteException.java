package parte4.ejercicio1_1;

public class NegativeMinuteException extends Exception {
	
	@Override
	public String toString() {
		return "Los minutos son negativos.";
	}
	
	@Override
	public String getMessage() {
		return "Los minutos son negativos.";
	}
}