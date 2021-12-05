package clase3;

/*
1. Se requiere se haga un sistema que agregue alumnos con lo atributos heredados 
	de persona a una lista y se le pidan los siguientes datos:
2. Id (numérico entero único)
3. Nombre
4. Apellido
5. Tipo de Documento y Numero de Documento (crear un clase para este tipo de dato) 
	no debe poder heredarse.
6. Edad.
7. La clase alumno tendrá un atributo donde se le asignara una lista de cursos.
8. Deberá crear 1 solo constructor con todos los datos.
9. Se requiere que el sistema le asigne a través de una variable de clase un id 
	auto incrementable.
10. Se utilizara para el ejercicio el método toString de la clase Persona y 
	será redefinido en la clase hija..
11. Se debe mostrar cuantas personas se asignaron.
*/

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Alumno[] listaAlumnos;
		int cantidadAlumnos, edad, cantidadCursos;
		String nombre, apellido, tipoDoc, numDoc;
		Documento doc;
		String[] listaCursos;
		
		System.out.println("Ingrese el número de alumnos a registrar: ");
		cantidadAlumnos = teclado.nextInt();
		
		listaAlumnos = new Alumno[cantidadAlumnos];
		
		for(int i=0; i<cantidadAlumnos; i++) {
			System.out.println("Ingresando al alumno N° " +(i+1));
			System.out.println("-------------------------------");
			
			System.out.println("Ingrese el nombre: ");
			nombre = teclado.next();
			System.out.println("Ingrese el apeliido: ");
			apellido = teclado.next();
			
			System.out.println("Ingrese el tipo de Documento: ");
			tipoDoc = teclado.next();
			System.out.println("Ingrese el número de Documento: ");
			numDoc = teclado.next();
			doc = new Documento(tipoDoc, numDoc);
			
			System.out.println("Ingrese la edad: ");
			edad = teclado.nextInt();
			
			System.out.println("Ingrese la cantidad de Cursos a registrar: ");
			cantidadCursos = teclado.nextInt();
			listaCursos = new String[cantidadCursos];
			
			for(int j=0; j<cantidadCursos; j++) {
				System.out.println("Ingrese el curso N° " +(j+1));
				listaCursos[j] = teclado.next();
			}
			
			//listaAlumnos[i] = new Alumno(nombre, apellido, doc, edad, listaCursos);
		}
		
		for(Alumno a : listaAlumnos) {
			System.out.println(a.toString());
			System.out.println("---------------------------------");
		}
		

		
		teclado.close();
	}

}
