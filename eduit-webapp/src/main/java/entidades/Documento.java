package entidades;

import enumerados.Tipo;

public class Documento {
	
	//Atributos
	private Integer numero;
	private Tipo tipo; //Enum
	
	//Constructor vacío
	public Documento() {}
	
	
	//Constructor con todos los parámetros
	public Documento(int numero, Tipo tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}
	
	
	//Método toString
	@Override
	public String toString() {
		return "\nTipo de documento: " + getTipo().getDescripcion() + "\nNúmero de documento: " 
				+ getNumero() + "\n";
	}
	


	//Getters y Setters
	//---------------------------------------------
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	//---------------------------------------------
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Documento other = (Documento) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
}
