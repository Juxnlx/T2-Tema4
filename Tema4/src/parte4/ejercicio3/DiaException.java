package parte4.ejercicio3;

public class DiaException extends Exception {
	@Override
	public String toString() {
		return "El dia introducido no es valido.";
	}
	
	@Override
	public String getMessage() {
		return "El dia introducido no es valido.";
	}
}
