package enumerados;

public enum Tipo {
	
	//Atributos
	DNI("Documento Nacional de Identidad"),
	LE("Libreta de Enrolamiento"),
	CI("Cédula de Identidad"),
	PAS("Pasaporte");
	private String descripcion; //Contiene el String interno del enum
	
	//Internamente guarda la descripcion del enum
	private Tipo(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//Get que devuelve la descripcion del enum
	public String getDescripcion() {
		return descripcion;
	}
	
	
	
	
}
