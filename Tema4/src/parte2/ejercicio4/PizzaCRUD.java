package parte2.ejercicio4;

import java.util.HashSet;

public class PizzaCRUD {

	// Creamos el conjunto pedidosPizza para almacenar todos los pedidos de una
	// pizzeria.
	HashSet<Pizza> pedidosPizza = new HashSet<Pizza>();

	/**
	 * Esta función se encarga de recorrer todo el conjunto e imprimir cada pedido.
	 */
	public void listadoPizza() {
		// Creamos un bucle for-each para recorrer el conjunto de pedidos e ir mostrando
		// uno a uno.
		for (Pizza pizza : pedidosPizza) {
			System.out.println(pizza);
			System.out.println("----------------------");
		}
	}

	/**
	 * Esta función se encarga de añadir un objeto pizza al conjunto pedidosPizza.
	 * 
	 * @param pizza El objeto pizza añadido como parametro.
	 * @return true si se ha añadido correctamente, false si no lo ha hecho.F
	 */
	public boolean añadirPizza(Pizza pizza) {
		// Devolvemos un boleano indicandonos si la pizza se ha añadido al conjunto.
		return pedidosPizza.add(pizza);
	}

	/**
	 * Esta función se encarga de buscar en el conjunto un objeto pizza con el mismo
	 * codigo que el pasado como parametro.
	 * 
	 * @param codigo El codigo que se debe de corresponder al codigo del objeto.
	 * @return El objeto en caso de encontrarlo. Null, si no encuentra ningun objeto
	 *         con ese codigo.
	 */
	public Pizza buscarPizza(int codigo) {

		// Declaramos un objeto Pizza.
		Pizza p = null;

		// Recorremos el conjunto de pedidos.
		for (Pizza pizza : pedidosPizza) {
			// Compruebo si el codigo de la pizza que estamos recorriendo es igual al pasado
			// como parametro.
			if (pizza.getCodigo() == codigo) {
				p = pizza;
			}
		}

		// Devolvemos el objeto Pizza p.
		return p;
	}
}
