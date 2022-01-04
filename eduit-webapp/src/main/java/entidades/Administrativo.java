package entidades;

import java.util.Date;

public class Administrativo extends Empleado { //Es igual a Empleados pero no es abstracto
											   //por si mañana se agrega nuevos campos se diferencia

	//Constructor heredado
	public Administrativo(String nombre, String apellido, Documento documento, Date nacimiento, Date ingreso,
			float sueldo) {
		super(nombre, apellido, documento, nacimiento, ingreso, sueldo);
	}
	
	//Método toString
	@Override
	public String toString() {
		return super.toString() + "\nRol: Administrativo\n";
	}
	

	//------------------------------------------------
	//Métodos implementados (por ahora no harán nada)
	@Override
	public void guardar() {
		// TODO Auto-generated method stub

	}


	//Métodos implementados (por ahora no harán nada)
	@Override
	public void modificar() {
		// TODO Auto-generated method stub

	}

	//Métodos implementados (por ahora no harán nada)
	@Override
	public void eliminar() {
		// TODO Auto-generated method stub

	}
	
	
	@Override
	public void tipoPersona() {
		System.out.println(getNombre() + " " + getApellido() + " es Administrativo");
	}

	//------------------------------------------------
}
