package entidades;

import java.util.Date;

public class Administrativo extends Empleado { //Es igual a Empleados pero no es abstracto
											   //por si ma�ana se agrega nuevos campos se diferencia

	//Constructor heredado
	public Administrativo(String nombre, String apellido, Documento documento, Date nacimiento, Date ingreso,
			float sueldo) {
		super(nombre, apellido, documento, nacimiento, ingreso, sueldo);
	}
	
	//M�todo toString
	@Override
	public String toString() {
		return super.toString() + "\nRol: Administrativo\n";
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
		System.out.println(getNombre() + " " + getApellido() + " es Administrativo");
	}

	//------------------------------------------------
}
