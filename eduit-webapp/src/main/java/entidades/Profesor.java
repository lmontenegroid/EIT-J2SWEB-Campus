package entidades;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Empleado {
	
	//Atributo
	private String[] cursos;

	
	//Constructor
	public Profesor(String nombre, String apellido, Documento documento, Date nacimiento, 
			Date ingreso, float sueldo, String[] cursos) {
		super(nombre, apellido, documento, nacimiento, ingreso, sueldo);
		this.cursos = cursos;
	}
	
	
	//Método toString
	@Override
	public String toString() {
		return super.toString() +"\nCursos: \n" + Arrays.toString(cursos) + "\nRol: Profesor\n";
	}


	//------------------------------------------------
	//Métodos implementados (por ahora no harán nada)
	@Override
	public void guardar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void tipoPersona() {
		System.out.println(getNombre() + " " + getApellido() + " es Profesor");
	}
	//------------------------------------------------
	
	
	//Getters y Setters
	//---------------------------------------------
	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	//---------------------------------------------
	
	
	

}
