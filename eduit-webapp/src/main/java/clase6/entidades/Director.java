package clase6.entidades;

import java.util.Date;


public class Director extends Empleado {

	// Atributos
	private String carrera;
	
	/* --> Atributos heredados de Empleado + Director 
	 * @param nombre
	 * @param apellido
	 * @param documento
	 * @param fechaNacimiento
	 * @param fechaCargo
	 * @param sueldo
	 * @param carrera
	 */

	// Constructores
	public Director() {
	}	
	
	public Director(String nombre, String apellido, Documento documento, Date fechaNacimiento,
			Date fechaCargo, Float sueldo, String carrera) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.carrera = carrera;
	}
	

	//Método toString
	@Override
	public String toString() {
		return super.toString() + "Director de la carrera: " + carrera + "\n";
	}

	
	//Método heredado de Empleado y Persona
	@Override
	public String mostrarTipoPersona() {
		return getNombre() + " " + getApellido() + " es Director\n";
	}
	
	
	//Método redefinido que se comporta según la interfaz IModificadores
	@Override
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Director");

	}

	//Método redefinido que se comporta según la interfaz IModificadores
	@Override
	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Director");

	}

	//Método redefinido que se comporta según la interfaz IModificadores
	@Override
	public void modificar() {
		System.out.println("Se ha modificado correctamente el Director");

	}
	

	// Getters y Setters
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


}
