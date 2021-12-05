package clase4;

import java.util.Arrays;
import java.util.Date;

import clase3.Documento;
import clase3.Persona;

public class Profesor extends Persona {
	
	//Atributos
	private Date fechaCargo;
	private float sueldo;
	private String[] listaCursos;
	
	//Constructor
	public Profesor(String nombre, String apellido, Documento doc, Date fechaNac, Date fechaCargo, float sueldo, String[] listaCursos) {
		super(nombre, apellido, doc, fechaNac);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
		this.listaCursos = listaCursos;
	}
	
	

	@Override
	public String toString() {
		return  super.toString() + "Ocupación: Profesor\nFecha de inicio en el cargo: " + fechaCargo
				+ "\nSueldo: " +sueldo+ "\nLista de cursos: \n" + Arrays.toString(listaCursos);
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
	
	public String[] getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(String[] listaCursos) {
		this.listaCursos = listaCursos;
	}
	
	
	@Override
	public void reconocimiento() {
		super.reconocimiento();
		System.out.println("Ocupación: Profesor" );
	}
	
	
}
