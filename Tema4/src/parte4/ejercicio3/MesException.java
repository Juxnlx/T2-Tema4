package parte4.ejercicio3;

public class MesException extends Exception {
	@Override
	public String toString() {
		return "El mes introducido no es valido.";
	}
	
	@Override
	public String getMessage() {
		return "El mes introducido no es valido.";
	}
}