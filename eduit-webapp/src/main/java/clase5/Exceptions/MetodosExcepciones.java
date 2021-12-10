package clase5.Exceptions;

import java.util.Date;
import java.util.Scanner;

public class MetodosExcepciones {

	// Atributo de clase
	public static Scanner teclado = new Scanner(System.in);

	// Solicita al usuario una fecha y retorna el Date de la misma
	// Chequea que la fecha sea real
	public static Date obtenerFecha() {
		// Atributos
		int anio = 0, mes = 0, dia = 0;

		// Pedimos el año de la fecha, chequea un año válido
		do {
			try {
				System.out.println("Ingrese el año (entre 1900 y 2021): ");
				anio = teclado.nextInt();
			} catch (Exception e) {
				System.err.println("Debe ingresar un año entre 1900 y 2021  " + e.getMessage());
			}
		} while (anio <= 1900 || anio >= 2021);

		// Pedimos el mes de la fecha, chequea un mes válido
		do {
			try {
				System.out.println("Ingrese el mes (entre 1 y 12): ");
				mes = teclado.nextInt();
			} catch (Exception e) {
				System.err.println("Debe ingresar un mes entre 1 y 12 " + e.getMessage());
			}
		} while (mes <= 1 || mes >= 12);

		// Pedimos el día de la fecha, se chequea acorde al mes (no chequea bisiesto)
		do {
			try {

				System.out.println("Ingrese el dia: ");
				dia = teclado.nextInt();
				if (mes == 2) {
					while (dia > 28 || dia < 1) {
						System.err.println("el mes 2 posee un maximo de 28 dias");
						System.out.println("Ingrese el dia: ");
						dia = teclado.nextInt();
					}
				} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					while (dia < 1 || dia > 30) {
						System.err.println("Debe estar comprendido entre 1 y 30");
						System.out.println("Ingrese el dia: ");
						dia = teclado.nextInt();
					}
				} else
					while ((dia > 31)) {
						System.err.println("Debe estar comprendido entre 1 y 31");
						System.out.println("Ingrese el dia: ");
						dia = teclado.nextInt();
					}

			} catch (Exception e) {
				System.err.println("debe ingresar un dato valido: " + e.getMessage());
				dia = 0;
			}
		} while (dia == 0);

		return new Date(anio - 1900, mes - 1, dia);
	}

	public static String documentoValido() {
		String tipoDoc = "";

			try {
				System.out.println("Tipos de documentos válidos: DNI, LE, CI, PAS ");
				System.out.println("Ingrese el tipo de documento: ");
				tipoDoc = teclado.next();
				tipoDoc = tipoDoc.toLowerCase();

				while(!((tipoDoc.equals("dni")) || (tipoDoc.equals("pas"))) || (tipoDoc.equals("ci"))
						|| (tipoDoc.equals("le"))){
					System.err.println("Usted ingresó un tipo de documento no válido");
					System.out.println("Tipos de documentos válidos: DNI, LE, CI, PAS ");
					System.out.println("Ingrese el tipo de documento: ");
					tipoDoc = teclado.next();
					tipoDoc = tipoDoc.toLowerCase();
				}

			} catch (Exception e) {
				System.err.println("Usted tipeó cualquier cosa.");
			}


		return tipoDoc;
	}

}
