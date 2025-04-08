package parte1.ejercicio4;

public class StockException extends Exception {
	@Override
	public String toString() {
		return "La cantidad de articulos no puede ser negativa.";
	}
	
	@Override
	public String getMessage() {
		return "La cantidad de articulos no puede ser negativa.";
	}
}
