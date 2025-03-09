package parte4.ejercicio4;

public class Fraccion {

	/**
	 * Creamos el atributo numerador como int para almacenar la parte superior de
	 * una fracción.
	 */
	private int numerador;

	/**
	 * Creamos el atributo denominador como int para almacenar la parte inferior de
	 * una fracción.
	 */
	private int denominador;

	/**
	 * Creamos un constructor con todos los parametros.
	 * 
	 * @param numerador   La parte superior de una fracción.
	 * @param denominador La parte inferior de una fracción.
	 */
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;

		// Comprobamos si el denominador de la fracción es mayor que 0.
		if (denominador > 0) {
			this.denominador = denominador;
		}
	}

	/**
	 * Esta función se encarga de devolver el valor del númerador de la fracción.
	 * 
	 * @return El valor del númerador de la fracción
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * Esta función se encarga de modificar el númerador de la fracción.
	 * 
	 * @param numerador El nuevo numerador de la fracción.
	 */
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	/**
	 * Esta función se encarga de devolver el valor del denominador de la fracción.
	 * 
	 * @return El valor del denominador de la fracción.
	 */
	public int getDenominador() {
		return denominador;
	}

	/**
	 * Esta función se encarga de modificar el denominador de la fracción.
	 * 
	 * @param denominador El nuevo denominador de la fracción.
	 */
	public void setDenominador(int denominador) {
		// Comprobamos si el denominador de la fracción es mayor que 0.
		if (denominador > 0) {
			this.denominador = denominador;
		}
	}

	/**
	 * Esta función se encarga de sumar la fraccion actual y la pasada como
	 * parametro.
	 * 
	 * @param f La fracción pasada como parametro.
	 * @return Devolvemos la suma de las dos funciones.
	 */
	public Fraccion suma(Fraccion f) {
		// Declaramos un objeto de tipo Fracción como resultado para crear la fración a
		// devolver con la suma realizada y simplificada.
		Fraccion resultado;

		// Creamos la variable nuevoNumerador como int para almacenar el nuevo valor del
		// numerador de la nueva fracción.
		int nuevoNumerador;

		// Creamos la variable nuevoDenominador como int para almacenar el nuevo valor
		// del denominador de la nueva fracción.
		int nuevoDenominador;

		// Calculamos el númerador de la suma de estas dos fracciones.
		nuevoNumerador = (this.numerador * f.denominador) + (this.denominador * f.numerador);

		// Calculamos el denominador de la suma de estas dos fracciones.
		nuevoDenominador = this.denominador * f.denominador;

		// Creamos la fracción resultante de la suma de las dos fracciones.
		resultado = new Fraccion(nuevoNumerador, nuevoDenominador);

		// Llamamos a la función simplifica para simplificar esta función antes de
		// devolverla.
		resultado.simplifica();

		// Devolvemos la fraccion formada a partir de las dos sumas.
		return resultado;
	}

	/**
	 * Esta función se encarga de restar la fraccion actual y la pasada como
	 * parametro.
	 * 
	 * @param f La fracción pasada como parametro.
	 * @return Devolvemos la resta de las dos funciones.
	 */
	public Fraccion resta(Fraccion f) {
		// Declaramos un objeto de tipo Fracción como resultado para crear la fración a
		// devolver con la resta realizada y simplificada.
		Fraccion resultado;

		// Creamos la variable nuevoNumerador como int para almacenar el nuevo valor del
		// numerador de la nueva fracción.
		int nuevoNumerador;

		// Creamos la variable nuevoDenominador como int para almacenar el nuevo valor
		// del denominador de la nueva fracción.
		int nuevoDenominador;

		// Calculamos el númerador de la resta de estas dos fracciones.
		nuevoNumerador = (this.numerador * f.denominador) - (this.denominador * f.numerador);

		// Calculamos el denominador de la resta de estas dos fracciones.
		nuevoDenominador = this.denominador * f.denominador;

		// Creamos la fracción resultante de la resta de las dos fracciones.
		resultado = new Fraccion(nuevoNumerador, nuevoDenominador);

		// Llamamos a la función simplifica para simplificar esta función antes de
		// devolverla.
		resultado.simplifica();

		// Devolvemos la fraccion formada a partir de las dos restas.
		return resultado;
	}

	/**
	 * Esta función se encarga de multiplicar la fraccion actual y la pasada como
	 * parametro.
	 * 
	 * @param f La fracción pasada como parametro.
	 * @return Devolvemos la multiplicacion de las dos funciones.
	 */
	public Fraccion multiplica(Fraccion f) {
		// Declaramos un objeto de tipo Fracción como resultado para crear la fración a
		// devolver con la multiplicacion realizada y simplificada.
		Fraccion resultado;

		// Creamos la variable nuevoNumerador como int para almacenar el nuevo valor del
		// numerador de la nueva fracción.
		int nuevoNumerador;

		// Creamos la variable nuevoDenominador como int para almacenar el nuevo valor
		// del denominador de la nueva fracción.
		int nuevoDenominador;

		// Calculamos el númerador de la multiplicacion de estas dos fracciones.
		nuevoNumerador = this.numerador * f.numerador;

		// Calculamos el denominador de la multiplicacion de estas dos fracciones.
		nuevoDenominador = this.denominador * f.denominador;

		// Creamos la fracción resultante de la multiplicacion de las dos fracciones.
		resultado = new Fraccion(nuevoNumerador, nuevoDenominador);

		// Llamamos a la función simplifica para simplificar esta función antes de
		// devolverla.
		resultado.simplifica();

		// Devolvemos la fraccion formada a partir de las dos restas.
		return resultado;
	}

	/**
	 * Esta función se encarga de dividir la fraccion actual y la pasada como
	 * parametro.
	 * 
	 * @param f La fracción pasada como parametro.
	 * @return Devolvemos la división de las dos funciones.
	 */
	public Fraccion dividir(Fraccion f) {
		// Declaramos un objeto de tipo Fracción como resultado para crear la fración a
		// devolver con la división realizada y simplificada.
		Fraccion resultado;

		// Creamos la variable nuevoNumerador como int para almacenar el nuevo valor del
		// numerador de la nueva fracción.
		int nuevoNumerador;

		// Creamos la variable nuevoDenominador como int para almacenar el nuevo valor
		// del denominador de la nueva fracción.
		int nuevoDenominador;

		// Calculamos el númerador de la división de estas dos fracciones.
		nuevoNumerador = this.numerador * f.denominador;

		// Calculamos el denominador de la division de estas dos fracciones.
		nuevoDenominador = this.denominador * f.numerador;

		// Creamos la fracción resultante de la division de las dos fracciones.
		resultado = new Fraccion(nuevoNumerador, nuevoDenominador);

		// Llamamos a la función simplifica para simplificar esta función antes de
		// devolverla.
		resultado.simplifica();

		// Devolvemos la fraccion formada a partir de las dos restas.
		return resultado;
	}

	/**
	 * Esta función se encarga de simplificar una fracción.
	 */
	public void simplifica() {
		// Creamos la variable num1 como int para calcualr el valor simplificado del
		// númerador.
		int num1;

		// Creamos la variable num2 como int para calcular el valor simplificado del
		// denominador.
		int num2;

		// Creamos la variabel temp como int para almacenar el num2 de forma temporal.
		int temp;

		// Hacemos el valor absoluto a estos dos números para asegurarnos que el MCD se
		// va a hacer de forma adecuada.
		num1 = Math.abs(this.numerador);
		num2 = Math.abs(this.denominador);

		// CALCULAMOS EL MCD
		// Comprobamos si el denominador es distinto de 0, una vez que num2 sea 0, num1
		// contiene el MCD.
		while (num2 != 0) {
			// En nuestra variable temporal almacenamos el valor del denominador.
			temp = num2;
			// Calculamos el resto de la división de la fracción.
			num2 = num1 % num2;
			// El númerador siempre va a ser el denominador antes de actualizarse.
			num1 = temp;
		}

		// Ahora simplificamos el númerador y el denominador entre num1 que es el MCD.
		this.numerador /= num1;
		this.denominador /= num1;
	}

	/**
	 * Esta función se encarga de imprimir el númerador y denominar de una función.
	 * 
	 * @return una cadena mostrando el numerador y el denominador.
	 */
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
}
