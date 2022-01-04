package entidades;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona { 
	
	//Atributos
	private String[] cursos;

	//Constructor heredado
	public Alumno(String nombre, String apellido, Documento documento, Date nacimiento, Date ingreso,
			String[] cursos) {
		super(nombre, apellido, documento, nacimiento, ingreso);
		this.cursos = cursos;
	}
	
	//M�todo toString
	@Override
	public String toString() {
		return super.toString() +"\nCursos: \n" + Arrays.toString(cursos) + "\nRol: Alumno\n";
	}
	

	//------------------------------------------------
	//M�todos implementados (por ahora no har�n nada)
	@Override
	public void guardar() {
		// TODO Auto-generated method stub

	}


	//M�todos implementados (por ahora no har�n nada)
	@Override
	public void modificar() {
		// TODO Auto-generated method stub

	}

	//M�todos implementados (por ahora no har�n nada)
	@Override
	public void eliminar() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void tipoPersona() {
		System.out.println(getNombre() + " " + getApellido() + " es Alumno");
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
