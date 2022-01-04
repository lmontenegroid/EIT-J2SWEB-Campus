package entidades;

import java.util.Date;

public abstract class Empleado extends Persona{ 
	
	//Atributos 
	private float sueldo;

	public Empleado(String nombre, String apellido, Documento documento, Date nacimiento, 
			Date ingreso, float sueldo) {
		super(nombre, apellido, documento, nacimiento, ingreso);
		this.sueldo = sueldo;
	}

	
	//Getters y Setters
	//---------------------------------------------
	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	//---------------------------------------------
	
	
	
	
	
}
