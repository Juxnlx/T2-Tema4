package parte4.ejercicio1_1;

public class NegativeHourException extends Exception {
	
	@Override
	public String toString() {
		return "Las horas son negativas.";
	}
	
	@Override
	public String getMessage() {
		return "Las horas son negativas.";
	}
}