package clase4;

import java.util.Date;
import java.util.Scanner;

import clase3.Alumno;
import clase3.Documento;
import clase3.Persona;

public class PersonaMain {
	
	public static void personaIngreso(Persona persona) {
		
		Scanner teclado = new Scanner(System.in);
		
		String tipoDoc, numDoc;
		Documento documento;
		int dia, mes, anio;
		Date fechaNac;
		
		System.out.println("Ingrese el nombre: ");
		persona.setNombre(teclado.next());
		System.out.println("Ingrese el apeliido: ");
		persona.setApellido(teclado.next());
		
		System.out.println("Ingrese el tipo de Documento: ");
		tipoDoc = teclado.next();
		System.out.println("Ingrese el número de Documento: ");
		numDoc = teclado.next();
		documento = new Documento(tipoDoc, numDoc);
		persona.setDoc(documento);
		
		System.out.println("Ingrese el dia de nacimiento: ");
		dia = teclado.nextInt();
		
		System.out.println("Ingrese el mes de nacimiento: ");
		mes = teclado.nextInt();
		
		System.out.println("Ingrese el año de nacimiento: ");
		anio = teclado.nextInt();
		
		fechaNac = new Date(anio-1900, mes, dia,0,0,0);
		persona.setFechaNac(fechaNac);
	}
		
	

}
