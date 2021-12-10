package clase5.entidades;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Empleado {
	private String[] cursos;

	/**
	 * 
	 */
	public Profesor() {
		super();
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
			Float sueldo, String[] cursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Profesor [toString()=" + super.toString() + ", cursos=" + Arrays.toString(cursos) + "]";
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


	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	
}