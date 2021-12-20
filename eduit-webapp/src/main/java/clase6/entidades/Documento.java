package clase6.entidades;

import clase6.enums.TiposDocumento;

public final class Documento {

	// Atributos
	public TiposDocumento tipoDocumento;
	public String numDocumento;

	/**
	 * @param tipoDocumento
	 * @param numdocumento
	 */
	// Constructores
	public Documento(TiposDocumento tipoDocumento, String numDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
	}

	public Documento() {
	}

	
	//Método toString
	@Override
	public String toString() {
		return "Tipo de Documento: " + tipoDocumento.getDescripcion() + "\nNúmero de Documento: " + numDocumento + "\n";
	}
}
