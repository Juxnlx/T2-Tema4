package parte1.ejercicio4;

/**
 * Esta clase crea dos objetos Articulo con distintos datos cada uno e
 * imprimimos su precio final y luego lo volvemos a mostrar pero con el precio
 * cambiado, eso de cada articulo.
 */
public class PrincipalArticulo {

	public static void main(String[] args) {

		// Creamos un articulo.
		Articulo art1 = new Articulo("Cascos", 86, 4);
		Articulo art2 = new Articulo("Sudadera", 25, -1);

		// Imprimimos la información el articulo.
		System.out.println("1º Articulo");
		System.out.println(art1.nombre + " - Precio:" + art1.precio + " - IVA:" + art1.IVA + "% - PVP:"
				+ (((art1.IVA * art1.precio) / 100) + art1.precio));

		// Modificamos el precio del articulo.
		art1.precio = 72;

		// Volvemos a imprimir el articulo
		System.out.println("Articulo con precio modificado -->");
		System.out.println(art1.nombre + " - Precio:" + art1.precio + " - IVA:" + art1.IVA + "% - PVP:"
				+ (((art1.IVA * art1.precio) / 100) + art1.precio));

		// Imprimimos la información el articulo.
		System.out.println("\n2º Articulo");
		System.out.println(art2.nombre + " - Precio:" + art2.precio + " - IVA:" + art2.IVA + "% - PVP:"
				+ (((art2.IVA * art1.precio) / 100) + art2.precio));

		// Modificamos el precio del articulo.
		art2.precio = 0;

		// Volvemos a imprimir el articulo
		System.out.println("Articulo con precio modificado -->");
		System.out.println(art2.nombre + " - Precio:" + art2.precio + " - IVA:" + art2.IVA + "% - PVP:"
				+ (((art2.IVA * art2.precio) / 100) + art2.precio));
	}

}
