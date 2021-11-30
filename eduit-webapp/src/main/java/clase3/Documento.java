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
	
	
	@Override
	public String toString() {
		return "Tipo de Documento: " + tipoDoc + "\nNúmero de Documento: " + numDoc + "\n";
	}


	
}
