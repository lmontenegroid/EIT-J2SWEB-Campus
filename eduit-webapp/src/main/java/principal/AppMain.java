package principal;

import java.util.Date;
import java.util.PriorityQueue;
import java.util.Scanner;

import entidades.Administrativo;
import entidades.Alumno;
import entidades.Director;
import entidades.Documento;
import entidades.Persona;
import entidades.Profesor;
import enumerados.Tipo;
import excepciones.DatosApropiados;
import excepciones.OrdenEdadDesc;

public class AppMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); // Ingreso por consola del usuario

		OrdenEdadDesc orden = new OrdenEdadDesc(); // setea el orden a utilizar
		PriorityQueue<Persona> personas = new PriorityQueue<>(orden); // instancia la queue ordenada

		// -----------------------------------
		// Atributos a utilizar para instanciar una "persona"
		String nombre, apellido, carrera;
		Tipo tipo;
		Date nacimiento, ingreso;
		Integer numero = 0, cantidad, cantidadCursos;
		Float sueldo;
		String[] cursos;
		// -----------------------------------

		// Para el ciclo for
		System.out.println("Ingrese la cantidad de personas que quiere cargar");
		cantidad = teclado.nextInt();

		// objeto auxiliar para instanciar luego
		Persona persona = null;

		// El user elije que persona cargar
		for (int i = 0; i < cantidad; i++) {
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

			System.out.println("Ingrese el tipo de documento: ");
			tipo = DatosApropiados.documentoValido(); // No pude hacer andar la excepcion propia

			
			//Chequea que no haya un numero de dni repetido 
			//--------------------------------------------
			do {
				System.out.println("Ingrese el número de documento: ");
				numero = teclado.nextInt();
				
				for (Persona aux : personas) {
					if(aux.getDocumento().getNumero() == numero) {
						System.err.println("Ingresó un dni ya cargado");
						numero = 0;
					}
				}
			} while (numero == 0);
			//--------------------------------------------
			

			// Llama al nacimiento apropiado
			System.out.println("Ingreando los datos de nacimiento...");
			nacimiento = DatosApropiados.fechaApropiada();

			// Llama al ingreso apropiado
			System.out.println("Ingreando los datos de ingreso...");
			ingreso = DatosApropiados.fechaApropiada();

			// Segun el valor tipo persona, hará distintas cargas
			switch (tipoPersona) {
			case 1: // Ingresa un alumno

				System.out.println("Ingrese la cantidad de cursos del alumno: ");
				cantidadCursos = teclado.nextInt();
				cursos = new String[cantidadCursos];

				// Cargando el array de cursos
				for (int j = 0; j < cantidadCursos; j++) {
					System.out.println("Ingrese el curso N° " + (j + 1));
					cursos[j] = teclado.next();
				}

				persona = new Alumno(nombre, apellido, new Documento(numero, tipo), nacimiento, ingreso, cursos);// instancio
																													// al
																													// alumno

				personas.add(persona);// Agrego a la queue
				break;

			case 2:// Ingresa un director

				// Agregando datos
				System.out.println("Ingrese el sueldo del director");
				sueldo = teclado.nextFloat();
				System.out.println("Ingrese la carrera del director");
				carrera = teclado.next();

				persona = new Director(nombre, apellido, new Documento(numero, tipo), nacimiento, ingreso, sueldo,
						carrera); // Instancio al direc

				personas.add(persona); // agrego a la queue
				break;

			case 3: // ingresa un profesor

				// Agregando datos
				System.out.println("Ingrese el sueldo del profesor");
				sueldo = teclado.nextFloat();

				System.out.println("Ingrese la cantidad de cursos del profesor: ");
				cantidadCursos = teclado.nextInt();
				cursos = new String[cantidadCursos];

				// Cargando el array de cursos
				for (int j = 0; j < cantidadCursos; j++) {
					System.out.println("Ingrese el curso N° " + (j + 1));
					cursos[j] = teclado.next();
				}

				persona = new Profesor(nombre, apellido, new Documento(numero, tipo), nacimiento, ingreso, sueldo,
						cursos); // Instancio al profe

				personas.add(persona); // agrego a la queue

				break;
			case 4:

				// Agregando datos
				System.out.println("Ingrese el sueldo del director");
				sueldo = teclado.nextFloat();

				persona = new Administrativo(nombre, apellido, new Documento(numero, tipo), nacimiento, ingreso,
						sueldo); // Instancio al admi

				personas.add(persona); // agrego a la queue

				break;
			default:
				System.out.println("INGRESASTE CUALQUIER COSA");
				break;
			}

		}

		while (!personas.isEmpty()) {
			System.out.println("Atendiendo a " + personas.poll());
			System.out.println("Quedan atender: \n" + personas);

		}

		teclado.close();

	}

}
