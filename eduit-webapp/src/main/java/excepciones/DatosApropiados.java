package excepciones;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import enumerados.Tipo;

public class DatosApropiados {
	
	private static Integer id = 0;

	public static Scanner teclado = new Scanner(System.in);

	// La fecha apropiada solicita los datos al usuario y se encarga de que sea una
	// fecha de almanaque correcta, en caso de ingresar datos erróneos, los volverá
	// a solicitar. No reconoce años bisiestos
	public static Date fechaApropiada() {

		// Atributos a utilizar
		int dia = 0, mes = 0, anio = 0; // Instanciamos para que no salte error

		do {// Carga el año y se encarga de los errores
			System.out.println("Ingrese un año entre 1900 y 2021");
			anio = soloInt();
			if (anio != 0) {
				if (anio < 1900 || anio > 2021) {
					System.err.println("El año tiene que oscilar entre 1900 y 2021");
					anio = 0;
				}
			}
		} while (anio == 0);

		do {// Carga el mes y se encarga de los errores
			System.out.println("Ingrese un mes entre 1 y 12");
			mes = soloInt();
			if (mes != 0) {
				if (mes < 1 || mes > 12) {
					System.err.println("El mes tiene que oscilar entre 1 y 12");
					mes = 0;
				}
			}
		} while (mes == 0);

		do {// carga el día y se encarga que sea un día de almanaque
			System.out.println("Ingrese el dia: ");
			dia = soloInt();
			if (mes == 2) {
				if (dia > 28 || dia < 1) {
					System.err.println("El mes 2 posee un maximo de 28 dias");
					dia = 0;
				}
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia < 1 || dia > 30) {
					System.err.println("El dia tiene que oscilar entre 1 y 30");
					dia = 0;
				}
			} else if (dia > 31) {
				System.err.println("El dia tiene que oscilar entre 1 y 31");
				dia = 0;
			}
		} while (dia == 0);

		return new Date(anio, mes, dia);
	}

	public static Tipo documentoValido(){
		String tipoDoc = "";

		while (tipoDoc.equals("")){
			
			System.out.println("Tipos de documentos válidos: DNI, LE, CI, PAS ");
			System.out.println("Ingrese el tipo de documento: ");
			tipoDoc = teclado.next();
			tipoDoc = tipoDoc.toLowerCase();

			if (tipoDoc.equals("dni"))
				return Tipo.DNI;
			else if (tipoDoc.equals("le"))
				return Tipo.LE;
			else if (tipoDoc.equals("ci"))
				return Tipo.CI;
			else if (tipoDoc.equals("pas"))
				return Tipo.PAS;
			else {
				tipoDoc = "";
				System.err.println("Ingreso mal los datos");
			}
		} 

		return Tipo.DNI;

	}
	
	
	public void cursos(String curso) {
		HashMap<String, Integer> cursos = new HashMap<>();
		
		
		
		
	}
	
	


	// soloInt se fija en que si el usuario ingresa un no entero,
	// que el programa no vuele, si no que devolverá un cero como valor
	// en caso que sea un entero, devuelve el entero mismo
	public static int soloInt() {

		String aux = "";
		if (teclado.hasNextInt()) {
			return teclado.nextInt();
		} else {
			aux = teclado.next();
			System.err.println("Ingrese un dato int");
			return 0;
		}
	}
}
