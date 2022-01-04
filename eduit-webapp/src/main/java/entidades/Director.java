package entidades;

import java.util.Date;

public class Director extends Empleado {
	
	//Atributo
	private String carrera;

	
	//Constructor
	public Director(String nombre, String apellido, Documento documento, Date nacimiento, 
			Date ingreso, float sueldo, String carrera) {
		super(nombre, apellido, documento, nacimiento, ingreso, sueldo);
		this.carrera = carrera;
	}
	
	
	//Método toString
	@Override
	public String toString() {
		return super.toString() +"\nCarrera: " + carrera + "\nRol: Director\n";
	}


	//------------------------------------------------
	//Métodos implementados (por ahora no harán nada)
	@Override
	public void guardar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void tipoPersona() {
		System.out.println(getNombre() + " " + getApellido() + " es Director");
	}
	//------------------------------------------------


	
	//Getters y Setters
	//---------------------------------------------
	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	//---------------------------------------------
	
	
	

}
