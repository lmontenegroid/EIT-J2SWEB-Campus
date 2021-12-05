package clase4;

import java.util.Date;
import java.util.Scanner;

import clase3.Alumno;
import clase3.Documento;
import clase3.Persona;

public class AlumnoMain {
	
	public static void ingreso() {
		
		Scanner teclado = new Scanner(System.in);
		int cantidadAlumnos, cantidadCursos, dia, mes, anio;
		Date fechaIngreso;
		Persona[] listaAlumnos;
		Alumno alumno;
		String[] listaCursos;
		
		
		System.out.println("Cuantos alumnos desea ingresar?");
		cantidadAlumnos = teclado.nextInt();
		listaAlumnos = new Persona[cantidadAlumnos];
		
		
		
		for(int i=0; i<cantidadAlumnos; i++) {
			System.out.println("Ingresando al alumno N° " +(i+1));
			System.out.println("-------------------------------");
			
			alumno = new Alumno();
			
			PersonaMain.personaIngreso(alumno);
			
			System.out.println("Ingrese el dia de ingreso del alumno: ");
			dia = teclado.nextInt();
			
			System.out.println("Ingrese el mes de ingreso del alumno: ");
			mes = teclado.nextInt();
			
			System.out.println("Ingrese el año de ingreso del alumno: ");
			anio = teclado.nextInt();
						
			fechaIngreso = new Date(anio-1900, mes, dia,0,0,0);
			alumno.setFechaIng(fechaIngreso);
			

			System.out.println("Ingrese la cantidad de Cursos a registrar: ");
			cantidadCursos = teclado.nextInt();
			listaCursos = new String[cantidadCursos];
			
			for(int j=0; j<cantidadCursos; j++) {
				System.out.println("Ingrese el curso N° " +(j+1));
				listaCursos[j] = teclado.next();
				
				
			}
			
			alumno.setListaCursos(listaCursos);
			
			listaAlumnos[i] = alumno;
	
		}
		
		
		for(Persona a : listaAlumnos) {
			System.out.println(a.toString());
		}
		
		
		
	}

}
