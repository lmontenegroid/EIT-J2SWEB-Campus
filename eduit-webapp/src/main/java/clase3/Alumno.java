package clase3;

import java.util.Arrays;

public class Alumno extends Persona {
	
	//Atributos
	private String[] listaCursos;

	
	//Constructor
	public Alumno(String nombre, String apellido, Documento doc, int edad, String[] listaCursos) {
		super(nombre, apellido, doc, edad);
		this.listaCursos = listaCursos;
	}
	
	

	@Override
	public String toString() {
		return  super.toString() + "Ocupación: Alumno\nCursos\n" + Arrays.toString(listaCursos);
	}



	//Getters y Setters
	public String[] getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(String[] listaCursos) {
		this.listaCursos = listaCursos;
	}
	
	
	
	
	
	
}
