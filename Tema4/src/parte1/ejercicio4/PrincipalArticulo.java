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
		System.out.println(art1.getNombre() + " - Precio:" + art1.getPrecio() + " - IVA:" + Articulo.IVA + "% - PVP:"
				+ (((Articulo.IVA * art1.getPrecio()) / 100) + art1.getPrecio()));

		// Modificamos el precio del articulo.
		art1.setPrecio(art1.getPrecio()-12);

		// Volvemos a imprimir el articulo
		System.out.println("Articulo con precio modificado -->");
		System.out.println(art1.getNombre() + " - Precio:" + art1.getPrecio() + " - IVA:" + Articulo.IVA + "% - PVP:"
				+ (((Articulo.IVA * art1.getPrecio()) / 100) + art1.getPrecio()));

		// Imprimimos la información el articulo.
		System.out.println("\n2º Articulo");
		System.out.println(art2.getNombre() + " - Precio:" + art2.getPrecio() + " - IVA:" + Articulo.IVA + "% - PVP:"
				+ (((Articulo.IVA * art2.getPrecio()) / 100) + art2.getPrecio()));

		// Modificamos el precio del articulo.
		art2.setPrecio(art2.getPrecio()-10);

		// Volvemos a imprimir el articulo
		System.out.println("Articulo con precio modificado -->");
		System.out.println(art2.getNombre() + " - Precio:" + art2.getPrecio() + " - IVA:" + Articulo.IVA + "% - PVP:"
				+ (((Articulo.IVA * art2.getPrecio()) / 100) + art2.getPrecio()));
	}

}
