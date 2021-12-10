package clase5.principal;

import java.util.Date;
import java.util.Scanner;

import clase5.Exceptions.MetodosExcepciones;
import clase5.entidades.Administrativo;
import clase5.entidades.Alumno;
import clase5.entidades.Director;
import clase5.entidades.Documento;
import clase5.entidades.Persona;
import clase5.entidades.Profesor;

public class Main {

	public static void main(String[] args) {
		
		//Ingreso por consola del usuario
		Scanner teclado = new Scanner(System.in);
		
		//La DB donde se va a ir guardando como un array de personas
		Persona[] personas;
		int cantidadPersonas;
		
		System.out.println("Ingrese qué cantidad de personas desea cargar :");
		cantidadPersonas = teclado.nextInt();
		
		//Instancio el array con la cantidad de personas
		personas = new Persona[cantidadPersonas];
		
		
		//Auxiliares para armar los parámetros de la persona
		String nombre, apellido, tipoDoc, numDoc;
		Documento documento;
		Date fechaNac;
		Date fechaCargo;
		float sueldo;
		
		//Empieza la carga de personas iterando
		for(int i=0; i<cantidadPersonas; i++) {
			
			// objeto auxiliar para instanciar luego
			Persona persona = null;
			
			//El user elije que persona cargar
			System.out.println("Ingreso tipo de Persona:");
			System.out.println("1 - Alumno.");
			System.out.println("2 - Director.");
			System.out.println("3 - Profesor.");
			System.out.println("4 - Administrativo.");
			System.out.println();
			int tipoPersona = teclado.nextInt();
			
			//Empieza la carga
			System.out.println("Ingresando persona N° " + (i+1));
			System.out.println("----------------");
			
			System.out.println("Ingrese el nombre: ");
			nombre = teclado.next();
			
			System.out.println("Ingrese el apellido: ");
			apellido = teclado.next();
			
			//Ingresando tipo documento
			tipoDoc = MetodosExcepciones.documentoValido();
			
			System.out.println("Ingrese el numero de documento: ");
			numDoc = teclado.next();
			
			System.out.println("Ingresando la fecha de nacimiento: ");
			fechaNac = MetodosExcepciones.obtenerFecha();
			
			
			//Instancio los objetos para setear en lo que sigue
			documento = new Documento(tipoDoc, numDoc);
			
			
			//Segun el tipo de persona ingresado, el sistema armará lo solicitado
			switch(tipoPersona) {
				case 1:
					//Atributos del alumno
					Date fechaIng;
					String[] listaCursos;
					int cantidadCursos;
					

					//Lógica de ingreso restante
					System.out.println("Ingresando la fecha de ingreso: ");
					fechaIng = MetodosExcepciones.obtenerFecha();
					
					System.out.println("Ingrese la cantidad de cursos del alumno: ");
					cantidadCursos = teclado.nextInt();
					listaCursos = new String[cantidadCursos];
					
					for(int j=0; j<cantidadCursos; j++) {
						System.out.println("Ingrese el nombre del curso N° " + (j+1));
						listaCursos[j] = teclado.next();
					}
					
					System.out.println("--------------------");
					
					//Seteo e instacio la info de Persona en Alumno
					persona = new Alumno(nombre, apellido, documento, fechaNac, fechaIng, listaCursos);
					personas[i] = persona;
					break;
				
				
				case 2:
					//Atributos del director
					String carrera;
					

					//Lógica de ingreso restante
					System.out.println("Ingresando la fecha de cargo: ");
					fechaCargo = MetodosExcepciones.obtenerFecha();
					
					System.out.println("Ingrese el sueldo del director: ");
					sueldo = teclado.nextFloat();
					
					System.out.println("Ingrese la carrera a cargo");
					carrera = teclado.next();
					
					
					System.out.println("--------------------");
					
					//Seteo e instacio la info de Persona en Director
					persona = new Director(nombre, apellido, documento, fechaNac, fechaCargo, sueldo, carrera);
					personas[i] = persona;
					break;
					
					
				case 3:
					//Atributos del profesor
					String[] cursos;
					

					//Lógica de ingreso restante
					System.out.println("Ingresando la fecha de cargo: ");
					fechaCargo = MetodosExcepciones.obtenerFecha();
					
					System.out.println("Ingrese el sueldo del director: ");
					sueldo = teclado.nextFloat();
					
					System.out.println("Ingrese la cantidad de cursos del profesor: ");
					cantidadCursos = teclado.nextInt();
					
					cursos = new String[cantidadCursos];
					
					for(int j=0; j<cantidadCursos; j++) {
						System.out.println("Ingrese el nombre del curso N° " + (j+1));
						cursos[j] = teclado.next();
					}
					
					
					System.out.println("--------------------");
					
					//Seteo e instacio la info de Persona en Director
					persona = new Profesor(nombre, apellido, documento, fechaNac, fechaCargo, sueldo, cursos);
					personas[i] = persona;
					break;
					
					
				case 4:
	
					//Lógica de ingreso restante
					System.out.println("Ingresando la fecha de cargo: ");
					fechaCargo = MetodosExcepciones.obtenerFecha();
					
					System.out.println("Ingrese el sueldo del administrativo: ");
					sueldo = teclado.nextFloat();
					
					System.out.println("--------------------");
					
					//Seteo e instacio la info de Persona en administrativo
					persona = new Administrativo(nombre, apellido, documento, fechaNac, fechaCargo, sueldo);
					personas[i] = persona;
					break;
			}
			
		}
		for(Persona aux : personas) {
			System.out.println(aux.toString());
			System.out.println(aux.mostrarTipoPersona());
			System.out.println("--------------------");
		}
		
		teclado.close();

	}

}
