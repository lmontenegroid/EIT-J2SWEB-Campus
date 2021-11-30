package clase3;

public class Persona {
	
	//Atributo de clase
	private static int contador=0;
	
	//Atributos
	private int id;
	private String nombre;
	private String apellido;
	private Documento doc;
	private int edad;
	
	//Constructores
	public Persona() {
	}
	
	public Persona(String nombre, String apellido, Documento doc, int edad) {
		contador++;
		id=contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.doc = doc;
		this.edad = edad;
	}


	@Override
	public String toString() {
		return id+"-\nNombre: " + nombre + "\nApellido: " + apellido + "\n" 
				+ doc.toString() + "Edad: " + edad + "\n";
	}

	
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

	public Documento getDoc() {
		return doc;
	}

	public void setDoc(Documento doc) {
		this.doc = doc;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
