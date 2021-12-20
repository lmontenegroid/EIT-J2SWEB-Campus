package clase6.entidades;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;

public class Profesor extends Empleado {
	private LinkedHashSet<String> cursos;

	/**
	 * 
	 */
	public Profesor() {
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param documento
	 * @param fechaNacimiento
	 * @param fechaCargo
	 * @param sueldo
	 * @param cursos
	 */
	public Profesor(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo,
			Float sueldo, LinkedHashSet<String> cursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.cursos = cursos;
	}

	// Método toString
	@Override
	public String toString() {
		return super.toString() + "Ocupación: Profesor\nCursos\n" + cursos + "\n";
	}

	@Override
	public String mostrarTipoPersona() {
		return getNombre() + " " + getApellido() + " es Profesor";
	}

	@Override
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Profesor");

	}

	@Override
	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Profesor");

	}

	@Override
	public void modificar() {
		System.out.println("Se ha modificado correctamente el Profesor");

	}

	public LinkedHashSet<String> getCursos() {
		return cursos;
	}

	public void setCursos(LinkedHashSet<String> cursos) {
		this.cursos = cursos;
	}

}