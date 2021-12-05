package clase4;

import java.util.Date;

import clase3.Documento;
import clase3.Persona;

public class Administrativo extends Persona {
	
	//Atributos
	private Date fechaCargo;
	private float sueldo;
	
	//Constructor
	public Administrativo(String nombre, String apellido, Documento doc, Date fechaNac, Date fechaCargo, float sueldo) {
		super(nombre, apellido, doc, fechaNac);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
	}
	
	

	@Override
	public String toString() {
		return  super.toString() + "Ocupación: Director\nFecha de inicio en el cargo: " + fechaCargo
				+ "\nSueldo: " +sueldo;
	}

	
	
	//Getters y Setters

	public Date getFechaCargo() {
		return fechaCargo;
	}



	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}


	
	public float getSueldo() {
		return sueldo;
	}



	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public void reconocimiento() {
		super.reconocimiento();
		System.out.println("Ocupación: Administrativo" );
	}
	
	
	
}
