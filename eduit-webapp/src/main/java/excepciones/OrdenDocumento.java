package excepciones;

import java.util.Comparator;

import entidades.Persona;

public class OrdenDocumento implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		// se compara el tipo de documento
		int tipo = persona1.getDocumento().getTipo().toString().compareTo(persona2.getDocumento().getTipo().toString());

		// si los documentos son iguales compara los numeros de lo contrario ordenara
		// primero por la cadena de caracter del tipo
		if (tipo == 0) {
			return persona1.getDocumento().getNumero() - persona2.getDocumento().getNumero();
		}

		return tipo;
	}

}