package clase5.entidades;

public final class Documento {

	// Atributos
	public String tipoDocumento;
	public String numDocumento;

	
	// Constructores
	public Documento(String tipoDocumento, String numDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
	}

	public Documento() {
	}

	
	//Método toString
	@Override
	public String toString() {
		return "Tipo de Documento: " + tipoDocumento + "\nNúmero de Documento: " + numDocumento + "\n";
	}
}
