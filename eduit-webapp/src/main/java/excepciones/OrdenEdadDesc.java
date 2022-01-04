package excepciones;

import java.util.Comparator;

import entidades.Persona;

public class OrdenEdadDesc implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		return persona1.getNacimiento().compareTo(persona2.getNacimiento());
	}

}
