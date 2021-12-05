package clase3;

public final class Documento {
	
	//Atributos
	public String tipoDoc;
	public String numDoc;
	
	//Constructor
	public Documento(String tipoDoc, String numDoc) {
		this.tipoDoc = tipoDoc;
		this.numDoc = numDoc;
	}
	
	
	public Documento() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Tipo de Documento: " + tipoDoc + "\nNúmero de Documento: " + numDoc + "\n";
	}


	
}
