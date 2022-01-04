package entidades;

import java.util.Date;

import interfaces.Manipulacion;


public abstract class Persona implements Manipulacion{ //Clase abstracta que heredarán los hijos
	
	//Atributos
	private String nombre;
	private String apellido;
	private Documento documento; //Utiliza el objeto Documento como atributo de clase
	private Date nacimiento; //Considerar actualizar el tipo Date
	private Date ingreso; // Para los alumnos fecha de ingreso, para el resto fecha de ingreso al cargo
	
	
	//Constructor vacío (formalidad)
	public Persona() {
	}

	//Constructor con todos los atributos
	public Persona(String nombre, String apellido, Documento documento, Date nacimiento, Date ingreso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.nacimiento = nacimiento;
		this.ingreso = ingreso;
	}
	
	
	
	//Método toString
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + getDocumento().toString() 
				+ "Fecha de nacimiento: " + convertirFecha(getNacimiento()) + "\nFecha de ingreso: " 
				+ convertirFecha(getIngreso());
	}

	
	//Toma un Date (fecha) y lo convierte en un String legible dd/mm/aaaa
	private String convertirFecha(Date fecha) {
		int anio = fecha.getYear();
		int mes = fecha.getMonth();
		int dia = fecha.getDate();
		
		return dia +"/"+ mes + "/" + anio;
	}

	
	//Getters y Setters
	//---------------------------------------------
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

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public Date getIngreso() {
		return ingreso;
	}

	public void setIngreso(Date ingreso) {
		this.ingreso = ingreso;
	}
	
	//---------------------------------------------
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		return true;
	}
	
	
}
