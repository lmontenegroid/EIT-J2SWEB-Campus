package clase3;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona {

	// Atributos
	private Date fechaIng;
	private String[] listaCursos;

	// Constructor
	public Alumno(String nombre, String apellido, Documento doc, Date fechaNac, Date fechaIng, String[] listaCursos) {
		super(nombre, apellido, doc, fechaNac);
		this.fechaIng = fechaIng;
		this.listaCursos = listaCursos;
	}

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() +"Fecha de Ingreso: " + fechaIng + "\nOcupación: Alumno\nCursos\n" + Arrays.toString(listaCursos);
	}

	// Getters y Setters

	public Date getFechaIng() {
		return fechaIng;
	}

	public void setFechaIng(Date fechaIng) {
		this.fechaIng = fechaIng;
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
		System.out.println("Ocupación: Alumno" );
	}
}
