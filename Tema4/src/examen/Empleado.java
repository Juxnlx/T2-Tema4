package examen;

import java.util.Objects;

public class Empleado {
	/**
	 * Creamos el atributo dni como String para almacenar el dni del empleado
	 */
	private String dni;

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del empleado.
	 */
	private String nombre;

	/**
	 * Creamos el atributo sueldoBase como double para almacenar el sueldo mensual
	 * de un empleado.
	 */
	private double sueldoBase;

	/**
	 * Creamos el atributo horasExtra como int para almacenar las horas de mas que
	 * ha trabajado un empleado.
	 */
	private int horasExtra;

	/**
	 * Creamos el atributo valorHExtra como double para almacenar el valor de una
	 * hora extra.
	 */
	private static double valorHExtra;

	/**
	 * Creamos el constructor con el parametro dni, para en clases futuras realizar
	 * modificaciones solicitando solo el dni.
	 * 
	 * @param dni DNI del empleado.
	 */
	public Empleado(String dni) {
		// Comprobamos si el dni es distinto de null y no tiene espacios en blanco.
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
	}

	/**
	 * Creamos un constructor con todos los parametros para crear nuevos empleados.
	 * 
	 * @param dni        El DNI del empleado.
	 * @param nombre     El nombre del empleado.
	 * @param sueldoBase El sueldo base del empleado.
	 * @param horasExtra Las horas de mas que ha trabajado un empleado.
	 */
	public Empleado(String dni, String nombre, double sueldoBase, int horasExtra) {
		// Comprobamos si el dni es distinto de null y no tiene espacios en blanco.
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		// Comprobamos si el nombre es distinto de null y no tiene espacios en blanco.
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		// Comprobamos si el sueldo base es mayor que 0.
		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}

		// Comprobamos si las horas extras son mayores o igual a 0.
		if (horasExtra >= 0) {
			this.horasExtra = horasExtra;
		}
	}

	/**
	 * Esta función se encarga de devolver el nombre del empleado.
	 * 
	 * @return El nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Esta función se encarga de modificar el nombre del empleado.
	 * 
	 * @param nombre El nuevo nombre del empleado.
	 */
	public void setNombre(String nombre) {
		// Comprobamos si el nombre es distinto de null y no tiene espacios en blanco.
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Esta función se encarga de devolver el sueldo base del empledo.
	 * 
	 * @return El sueldo base del empleado.
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * Esta función se encarga de modificar el sueldo base del empleado.
	 * 
	 * @param sueldoBase El nuevo sueldo base del empleado.
	 */
	public void setSueldoBase(double sueldoBase) {
		// Comprobamos si el sueldo base es mayor que 0.
		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}
	}

	/**
	 * Esta función se encarga de devolver las horas extra de un empleado.
	 * 
	 * @return Las horas extra de un empleado.
	 */
	public int getHorasExtra() {
		return horasExtra;
	}

	/**
	 * Esta función se encarga de modificar las horas extra de un empleado.
	 * 
	 * @param horasExtra Las nuevas horas extra de un empleado.
	 */
	public void setHorasExtra(int horasExtra) {
		// Comprobamos si las horas extras son mayores o igual a 0.
		if (horasExtra >= 0) {
			this.horasExtra = horasExtra;
		}
	}

	/**
	 * Esta función se encarga de devolver el dni del empleado.
	 * 
	 * @return El dni del empleado.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Esta función se encarga de devolver el valor de una hora extra.
	 * 
	 * @return EL valor de una hora extra.
	 */
	public static double getValorHExtra() {
		return valorHExtra;
	}

	/**
	 * Esta función se encarga de modificar el valor de una hora extra.
	 * 
	 * @param valorHExtra El nuevo valor de una hora extra.
	 */
	public static void setValorHExtra(double valorHExtra) {
		// Comprobamos si el valor de una hora extra es mayor que 0.
		if (valorHExtra > 0) {
			Empleado.valorHExtra = valorHExtra;
		}
	}

	/**
	 * Esta función se encarga de multiplicar la cantidad de horas extra por el
	 * valor de una hora extra.
	 * 
	 * @return EL valor economico solo de las horas extra.
	 */
	public double calcularComplemento() {

		// Creamos la variable complemento como double para almacenar el valor de las
		// horas extra por separado.
		double complemento;

		// Almacenamos en la función complemento la multiplicación de la cantidad de las
		// horas extra por el valor de una de ellas.
		complemento = this.horasExtra * Empleado.valorHExtra;

		// Devolvemos el valor almacenado en la variable complemento.
		return complemento;
	}

	/**
	 * Esta función se encarga de calcular el suedo bruto sumando el sueldo base mas
	 * las horas extra.
	 * 
	 * @return El sueldo total (sueldo base + horas extra).
	 */
	public double sueldoBruto() {
		// Creamos la variable sueldoTotal como double para alamcenar el sueldo total
		// mas las horas extras de un expleado.
		double sueldoTotal;

		// Calculamos el sueldo total sumando el sueldo base mas la llamada a la función
		// calcularComplemento que nos devuelve el valor de las horas extra.
		sueldoTotal = this.sueldoBase + calcularComplemento();

		// Devolvemos la variable sueldoTotal que es donde esta almacenado el sueldo
		// bruto.
		return sueldoTotal;
	}

	/**
	 * Esta función se encarga de mostrar los datos de un empleado por consola.
	 * 
	 * @return La información de un empleado.
	 */
	@Override
	public String toString() {
		// Creamos la variable infoEmpleado como String para almacenar en una cadena
		// toda la información de un empleado.
		String infoEmpleado;

		// Almacenamos en la variable infoEmpelado todos los datos del empleado.
		infoEmpleado = this.dni + " " + this.nombre + "\n";
		infoEmpleado += "Horas Extras: " + this.horasExtra + "\n";
		infoEmpleado += "Sueldo bruto: " + sueldoBruto();

		// Devolvemos la variable infoEmpleado con todos los datos del empleado.
		return infoEmpleado;
	}

	/**
	 * Esta función se encarga de devolver un valor unico para cada empleado.
	 * 
	 * @return El valor unico para cada empleado.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	/**
	 * Esta función se encarga de comprobar segun los dnis si dos empleados son
	 * iguales o no.
	 * 
	 * @return true si los empleados son iguales, false si no lo son.
	 */
	@Override
	public boolean equals(Object obj) {
		// Creaamos la variable esIgual como boolean para almacenar un valor boleano
		// indicando si dos empleados son iguales o no.
		boolean esIgual = false;

		// Casteamos el objeto pasado como parametro a uno de tipo Empleado.
		Empleado empl = (Empleado) obj;

		// Comprobamos si el dni del objeto pasado como parametro y del actual son
		// iguales, si es así devolvemos true.
		if (this.dni.equals(empl.dni)){
			esIgual = true;
		}

		// Devolvemos la variable esIgual.
		return esIgual;
	}

}
