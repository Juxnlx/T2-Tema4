package parte1.ejercicio4;

public class PrincipalArticulo {

	public static void main(String[] args) {

		// Creamos un articulo.
		Articulo art1 = new Articulo();

		// Asignamos la información de dicho articulo.
		art1.nombre = "Cascos";
		art1.precio = 86;
		art1.cuantosQuedan = 4;

		// Imprimimos la información el articulo.
		System.out.println("1º Articulo");
		System.out.println(art1.nombre + " - Precio:" + art1.precio + " - IVA:" + art1.IVA + "% - PVP:"
				+ (((art1.IVA * art1.precio) / 100) + art1.precio));

		// Modificamos el precio del articulo.
		art1.precio = 72;

		// Volvemos a imprimir el articulo
		System.out.println("\nArticulo con precio modificado");
		System.out.println(art1.nombre + " - Precio:" + art1.precio + " - IVA:" + art1.IVA + "% - PVP:"
				+ (((art1.IVA * art1.precio) / 100) + art1.precio));
	}

}
