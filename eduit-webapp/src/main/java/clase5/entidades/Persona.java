package clase5.entidades;

import java.util.Date;

import clase5.Interfaces.IModificadores;

public abstract class Persona implements IModificadores {

	//Atributos
	private String nombre;
	private String apellido;
	private Documento documento;
	private Date fechaNacimiento;
	
	
	//Constructores
	public Persona() {
	}

	public Persona(String nombre, String apellido, Documento documento, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	//Método toString
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + "\n" + documento.toString() 
		+ "Fecha de nacimiento: " + fechaNacimiento + "\n";
	}
	
	//Método abstracto a utilizar en los hijos de la clase Persona
	public abstract String mostrarTipoPersona();
	
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

}
