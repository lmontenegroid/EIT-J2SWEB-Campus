package clase6.entidades;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Alumno extends Persona {

	// Atributos
	private Date fechaIng;
	private LinkedHashSet<String> listaCursos;

	/*
	 * --> Atributos heredados de Persona + Alumno
	 * 
	 * @param nombre
	 * 
	 * @param apellido
	 * 
	 * @param documento
	 * 
	 * @param fechaNacimiento
	 * 
	 * @param fechaIng
	 * 
	 * @param listaCursos
	 */

	// Constructores
	public Alumno() {
	}

	public Alumno(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaIng,
			LinkedHashSet<String> listaCursos) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.fechaIng = fechaIng;
		this.listaCursos = listaCursos;
	}

	// Método toString
	@Override
	public String toString() {
		return super.toString() + "Fecha de Ingreso: " + fechaIng + "\nOcupación: Alumno\nCursos\n" + listaCursos
				+ "\n";
	}

	// Método heredado de Empleado y Persona
	@Override
	public String mostrarTipoPersona() {
		return getNombre() + " " + getApellido() + " es Alumno\n";
	}

	// Método redefinido que se comporta según la interfaz IModificadores
	@Override
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Alumno");

	}

	// Método redefinido que se comporta según la interfaz IModificadores
	@Override
	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Alumno");

	}

	// Método redefinido que se comporta según la interfaz IModificadores
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

}
