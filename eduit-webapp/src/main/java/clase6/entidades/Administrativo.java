package clase6.entidades;

import java.util.Date;


public class Administrativo extends Empleado {

	
	/* --> Atributos heredados de Empleado
	 * @param nombre
	 * @param apellido
	 * @param documento
	 * @param fechaNacimiento
	 * @param fechaCargo
	 * @param sueldo
	 * @param carrera
	 */

	// Constructores
	public Administrativo() {
	}	
	
	public Administrativo(String nombre, String apellido, Documento documento, Date fechaNacimiento,
			Date fechaCargo, Float sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
	}
	

	//Método toString
	@Override
	public String toString() {
		return super.toString() + "Administrativo\n";
	}

	
	//Método heredado de Empleado y Persona
	@Override
	public String mostrarTipoPersona() {
		return getNombre() + " " + getApellido() + " es Administrativo\n";
	}
	
	
	//Método redefinido que se comporta según la interfaz IModificadores
	@Override
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Administrativo");

	}

	//Método redefinido que se comporta según la interfaz IModificadores
	@Override
	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Administrativo");

	}

	//Método redefinido que se comporta según la interfaz IModificadores
	@Override
	public void modificar() {
		System.out.println("Se ha modificado correctamente el Administrativo");

	}
	

}
