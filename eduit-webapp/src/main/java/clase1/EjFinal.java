package clase1;

import java.util.Scanner;

public class EjFinal {
	public static void main(String[] args) {
		
		
		int cantNotas;
		double sumaNotas=0, promedio, notaMayor=-1, notaMenor=11;
		String nombreMayor="", nombreMenor="";
		double[] nota;
		String[] nombre;
		
		double auxNotas;
		String auxNombre;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de notas");
		cantNotas = teclado.nextInt();
		
		nota = new double[cantNotas];
		nombre = new String[cantNotas];
		
		for(int i=0; i<cantNotas; i++) {
			System.out.println("Ingrese el nombre del alumno N° "+ (i+1));
			nombre[i] = teclado.next();
			
			System.out.println("Ingrese la nota del alumno N° "+ (i+1));
			nota[i] = teclado.nextDouble();
			
			sumaNotas += nota[i];
			
			if(notaMayor < nota[i]) {
				notaMayor = nota[i];
				nombreMayor = nombre[i];
			}
			
			if(notaMenor > nota[i]) {
				notaMenor = nota[i];
				nombreMenor = nombre[i];
			}

		}
		
		promedio = sumaNotas/cantNotas;
		System.out.println("El promedio de las notas general es de " +promedio);
		
		System.out.println("La nota mayor es de " +notaMayor+ ", obtenida por " +nombreMayor);
		System.out.println("La nota menor es de " +notaMenor+ ", obtenida por " +nombreMenor);
		
		
		for(int i=0; i<cantNotas; i++) {
			for(int j=0; j<cantNotas; j++) {
				if(nota[i] < nota[j]) {
				
					auxNotas=nota[j];
					nota[j] = nota[i];
					nota[i] = auxNotas;
				
					auxNombre=nombre[j];
					nombre[j] = nombre[i];
					nombre[i] = auxNombre;
				}
			}
		}
		
		for(int i=0; i<cantNotas; i++) {
			System.out.println(nombre[i]);
			System.out.println(nota[i]);
		}
		
		teclado.close();
		
	}
	
	
}
