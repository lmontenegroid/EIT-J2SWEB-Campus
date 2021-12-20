package clase6.principal;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import clase6.excepciones.Excepciones;
import clase6.entidades.Administrativo;
import clase6.entidades.Alumno;
import clase6.entidades.Director;
import clase6.entidades.Documento;
import clase6.entidades.Persona;
import clase6.entidades.Profesor;
import clase6.enums.TiposDocumento;

public class AppMain {

	public static void main(String[] args) {

		// Ingreso por consola del usuario
		Scanner teclado = new Scanner(System.in);

		// La DB donde se va a ir guardando como una colección de personas
		Set<Persona> personas = new LinkedHashSet<>();
		int cantidadPersonas;

		System.out.println("Ingrese qué cantidad de personas desea cargar :");
		cantidadPersonas = teclado.nextInt();

		// Auxiliares para armar los parámetros de la persona
		String nombre, apellido, numDoc;
		TiposDocumento tipoDoc;
		Documento documento;
		Date fechaNac;
		Date fechaCargo;
		float sueldo;

		// Empieza la carga de personas iterando
		for (int i = 0; i < cantidadPersonas; i++) {

			// objeto auxiliar para instanciar luego
			Persona persona = null;

			// El user elije que persona cargar
			System.out.println("Ingreso tipo de Persona:");
			System.out.println("1 - Alumno.");
			System.out.println("2 - Director.");
			System.out.println("3 - Profesor.");
			System.out.println("4 - Administrativo.");
			System.out.println();
			int tipoPersona = teclado.nextInt();

			// Empieza la carga
			System.out.println("Ingresando persona N° " + (i + 1));
			System.out.println("----------------");

			System.out.println("Ingrese el nombre: ");
			nombre = teclado.next();

			System.out.println("Ingrese el apellido: ");
			apellido = teclado.next();

			// Ingresando tipo documento
			tipoDoc = Excepciones.documentoValido();

			System.out.println("Ingrese el numero de documento: ");
			numDoc = teclado.next();

			System.out.println("Ingresando la fecha de nacimiento: ");
			fechaNac = Excepciones.obtenerFecha();

			// Instancio los objetos para setear en lo que sigue
			documento = new Documento(tipoDoc, numDoc);

			// Segun el tipo de persona ingresado, el sistema armará lo solicitado
			switch (tipoPersona) {
			case 1:
				// Atributos del alumno
				Date fechaIng;
				LinkedHashSet<String> listaCursos;
				int cantidadCursos;

				// Lógica de ingreso restante
				System.out.println("Ingresando la fecha de ingreso: ");
				fechaIng = Excepciones.obtenerFecha();

				System.out.println("Ingrese la cantidad de cursos del alumno: ");
				cantidadCursos = teclado.nextInt();
				listaCursos = new LinkedHashSet<>();

				for (int j = 0; j < cantidadCursos; j++) {
					System.out.println("Ingrese el nombre del curso N° " + (j + 1));
					listaCursos.add(teclado.next());
				}

				System.out.println("--------------------");

				// Seteo e instacio la info de Persona en Alumno
				persona = new Alumno(nombre, apellido, documento, fechaNac, fechaIng, listaCursos);
				personas.add(persona);
				break;

			case 2:
				// Atributos del director
				String carrera;

				// Lógica de ingreso restante
				System.out.println("Ingresando la fecha de cargo: ");
				fechaCargo = Excepciones.obtenerFecha();

				System.out.println("Ingrese el sueldo del director: ");
				sueldo = teclado.nextFloat();

				System.out.println("Ingrese la carrera a cargo");
				carrera = teclado.next();

				System.out.println("--------------------");

				// Seteo e instacio la info de Persona en Director
				persona = new Director(nombre, apellido, documento, fechaNac, fechaCargo, sueldo, carrera);
				personas.add(persona);
				break;

			case 3:
				// Atributos del profesor
				LinkedHashSet<String> cursos = new LinkedHashSet<>();

				// Lógica de ingreso restante
				System.out.println("Ingresando la fecha de cargo: ");
				fechaCargo = Excepciones.obtenerFecha();

				System.out.println("Ingrese el sueldo del director: ");
				sueldo = teclado.nextFloat();

				System.out.println("Ingrese la cantidad de cursos del profesor: ");
				cantidadCursos = teclado.nextInt();


				for (int j = 0; j < cantidadCursos; j++) {
					System.out.println("Ingrese el nombre del curso N° " + (j + 1));
					cursos.add(teclado.next());
				}

				System.out.println("--------------------");

				// Seteo e instacio la info de Persona en Director
				persona = new Profesor(nombre, apellido, documento, fechaNac, fechaCargo, sueldo, cursos);
				personas.add(persona);
				break;

			case 4:

				// Lógica de ingreso restante
				System.out.println("Ingresando la fecha de cargo: ");
				fechaCargo = Excepciones.obtenerFecha();

				System.out.println("Ingrese el sueldo del administrativo: ");
				sueldo = teclado.nextFloat();

				System.out.println("--------------------");

				// Seteo e instacio la info de Persona en administrativo
				persona = new Administrativo(nombre, apellido, documento, fechaNac, fechaCargo, sueldo);
				personas.add(persona);
				break;
			}

		}
		for (Persona aux : personas) {
			System.out.println(aux.toString());
			System.out.println(aux.mostrarTipoPersona());
			System.out.println("--------------------");
		}

		teclado.close();

	}

}
