package clase2;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Persona p = new Persona();
		Documento doc;
		String tipoDoc;
		String numDoc;
		
		System.out.println("El programa pedirá los datos de una persona y luego los mostrará"
				+ "por pantalla, confirmando si es mayor o menor de edad");
		System.out.println("-------------------------------");
		
		System.out.println("Ingrese el nombre: ");
		p.setNombre(teclado.next());
		System.out.println("Ingrese el apeliido: ");
		p.setApellido(teclado.next());
		
		System.out.println("Ingrese el tipo de Documento: ");
		tipoDoc = teclado.next();
		System.out.println("Ingrese el número de Documento: ");
		numDoc = teclado.next();
		doc = new Documento(tipoDoc, numDoc);
		p.setDoc(doc);
		
		
		System.out.println("Ingrese la edad: ");
		p.setEdad(teclado.nextInt());
		
		System.out.println("----------------------------------");
		
		p.informarPersona();
		p.esMayor();
	
		teclado.close();
	}
	
	

}
