package clase5.entidades;

import java.util.Date;

public abstract class Empleado extends Persona {
	
	//Atributos
	private Date fechaCargo;
	private Float sueldo;

	
	//Constructores
	public Empleado() {
	}

	/* --> Atributos heredados de Persona + Empleado 
	 * @param nombre
	 * @param apellido
	 * @param documento
	 * @param fechaNacimiento
	 * @param fechaCargo
	 * @param sueldo
	 */
	
	public Empleado(String nombre, String apellido, Documento documento, 
		Date fechaNacimiento, Date fechaCargo, Float sueldo) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
	}
	
	
	//Método toString
	@Override
	public String toString() {
		return "Empleado " + super.toString() + "Fecha de incio en cargo: " + fechaCargo + "\nSueldo: " + sueldo + "\n";
	}

	
	//Getters y Setters
	public Date getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public Float getSueldo() {
		return sueldo;
	}

	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}

}
