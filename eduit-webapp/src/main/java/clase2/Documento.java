package clase2;

public class Documento {
	
	//Atributos
	public String tipoDoc;
	public String numDoc;
	
	//Constructor
	public Documento(String tipoDoc, String numDoc) {
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;
	}
	
	
	//Mostrar
	public void mostrarDoc() {
		System.out.println("Tipo de Documento: " + tipoDoc);
		System.out.println("Número de Documento: " + numDoc);
	}


	
}
