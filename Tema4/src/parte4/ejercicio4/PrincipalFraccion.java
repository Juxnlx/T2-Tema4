package parte4.ejercicio4;

public class PrincipalFraccion {

	public static void main(String[] args) {

		// Creando fracciones
        Fraccion f1 = new Fraccion(3, 4);  // 3/4
        Fraccion f2 = new Fraccion(5, 6);  // 5/6
        Fraccion f3 = new Fraccion(-2, 3); // -2/3
        Fraccion f4 = new Fraccion(4, -8); // Se normaliza a -1/2

        // Mostrando las fracciones creadas
        System.out.println("Fracción 1: " + f1);
        System.out.println("Fracción 2: " + f2);
        System.out.println("Fracción 3: " + f3);
        System.out.println("Fracción 4 (simplificada): " + f4);

        // Operaciones
        System.out.println("\n--- Operaciones ---");
        System.out.println("Suma: " + f1 + " + " + f2 + " = " + f1.suma(f2));
        System.out.println("Resta: " + f1 + " - " + f2 + " = " + f1.resta(f2));
        System.out.println("Multiplicación: " + f1 + " * " + f3 + " = " + f1.multiplica(f3));
        System.out.println("División: " + f1 + " / " + f3 + " = " + f1.dividir(f3));

	}

}
