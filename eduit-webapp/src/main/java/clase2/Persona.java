package clase2;

public class Persona {
	//Atributos
	private String nombre;
	private String apellido;
	private Documento doc;
	private int edad;
	
	//Constructores
	public Persona() {
	}
	
	public Persona(String nombre, String apellido, Documento doc, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.doc = doc;
		this.edad = edad;
	}

	public Persona(String nombre, String apellido, Documento doc) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.doc = doc;
		this.edad = 18;
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
	
	
	//métodos útiles para el main
	public void informarPersona() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellido: " + getApellido());
		getDoc().mostrarDoc();
		System.out.println("Edad: " + getEdad());
	}
	
	public void esMayor() {
		if(getEdad()>=18) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
	}

}
