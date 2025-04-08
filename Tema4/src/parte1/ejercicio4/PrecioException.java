package parte1.ejercicio4;

public class PrecioException extends Exception {
	@Override
	public String toString() {
		return "El precio introducido es negativo.";
	}
	
	@Override
	public String getMessage() {
		return "El precio introducido es negativo.";
	}
}
