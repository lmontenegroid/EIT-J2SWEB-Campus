package clase5.entidades;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona {

	// Atributos
	private Date fechaIng;
	private String[] listaCursos;

	/*
	 * --> Atributos heredados de Persona + Alumno
	 * @param nombre
	 * @param apellido
	 * @param documento
	 * @param fechaNacimiento
	 * @param fechaIng
	 * @param listaCursos
	 */

	// Constructores
	public Alumno() {
	}

	public Alumno(String nombre, String apellido, Documento doc, Date fechaNac, Date fechaIng, String[] listaCursos) {
		super(nombre, apellido, doc, fechaNac);
		this.fechaIng = fechaIng;
		this.listaCursos = listaCursos;
	}

	// M�todo toString
	@Override
	public String toString() {
		return super.toString() + "Fecha de Ingreso: " + fechaIng + "\nOcupaci�n: Alumno\nCursos\n"
				+ Arrays.toString(listaCursos);
	}
	

	// M�todo heredado de Empleado y Persona
	@Override
	public String mostrarTipoPersona() {
		return getNombre() + " " + getApellido() + " es Alumno\n";
	}

	// M�todo redefinido que se comporta seg�n la interfaz IModificadores
	@Override
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Alumno");

	}

	// M�todo redefinido que se comporta seg�n la interfaz IModificadores
	@Override
	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Alumno");

	}

	// M�todo redefinido que se comporta seg�n la interfaz IModificadores
	@Override
	public void modificar() {
		System.out.println("Se ha modificado correctamente el Alumno");

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

}
