package clase3;

import java.util.Date;

public class Persona {

	// Atributo de clase
	//private static int contador = 0;

	// Atributos
	//private int id;
	private String nombre;
	private String apellido;
	private Documento doc;
	private Date fechaNac;

	// Constructores
	public Persona() {
	}

	public Persona(String nombre, String apellido, Documento doc, Date fechaNac) {
		//contador++;
		//id = contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.doc = doc;
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return /*id+*/ "-\nNombre: " + nombre + "\nApellido: " + apellido + "\n" + doc.toString() + "Fecha de nacimiento: "
				+ fechaNac + "\n";
	}

	// Getters y Setters
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

	public Documento getDoc() {
		return doc;
	}

	public void setDoc(Documento doc) {
		this.doc = doc;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public void reconocimiento() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
	}

	public Persona[] guardar(Persona[] listaPersona, Persona persona) {

		for(int i=0; i<listaPersona.length;i++) {
			if(listaPersona[i]==null) {
				listaPersona[i] = persona;
			}
		}
		return listaPersona;
	}

	public Persona[] eliminar(Persona[] listaPersona, int posicion) {

		int cantidadPersonas = listaPersona.length-1;
		Persona[] nuevaLista = new Persona[cantidadPersonas];
		
		int i=0, j=0;
		for(Persona p : listaPersona) {
			if(i!=posicion) {
				nuevaLista[j] = p;
				i++;
				j++;
			}else {
				i++;
			}
		}

		return nuevaLista;
	}
	
	
	public Persona[] modificar(Persona[] listaPersona, Persona persona, int posicion) {

		listaPersona[posicion] = persona;
		
		return listaPersona;
	}
	
	
	

}
