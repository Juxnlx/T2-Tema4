package parte4.ejercicio3;

public class YearException extends Exception {
	@Override
	public String toString() {
		return "El año introducido no es valido.";
	}
	
	@Override
	public String getMessage() {
		return "El año introducido no es valido.";
	}
}
