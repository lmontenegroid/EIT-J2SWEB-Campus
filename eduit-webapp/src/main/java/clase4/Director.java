package clase4;

import java.util.Date;

import clase3.Documento;
import clase3.Persona;

public class Director extends Persona {
	
	//Atributos
	private Date fechaCargo;
	private String carrera;
	private float sueldo;
	
	//Constructor
	public Director(String nombre, String apellido, Documento doc, Date fechaNac, Date fechaCargo, String carrera,float sueldo) {
		super(nombre, apellido, doc, fechaNac);
		this.carrera = carrera;
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
	}
	
	

	@Override
	public String toString() {
		return  super.toString() + "Ocupación: Director\nFecha de inicio en el cargo: " + fechaCargo
				+"\nCarrera: " +carrera + "\nSueldo: " +sueldo+ "\n";
	}

	
	
	//Getters y Setters

	public Date getFechaCargo() {
		return fechaCargo;
	}



	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}


	public String getCarrera() {
		return carrera;
	}



	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	
	public float getSueldo() {
		return sueldo;
	}



	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}


	//Metodos utiles
	@Override
	public void reconocimiento() {
		super.reconocimiento();
		System.out.println("Ocupación: Director" );
	}

	
	
	




	
	

}
